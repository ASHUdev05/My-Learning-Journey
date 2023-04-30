import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.awt.Color.*;

public class MyFrame extends JFrame {
    JButton button = new JButton();
    MyFrame(){
        button = new MyButton(150,500,100,50);
        MyLayeredPane layeredPane = new MyLayeredPane(0, 250, 500, 500);
        LayeredPaneLabel label1 = new LayeredPaneLabel(RED, 50, 50, 200, 200);
        LayeredPaneLabel label2 = new LayeredPaneLabel(GREEN, 100, 100, 200, 200);
        LayeredPaneLabel label3 = new LayeredPaneLabel(BLUE, 150, 150, 200, 200);
        layeredPane.add(label1, Integer.valueOf(1));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(0));
        MyLabel label = new MyLabel();
        MyPanel redPanel = new MyPanel(RED, 0, 0, 250, 250);
        MyPanel bluePanel = new MyPanel(BLUE, 250, 0, 250, 250);
        AtomicInteger c= new AtomicInteger();
        button.addActionListener(e -> {
            c.getAndIncrement();
            label.setVisible(c.get() % 2 != 0);
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("src/resources/logo.png");
        this.setIconImage(icon.getImage());
        this.setLayout(null);
        // this.setResizable(false);
        this.setSize(620,620);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.CYAN);
        //this.add(label);

        redPanel.setLayout(new BorderLayout());
        redPanel.add(label);
        this.add(redPanel);
        this.add(bluePanel);
        this.add(layeredPane);
        this.add(button);
        //this.pack();
    }
}
