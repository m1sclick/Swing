import javax.swing.*;
import java.awt.*;

public class SimpleCalculatorFlow {
    public static void main(String[] srgs) {
        // Create a panel
        JPanel windowContent = new JPanel();

        // Set a layout manager for this panel
        FlowLayout fl = new FlowLayout();
        windowContent.setLayout(fl);

        //Create controls in memory
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");

        // Add controls to the panel
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        // Create the frame and add the panel to it
        JFrame frame = new JFrame("My first calculator");

        // Add the panel to the top-level container
        frame.setContentPane(windowContent);

        // Set the size and make the window visible
        frame.setSize(600,100);
        frame.setVisible(true);
    }
}
