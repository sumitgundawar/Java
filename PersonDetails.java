import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class PersonDetails extends JFrame implements ActionListener,ItemListener,ListSelectionListener
{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1;
    JRadioButton rb1,rb2;
    ButtonGroup bg;
    JTextArea a1;
    JCheckBox cb1,cb2,cb3,cb4;
    JList jlist1,jlist2;
    JButton b1,b2;
    PersonDetails()
    {
        setSize(900,900);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1=new JLabel("Name");
        l1.setBounds(10,10,100,50);
        add(l1);

        t1=new JTextField();
        t1.setBounds(120,10,100,50);
        add(t1);

        rb1=new JRadioButton("Male");
        rb2=new JRadioButton("Female");
        rb1.setBounds(10,70,100,50);
        rb2.setBounds(120,70,100,50);
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        add(rb1);
        add(rb2);
        rb1.addActionListener(this);
        rb2.addActionListener(this);

        cb1=new JCheckBox("MTech");
        cb2=new JCheckBox("MCA");
        cb3=new JCheckBox("BBA");
        cb4=new JCheckBox("PHD");
        cb1.setBounds(10,130,100,50);
        cb2.setBounds(120,130,100,50);
        cb3.setBounds(220,130,100,50);
        cb4.setBounds(320,130,100,50);
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);

        String hobbies[]={"Dancing","Playing","Reading","Swimming"};
        jlist1=new JList(hobbies);
        jlist1.setBounds(100,200,100,50);
        jlist1.addListSelectionListener(this);
        add(jlist1);

        String countries[]={"India","China","USA","Russia","Saudi"};
        jlist2=new JList(countries);
        jlist2.setBounds(100,270,100,50);
        jlist2.addListSelectionListener(this);
        add(jlist2);

        a1=new JTextArea();
        a1.setBounds(10,330,200,200);
        add(a1);

        b1=new JButton("Display");
        b1.setBounds(10,540,100,50);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Reset");
        b2.setBounds(120,540,100,50);
        b2.addActionListener(this);
        add(b2);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {

        }
        if(ae.getSource()==b2)
        {

        }
    }
    public void itemStateChanged(ItemEvent ie)
    {

    }
    public void valueChanged(ListSelectionEvent lse)
    {

    }
    public static void main(String args[])
    {
        new PersonDetails();
    }
}