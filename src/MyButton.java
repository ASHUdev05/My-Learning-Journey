import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton {
    MyButton(int x, int y, int width, int height){
        this.setBounds(x, y, width, height);
        this.setText("Tap Tap!");
        this.setFocusable(false);
    }
}
