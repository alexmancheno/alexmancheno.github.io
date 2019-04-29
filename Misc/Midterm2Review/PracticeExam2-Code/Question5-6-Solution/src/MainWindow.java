import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame {
	private JFrame mainWindow;
	private JMenuBar mainMenuBar;
	private JMenu exam2;
	private JMenuItem mPass, mFail, mQuit;
	private Exam2Listener exam2ML;

	public static void main(String args[]) {
		MainWindow m = new MainWindow("Exam 2");
	}

	public MainWindow(String title) {
		mainWindow = new JFrame(title);
		mPass = new JMenuItem("Pass");
		mFail = new JMenuItem("Fail");
		mQuit = new JMenuItem("Quit");
		exam2 = new JMenu("Exam 2", /* tearoff = */false);
		exam2.add(mPass);
		exam2.add(mFail);
		exam2.addSeparator();
		exam2.add(mQuit);
		mainMenuBar = new JMenuBar();
		mainMenuBar.add(exam2);
		mainWindow.setJMenuBar(mainMenuBar);
		exam2ML = new Exam2Listener(this);
		mPass.addActionListener(exam2ML);
		mFail.addActionListener(exam2ML);
		mQuit.addActionListener(exam2ML);
		mainWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainWindow.setSize(400, 400);
		mainWindow.setLocation(100, 100);
		mainWindow.setVisible(true);
	} // constructor
} // class