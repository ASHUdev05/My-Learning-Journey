import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyLabel extends JLabel {
    MyLabel(){
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        ImageIcon icon = new ImageIcon("src/resources/img.png");
        this.setText("Hi?");
        this.setIcon(icon);
        //this.setHorizontalTextPosition(JLabel.CENTER);
        //this.setVerticalTextPosition(JLabel.TOP);
        this.setForeground(new Color(0x0000FF));
        this.setFont(new Font("MV Boli", Font.PLAIN, 20));
        //this.setIconTextGap(-25);
        //this.setBackground(Color.DARK_GRAY);
        //this.setOpaque(true);
        this.setBorder(border);
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.LEFT);
        this.setVisible(false);
    }
}
