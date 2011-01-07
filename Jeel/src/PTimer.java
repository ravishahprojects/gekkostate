/*************************************************************************
 * 
 * PTimer 
 * 
 * Author:  Stefan Pochmann
 * Date:    Nov 19, 2009
 * Version: 2.0
 * 
 * It's a simple timer very similar to the Speedstacks Stackmat. Keys
 * qwerasdfzxc and ALT are for the left hand, keys iop[kl;',./ and CTRL
 * are for the right hand.
 * 
 * Demo video:   http://www.youtube.com/watch?v=tZCo-33o2Pw
 * Forum thread: http://www.speedsolving.com/forum/showthread.php?t=16952
 * 
 * The "P" of "PTimer" is in a quantum superposition - until I decide,
 * it stands for both "Pochmann" and "Puzzle".
 * 
 * I hope the code is self-explanatory cause I don't feel like explaining it.
 *   
 *************************************************************************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PTimer extends JFrame {
  
  public static void main ( String[] args ) throws Exception {
    new PTimer();
  }

  //--- The GUI components
  PLight left, right;
  PLabel middle, bottom;

  PTimer () throws Exception {
  
    //--- Full screen
    setUndecorated( true );
    int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    setBounds( 0, 0, width, height );

    //--- Build and show the GUI    
    add( right  = new PLight( width/20 ), BorderLayout.EAST );
    add( left   = new PLight( width/20 ), BorderLayout.WEST );
    Panel center = new Panel( new BorderLayout() );
    add( center );
    center.add( middle = new PLabel( "PTimer", width/4, Color.RED ) );
    center.add( bottom = new PLabel( scramble(), width/35, Color.GRAY ), BorderLayout.SOUTH );
    setVisible( true );

    //--- Dance!
    while ( true ) {
    
      //--- Wait 0.01 seconds, then determine passed time in hundreds of seconds
      Thread.sleep( 10 );
      long hs = ( System.currentTimeMillis() - startTime ) / 10;

      //--- Go from WAIT_FOR_GREEN to WAIT_FOR_START after 0.7 seconds
      if ( phase == WAIT_FOR_GREEN && hs > 70 ) {
        phase = WAIT_FOR_START;
        updateLight( left, true );
        updateLight( right, true );
      }

      // While running, display the passed time
      if ( phase == WAIT_FOR_STOP  )
        middle.setText( String.format( "%d:%02d.%02d", hs/6000, hs/100%60, hs%100 ));
    }
  }

  //--- The phase we're in
  int WAIT_FOR_HANDS   = 1;
  int WAIT_FOR_GREEN   = 2;
  int WAIT_FOR_START   = 3;
  int WAIT_FOR_STOP    = 4;
  int WAIT_FOR_RELEASE = 5;
  int phase = WAIT_FOR_HANDS;
  
  //--- Start time, status of buttons
  long startTime;
  boolean leftPressed, rightPressed;

  //--- Show a light (black or red or green)
  void updateLight ( PLight light, boolean pressed ) {
    light.setBackground( pressed ? ( phase == WAIT_FOR_START ? Color.GREEN : Color.RED ) : Color.BLACK );
  }

  //--- Handle key events
  protected void processKeyEvent ( KeyEvent e ) {

    //--- Determine button status
    if( "qwerasdfzxc".contains( e.getKeyChar()+"" ) || e.getKeyCode() == e.VK_ALT )
      leftPressed = e.getID() != e.KEY_RELEASED;
    if( "iop[kl;',./".contains( e.getKeyChar()+"" ) || e.getKeyCode() == e.VK_CONTROL )
      rightPressed = e.getID() != e.KEY_RELEASED;
    boolean bothPressed = leftPressed && rightPressed;

    //--- Handle phase transitions
    if ( phase == WAIT_FOR_HANDS && bothPressed ) {
      startTime = System.currentTimeMillis();
      phase = WAIT_FOR_GREEN;
    }

    if ( phase == WAIT_FOR_GREEN && ! bothPressed )
      phase = WAIT_FOR_HANDS;
    
    if ( phase == WAIT_FOR_START && ! bothPressed ) {
      startTime = System.currentTimeMillis();
      phase = WAIT_FOR_STOP;
    }
    
    if ( phase == WAIT_FOR_STOP && bothPressed )
      phase = WAIT_FOR_RELEASE;

    if ( phase == WAIT_FOR_RELEASE && ! bothPressed ) {
      bottom.setText( scramble() );
      phase = WAIT_FOR_HANDS;
    }

    //--- Update the lights
    updateLight( left, leftPressed );
    updateLight( right, rightPressed );
  }
  
  //--- Generate a random scramble
  String scramble () {
    String scramble = "";
    for( int s=6, ps=6, pps=6; scramble.length()<75; pps=ps, ps=s ) {
      while ( s/2 == ps/2 && ( s==ps || s==pps ) ) s = (int) ( Math.random() * 6 ); 
      scramble += " " + "UDLRFB".charAt( s ) + "12'".charAt( (int) ( Math.random() * 3 ) );
    }
    return scramble.replaceAll( "^ |1", "" );
  }

  //--- Class for left/right lights
  class PLight extends Canvas {
    PLight ( int width ) {
      setSize( width, 1 );
      setBackground( Color.BLACK );
    }
  }
  
  //--- Class for timer and scramble display
  class PLabel extends JLabel {
    PLabel ( String text, int fontSize, Color color ) {
      setOpaque( true );
      setForeground( color );
      setBackground( Color.BLACK );
      setHorizontalAlignment( SwingConstants.CENTER );
      setFont( new Font( "Serif", 0, fontSize ) );
      setText( text );
    }
  }
}