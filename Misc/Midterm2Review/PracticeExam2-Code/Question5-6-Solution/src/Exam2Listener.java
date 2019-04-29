import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exam2Listener implements ActionListener {
	private MainWindow mainFrame;

	public Exam2Listener(MainWindow f) {
		mainFrame = f;
	} // constructor

	public void actionPerformed(ActionEvent e) {
		String chosenItem = ((JMenuItem) e.getSource()).getText();
		if (chosenItem.equals("Pass")) {
			System.out.println("Hooray! You passed!");
		} // end if mInputFile
		else if (chosenItem.equals("Fail")) {
			System.out.println("Too bad! You failed.");
		} // end if mInputFile
		else if (chosenItem.equals("Quit")) {
			System.exit(0);
		} // if
	} //
} // class Exam2Listene