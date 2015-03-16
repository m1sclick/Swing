import javax.swing.*;

public class HelloWorld extends JFrame {
    public HelloWorld(String text) {
        setSize(200, 300);
        setTitle("Hello World");
        JButton myButton = new JButton("Click me");
        myButton.setText(text);
        add(myButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        HelloWorld myHello = new HelloWorld(args[0]);
    }
}
