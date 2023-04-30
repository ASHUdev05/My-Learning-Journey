import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    MyPanel(Color color, int x, int y, int width, int height){
        this.setBackground(color);
        this.setBounds(x, y, width, height);
    }
}
