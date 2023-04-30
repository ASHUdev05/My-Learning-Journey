import javax.swing.*;
import java.awt.*;

public class LayeredPaneLabel extends JLabel {
    LayeredPaneLabel(Color color, int x, int y, int width, int height) {
        this.setOpaque(true);
        this.setBackground(color);
        this.setBounds(x, y, width, height);
    }
}
