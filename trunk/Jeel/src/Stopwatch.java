//: Stopwatch.java

// <applet code="Stopwatch.class" height=200 width=400></applet>
// (By the way, the applet tag is deprecated in HTML 4 in favor of object)

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/** A multithreaded GUI stopwatch.
 * Can be used as both an applet and an application.
 * @version CS2136 - Term D'00 - Assignment 5
 * @author Peter Cooper Jr.
 */
public class Stopwatch extends Applet {
    // All the components that need variable names
    private final Panel pnlTop = new Panel();
    private final Panel pnlBot = new Panel();
    private final Label lblDate = new Label();
    private final Label lblTime = new Label();
    private final Label lblWatch = new Label();
    private final Button btnGo = new Button("Start");
    private final Button btnReset = new Button("Reset");
    private final Label lblSplit = new Label();
    private final Button btnSplit = new Button("Split");
    private final Button btnSplitReset = new Button("Split Reset");
    private final Button btnLapAdd = new Button("New Lap");
    private final Button btnLapReset = new Button("Lap Reset");
    private final java.awt.List lstLaps = new java.awt.List();
    // My two daemon threads
    private final UpdateClockThread ucThread = new UpdateClockThread();
    private final StopwatchThread swThread = new StopwatchThread();

    /** Listens to the Start/Stop/Resume button.
     * @version CS2136 - Term D'00 - Assignment 5
     * @author Peter Cooper Jr.
     */
    private class btnGoListener implements ActionListener {
	/** Actually run when the button gets clicked.
	 *@param e The event
	 */
	public void actionPerformed(ActionEvent e) {
	    if ((btnGo.getLabel().equals("Start")) ||
		(btnGo.getLabel().equals("Resume"))) {
		// Start the clock!
		swThread.go();
		btnGo.setLabel("Stop");
		btnGo.setBackground(Color.red);
	    } else if (btnGo.getLabel().equals("Stop")) {
		// Stop the clock!
		swThread.noGo();
		btnGo.setLabel("Resume");
		btnGo.setBackground(Color.green);
	    }
	}
    }

    /** Listens to the Reset button.
     * @version CS2136 - Term D'00 - Assignment 5
     * @author Peter Cooper Jr.
     */
    private class btnResetListener implements ActionListener {
	/** Actually run when the button gets clicked.
	 *@param e The event
	 */
	public void actionPerformed(ActionEvent e) {
	    swThread.reset();
	    btnGo.setLabel("Start");
	    btnGo.setBackground(Color.green);
	}
    }

    /** Listens to the Split button.
     * @version CS2136 - Term D'00 - Assignment 5
     * @author Peter Cooper Jr.
     */
    private class btnSplitListener implements ActionListener {
	/** Actually run when the button gets clicked.
	 *@param e The event
	 */
	public void actionPerformed(ActionEvent e) {
	    lblSplit.setText(lblWatch.getText());
	}
    }

    /** Listens to the Split Reset button.
     * @version CS2136 - Term D'00 - Assignment 5
     * @author Peter Cooper Jr.
     */
    private class btnSplitResetListener implements ActionListener {
	/** Actually run when the button gets clicked.
	 *@param e The event
	 */
	public void actionPerformed(ActionEvent e) {
	    lblSplit.setText("");
	}
    }
    
    /** Listens to the Lap Add button.
     * @version CS2136 - Term D'00 - Assignment 5
     * @author Peter Cooper Jr.
     */
    private class btnLapAddListener implements ActionListener {
	/** Actually run when the button gets clicked.
	 *@param e The event
	 */
	public void actionPerformed(ActionEvent e) {
	    swThread.addLap();
	}
    }

    /** Listens to the Lap Reset button.
     * @version CS2136 - Term D'00 - Assignment 5
     * @author Peter Cooper Jr.
     */
    private class btnLapResetListener implements ActionListener {
	/** Actually run when the button gets clicked.
	 *@param e The event
	 */
	public void actionPerformed(ActionEvent e) {
	    swThread.resetLap();
	}
    }

    /** A thread that updates the current date & time.
     * @version CS2136 - Term D'00 - Assignment 5
     * @author Peter Cooper Jr.
     */
    private class UpdateClockThread extends Thread {
	/** The actual work of the thread.
	 */
	public void run() {
	    while (true) {
		Calendar now = Calendar.getInstance();
		String month = Integer.toString(now.get(Calendar.MONTH)+1);
		String date = Integer.toString(now.get(Calendar.DAY_OF_MONTH));
		String year = Integer.toString(now.get(Calendar.YEAR));
		String hour = Integer.toString(now.get(Calendar.HOUR));
		if (hour.equals("0")) hour = "12";
		String minute = Integer.toString(now.get(Calendar.MINUTE));
		if (minute.length() == 1) minute = "0" + minute;
		String second = Integer.toString(now.get(Calendar.SECOND));
		if (second.length() == 1) second = "0" + second;
		String ampm = now.get(Calendar.AM_PM) == Calendar.AM
		    ? "AM" : "PM";

		lblDate.setText(month + "/" + date + "/" + year);
		lblTime.setText(hour + ":" + minute + ":" + second
				+ " " + ampm);
		try {
		    sleep(500);
		} catch (InterruptedException e) {}
	    }
	}
    }

