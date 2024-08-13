import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;

    public app (){
        super("Add 2 numbers");
        l1= new JLabel("Enter 1st Value");
        l2=new JLabel("Enter 2nd Value");
        l3=new JLabel("Result");

        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);

        b1=new JButton("Add");

        setLayout(new FlowLayout(FlowLayout.LEFT,200,20));

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        b1.addActionListener(this);
        setSize(460,460);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x=Integer.parseInt(t1.getText());
        int y=Integer.parseInt(t2.getText());
        int sum=x+y;
        t3.setText(String.valueOf(sum));
    }

    public static void main(String[] args) {
        new app();
    }
}
