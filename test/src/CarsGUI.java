
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JFrame;


class CarsGUI extends JFrame
{
  
    private static final String[] Sorted = null;
	private JTextArea leftTextArea;
    private JTextArea rightTextArea;
    private StringBuilder unsortedBuilder;
    private StringBuilder sortedBuilder;
	





    public CarsGUI( Cars[] unSorted, Cars[] sorted, int a, int b)
    {

       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(100, 100);
        this.setLocation(200, 200);
        this.setLayout(new  GridLayout(1, 2)); // set the layout


       this.unsortedBuilder = new StringBuilder("Unsorted:\n");
       this.sortedBuilder  = new StringBuilder("Sorted:\n");

       // left = unsorted
        // right = sorted
        this.leftTextArea = new JTextArea(this.unsortedBuilder.toString(), 13, 4);
        this.rightTextArea =new JTextArea(this.sortedBuilder.toString(), 13, 4 );

        // Add the JTextArea's to the content pane
        this.getContentPane().add(this.leftTextArea);
        this.getContentPane( ).add(this.rightTextArea); 
    }
        
        public void showgui()
        {
            this.pack();
            this.setVisible(true);
        }
        public void displayCar(Cars[] unSorted, Cars[] sorted, int a, int b)
        {
        	Cars getUnsorted = null;
        	String getSorted = null;
        	for ( int i = 0; i < a; i++)
        	{
        		getUnsorted = unSorted[i];
    
        		this.unsortedBuilder.append (getUnsorted + "/n");
        	}
        	for ( int j = 0; j < b; j++)
        	{
        		getSorted = Sorted[j];
        	    
        		this.sortedBuilder.append (getSorted + "/n");
        	}
        	this.leftTextArea.setText(this.unsortedBuilder.toString());
        	this.rightTextArea.setText(this.sortedBuilder.toString());
        }
}      