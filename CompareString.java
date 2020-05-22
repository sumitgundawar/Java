import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CompareString extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    CompareString()
    {
        setLayout(null);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1=new JLabel("Enter string 1: ");
        l2=new JLabel("Enter string 2: ");
        l1.setBounds(10,10,100,50);
        l2.setBounds(10,60,100,50);
        add(l1);
        add(l2);

        t1=new JTextField();
        t2=new JTextField();
        t1.setBounds(120,10,100,50);
        t2.setBounds(120,60,100,50);
        add(t1);
        add(t2);

        b1=new JButton("Submit");
        b1.setBounds(50,120,100,50);
        add(b1);
        b1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
                JTextField t=new JTextField();
                t.setBounds(30,200,100,50);
                add(t);
                String s1,s2;
                s1=t1.getText();
                s2=t2.getText();
                int l1=s1.length();
                int l2=s2.length();
                if(l1>l2)
                {
                    //JOptionPane.showMessageDialog(null,"String 1 is greater");
                    t.setText("String 1 is greater");
                }
                else if(l1<l2)
                JOptionPane.showMessageDialog(null,"String 2 is greater");
                else
                JOptionPane.showMessageDialog(null,"Strings are equal");
        }
    }
    public static void main(String args[])
    {
        new CompareString();
    }
}