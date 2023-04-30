import javax.swing.*;
import java.awt.*;

public class FrameWithTextField extends JFrame {
    FrameWithTextField() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Submit!");
        button.setFocusable(false);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.ITALIC, 34));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);

        button.addActionListener(e -> {
            System.out.println(textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        });
        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
}