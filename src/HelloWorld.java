import javax.swing.*;

public class HelloWorld {
    public HelloWorld(String text) {
        JFrame window = new JFrame("Hello World");
        window.setSize(200, 300);
        window.setTitle("Hello World");
        JButton myButton = new JButton("Click me");
        myButton.setText(text);
        window.add(myButton);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new HelloWorld(args[0]);
    }
}
