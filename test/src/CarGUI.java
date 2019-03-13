import javax.swing.*;
import java.awt.GridLayout;

public class CarGUI extends JFrame{
	// ONE ROW, TWO COLUMN GUI of GridLayout
	// Left side unsorted, Right side sorted
		
		private JTextArea leftText;
		private JTextArea rightText;
		private StringBuilder leftStringBuilder;
		private StringBuilder rightStringBuilder;
		
	public CarGUI(){
        this("No title");
    }

    public CarGUI (String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(100, 100);
        this.setLocation(200, 200);
        this.setLayout(new GridLayout(1,2));
		
		this.leftStringBuilder = new StringBuilder("Unsorted Cars:\n"); 
        this.rightStringBuilder = new StringBuilder("Sorted Cars:\n");

        this.leftText = new JTextArea(this.leftStringBuilder.toString(), Car.count(), 1);
        this.rightText = new JTextArea(this.rightStringBuilder.toString(), Car.count(), 1);

        this.getContentPane().add(this.leftText);
        this.getContentPane().add(this.rightText); 
    }
	
	public void showGUI(){
		this.setVisible(true);
	}
	
	public void arrayDisplay(Car[] array, Car[] arraySorted){
		for (int i = 0; i < Car.count(); i++){
			this.leftStringBuilder.append(array[i] + "\n");
			this.rightStringBuilder.append(arraySorted[i] + "\n");	
		}
		this.leftText.setText(this.leftStringBuilder.toString());
		this.rightText.setText(this.rightStringBuilder.toString());
		
	}
	
	
}