import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginDemo extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1,b2;
    LoginDemo()
    {
        Font f=new Font("Times New Roman",Font.BOLD,20);
        l1=new JLabel("Enter Username:");
        l2=new JLabel("Enter Password:");
        l1.setFont(f);
        l2.setFont(f);
        l1.setBounds(100,100,200,50);
        l2.setBounds(100,150,200,50);
        add(l1);
        add(l2);

        t1=new JTextField();
        t1.setFont(f);
        t1.setBounds(250,100,150,50);
        add(t1);

        p1=new JPasswordField();
        p1.setBounds(250,150,150,50);
        add(p1);

        b1=new JButton("Reset");
        b2=new JButton("Login");
        b1.setFont(f);
        b2.setFont(f);
        b1.setBounds(100,200,100,50);
        b2.setBounds(150,200,100,50);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
        setSize(400,400);
        setLocation(400,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b2)
        {
            String user=t1.getText();
            String pass=p1.getText();
            if(user.equals("sumit") && pass.equals("123"))
            JOptionPane.showMessageDialog(null,"User Verified");
            else
            JOptionPane.showMessageDialog(null,"Invalid username or password");
        }
        if(ae.getSource()==b1)
        {
            t1.setText("");
            p1.setText("");
        }
    }
    public static void main(String args[])
    {
        new LoginDemo();
    }
}