import javax.swing.*;

public class MyLaunchPage {
    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    MyLaunchPage() {
        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(e -> newWindow());

        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    void newWindow() {
        frame.dispose(); // to get rid of launch page
        NewWindow myWindow = new NewWindow();
    }
}
