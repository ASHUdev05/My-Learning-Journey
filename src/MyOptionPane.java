import javax.swing.*;

public class MyOptionPane extends JOptionPane {
    MyOptionPane() {
        /*JOptionPane.showMessageDialog(null, "INFO", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "INFO", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "INFO", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "INFO", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "INFO", "title", JOptionPane.ERROR_MESSAGE);*/

        /*int answer = JOptionPane.showConfirmDialog(null, "U dumb?", "Yes bro!", JOptionPane.YES_NO_CANCEL_OPTION);
        String name = JOptionPane.showInputDialog("What's ur name?:: ");*/
        String responses[] = {"Yes who's this?", "Uhm, hi?", "Go away!", "Hmmmm........Zzzzz"};
        ImageIcon icon = new ImageIcon("src/resources/img.png");

        JOptionPane.showOptionDialog(
                null,
                "Heya!",
                "title", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);

    }
}
