import javax.swing.*;
import java.awt.*;

public class SnakeTheGame {
    public static void main(String[] args) {
        // Creating panel for holding all game elements
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Creating all other panels for holding each type of elements and assigning to the mainPanel
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.X_AXIS));
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
        JPanel centerPanel = new JPanel(new GridLayout(10, 10));

        mainPanel.add(BorderLayout.NORTH, northPanel);
        mainPanel.add(BorderLayout.WEST, westPanel);
        mainPanel.add(BorderLayout.CENTER, centerPanel);

        // Creating menu elements on top of the window and assigning to the panel
        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton exitButton = new JButton("Exit");

        northPanel.add(startButton);
        northPanel.add(stopButton);
        northPanel.add(exitButton);

        // Creating game play elements on top of the left/west panel and assigning
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");
        JButton leftButton = new JButton("Left");
        JButton rightButtong = new JButton("Right");

        westPanel.add(upButton);
        westPanel.add(downButton);
        westPanel.add(leftButton);
        westPanel.add(rightButtong);

        // Showing on the screen
        JFrame frame = new JFrame("Snake the game");
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
