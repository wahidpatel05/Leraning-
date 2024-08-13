import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class Myfarme extends JFrame {

    Myfarme(){
        this.setTitle("Login Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setSize(460, 460);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("logo.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(86, 67, 90));

    }
}
