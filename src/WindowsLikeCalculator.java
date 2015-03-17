import javax.swing.*;
import java.awt.*;

public class WindowsLikeCalculator {
    public static void main(String[] args) {
        // Create new frame
        JFrame frame = new JFrame("Windowslike calculator");

        // Create main panel with border layout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Create panel for numbers with Grid layout
        JPanel numPanel = new JPanel(new GridLayout(4, 3));

        // Create buttons for numbers
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button0 = new JButton("0");
        JButton buttonDot = new JButton(".");
        JButton buttonEqual = new JButton("=");

        // Assign buttons to the panel
        numPanel.add(button1);
        numPanel.add(button2);
        numPanel.add(button3);
        numPanel.add(button4);
        numPanel.add(button5);
        numPanel.add(button6);
        numPanel.add(button7);
        numPanel.add(button8);
        numPanel.add(button9);
        numPanel.add(button0);
        numPanel.add(buttonDot);
        numPanel.add(buttonEqual);

        // Create field to view the result and assign it to North
        JTextField resultField = new JTextField(20);
        mainPanel.add(BorderLayout.NORTH, resultField);

        // Assign numPanel to the Center area
        mainPanel.add(BorderLayout.CENTER, numPanel);

        // Add main panel to the frame and show frame on the screen
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
