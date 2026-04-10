package virus;

import javax.swing.*;

public class hello {
    public static void main(String[] args) {
    	int again = 0;
        // Show the confirm dialog
    	do {
        int result = JOptionPane.showConfirmDialog(
                null, "HAPPY APRIL FOOLS HAHAHAHA", "Confirmation", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                	again++;
                } else if (result == JOptionPane.CANCEL_OPTION) {
                    again++;
                } else if (result == JOptionPane.CLOSED_OPTION) {
                	again++;
                }
        } while ( again < 1000
        		);
    }
}