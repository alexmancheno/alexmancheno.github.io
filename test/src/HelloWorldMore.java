import javax.swing.*;

public class HelloWorldMore 
{
    /**
     * Create the GUI and show it.
     */
    private static void createAndShowGUI() 
    {
        // Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setSize(100, 100);// width, height);
        frame.setLocation(200, 200);// x, y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        // Display the window.
        frame.pack();
        frame.setVisible(true);

        String moreToSay = JOptionPane.showInputDialog(null, "What else shall I say?");
        label.setText(moreToSay);
    }

    public static void main(String[] args) 
    {
        createAndShowGUI();
    }

}
