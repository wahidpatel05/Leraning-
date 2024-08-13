import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class Loginpage extends JFrame {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("logo.jpg");
        Border border = BorderFactory.createLineBorder(Color.green,3);
        JLabel label=new JLabel();
        label.setText("Are you here for Airline Hospitality?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("MV Boli", Font.PLAIN,12));
        label.setForeground(Color.WHITE);
        label.setIconTextGap(10);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100,50,350,450);

        JFrame frame = new JFrame();
        frame.add(label);
        frame.setTitle("Altitude 4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
//        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
//        frame.setSize(460, 460);
        frame.setVisible(true);
        frame.pack();

        ImageIcon image1 = new ImageIcon("images.jpg");
        frame.setIconImage(image1.getImage());






    frame.repaint();



    }
}