    /** A thread that keeps track of the stopwatch & updates
     * the display accordingly.
     * @version CS2136 - Term D'00 - Assignment 5
     * @author Peter Cooper Jr.
     */
    private class StopwatchThread extends Thread {
	/** Whether or not stopwatch is running. */
	private boolean going = false;
	/** Stores elapsed milliseconds of previous runs. */
	private long prevElapsed = 0;
	/** Stores beginning time of this run. */
	private Date startDate = new Date();
	/** Current lap number. */
	private int lapNum = 0;
	/** Elapsed time at end of last lap. */
	private long lastLapTime = 0;

	/** Returns elapsed time in milliseconds.
	 *@return The elapsed time
	 */
	private long elapsedTime() {
	    return prevElapsed +
		(going ? new Date().getTime() - startDate.getTime() : 0);
	}
	/** Changes the number of elapsed milliseconds into a string.
	 *@param time Number of elapsed milliseconds
	 *@return The elapsed time as a string.
	 */
	private String msToString(long time) {
	    String ms, sec, min;
	    if (time % 10 >= 5) //round to nearest hundredth
		time += 5;
	    ms = Long.toString(time % 1000);
	    while (ms.length() < 3)
		ms = "0" + ms;
	    ms = ms.substring(0, ms.length() - 1);
	    time /= 1000;
	    sec = Long.toString(time % 60);
	    if (sec.length() == 1) sec = "0" + sec;
	    time /= 60;
	    min = Long.toString(time);
	    return min + ":" + sec + "." + ms;
	}

	/** Called when the stopwatch is to go.
	 */
	public void go() {
	    startDate = new Date();
	    going = true;
	}
	/** Called when the stopwatch is to stop.
	 */
	public void noGo() {
	    prevElapsed = elapsedTime();
	    going = false;
	}
	/** Resets the stopwatch.
	 */
	public void reset() {
	    going = false;
	    prevElapsed = 0;
	    lastLapTime = 0;
	}
	/** Adds a lap to the list.
	 */
	public void addLap() {
	    long elapsed = elapsedTime();
	    lstLaps.add("Lap " + Integer.toString(++lapNum)+ " -- " +
			"Elapsed Time: " + msToString(elapsed) + " -- " +
			"Lap Time: " + msToString(elapsed - lastLapTime));
	    lastLapTime = elapsed;
	}
	/** Resets the lap list.
	 */
	public void resetLap() {
	    lstLaps.removeAll();
	    lapNum = 0;
	    lastLapTime = 0;
	}
	/** Main code of the thread.
	 */
	public void run() {
	    while (true) {
		lblWatch.setText(msToString(elapsedTime()));
		yield();
	    }
	}
    }

    /** Initializes the applet by adding its components, registering button
     *  listeners, and starting some threads.
     */
    public void init() {
	setLayout(new GridLayout(2,1));
	setBackground(Color.lightGray);
	setForeground(Color.black);
	pnlTop.setLayout(new GridLayout(4,4));
	pnlTop.add(new Label("Date:"));
	pnlTop.add(lblDate);
	pnlTop.add(new Label("Time:"));
	pnlTop.add(lblTime);
	pnlTop.add(new Label("Stopwatch:"));
	//lblWatch.setBackground(Color.black);
	lblWatch.setForeground(Color.blue);
	pnlTop.add(lblWatch);
	pnlTop.add(btnGo);
	btnGo.setBackground(Color.green);
	pnlTop.add(btnReset);
	pnlTop.add(new Label("Split:"));
	pnlTop.add(lblSplit);
	pnlTop.add(btnSplit);
	pnlTop.add(btnSplitReset);
	pnlTop.add(new Label("Laps:"));
	pnlTop.add(new Label());
	pnlTop.add(btnLapAdd);
	pnlTop.add(btnLapReset);
	pnlBot.setLayout(new GridLayout(1,1));
	pnlBot.add(lstLaps);
	add(pnlTop);
	add(pnlBot);
	btnGo.addActionListener(new btnGoListener());
	btnReset.addActionListener(new btnResetListener());
	btnSplit.addActionListener(new btnSplitListener());
	btnSplitReset.addActionListener(new btnSplitResetListener());
	btnLapAdd.addActionListener(new btnLapAddListener());
	btnLapReset.addActionListener(new btnLapResetListener());
	swThread.setDaemon(true);
	ucThread.setDaemon(true);
	swThread.start();
	ucThread.start();
    }

    /** A main for the application.
     * @param args An array of command-line parameters that are ignored
     */
    public static void main(String[] args) {
	Stopwatch applet = new Stopwatch();
	Frame aFrame = new Frame("Stopwatch");
	aFrame.addWindowListener(new WindowAdapter() {
	    public void windowClosing(WindowEvent e) {
		System.exit(0);
	    }
	});
	aFrame.add(applet, BorderLayout.CENTER);
	aFrame.setSize(400, 200);
	applet.init();
	applet.start();
	aFrame.setVisible(true);
    }
}
