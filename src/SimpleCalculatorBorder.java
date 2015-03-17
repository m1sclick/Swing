import javax.swing.*;
import java.awt.*;

public class SimpleCalculatorBorder {
    public static void main(String[] args) {
        // Create frame where elements will be showed
        JFrame frame = new JFrame("First simple calculator with Border layout without looking at book");
        frame.setSize(400, 130);

        // Create panel, assign layout manager to it and bound to the frame
        JPanel window = new JPanel(new BorderLayout());
        frame.setContentPane(window);

        // Create some small elements do describe UI
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel sumLabel = new JLabel("Sum:");
        JTextField sumField = new JTextField(10);
        JButton compute = new JButton("Add");

        // Create holder panel to combine elements on the Border Layout
        JPanel panelWest = new JPanel(new FlowLayout());
        JPanel panelEast = new JPanel(new FlowLayout());
        JPanel panelNorth = new JPanel(new FlowLayout());
        JPanel panelSouth = new JPanel(new FlowLayout());

        // Place elements on panels
        panelNorth.add(compute);
        panelWest.add(label1);
        panelWest.add(field1);
        panelEast.add(label2);
        panelEast.add(field2);
        panelSouth.add(sumLabel);
        panelSouth.add(sumField);

        // Place panels to main panel with border layout
        window.add(BorderLayout.NORTH, panelNorth);
        window.add(BorderLayout.WEST, panelWest);
        window.add(BorderLayout.EAST, panelEast);
        window.add(BorderLayout.SOUTH, panelSouth);

        // Show frame on the screen
        frame.setVisible(true);
    }
}
