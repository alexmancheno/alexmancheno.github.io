import javax.swing.JOptionPane;

public class Project0 {

    public static void main(String[] args) {
        while (true) {// keeps the loop going until the Keyword: "stop" is entered
            String input = JOptionPane.showInputDialog("Enter a sentence");// takes in an input
            int LowerCaseE = 0;
            int UpperCaseE = 0;
            String x = "Stop";
            if (x.equalsIgnoreCase(input)) {
                return;
            } else {
                for (int i = 0; i < input.length(); i++) { // loops until it reaches the end of the string
                    if (input.charAt(i) == 'e') {// looks for 'e'
                        LowerCaseE++;// adds 'e'
                    } else if (input.charAt(i) == 'E') {// looks for 'e'
                        UpperCaseE++;// adds 'e'
                    }
                }
                // prints the number of e's and E's
                JOptionPane.showMessageDialog(null,
                        "# of lower case e's: " + LowerCaseE + "\n # of upper case e's: " + UpperCaseE);
            }
        }
    }

}
