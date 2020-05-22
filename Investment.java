import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class BankAccount
{
    private double balance;
    BankAccount()
    {
        balance=0;
    }
    BankAccount(double balance)
    {
        this.balance=balance;
    }
    void setBalance(double balance)
    {
           this.balance=balance;
    }
    double getBalance()
    {
        return balance;
    }
}
class Investment extends BankAccount implements ActionListener
{
    JFrame f=new JFrame();
    static final int FRAME_WIDTH=130,FRAME_HEIGHT=60,INTREST_RATE=10,INITIAL_BALANCE=1000;
    JButton b;
    JLabel l;
    BankAccount ba=new BankAccount(INITIAL_BALANCE);
    Investment()
    {
        f.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        b=new JButton("INTREST");
        b.setBounds(15,10,100,50);
        b.addActionListener(this);
        f.add(b);

        l=new JLabel();
        l.setText(Double.toString(ba.getBalance()));
        l.setBounds(10,80,100,50);
        f.add(l);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b)
        {
            double bal=ba.getBalance();
            bal+=bal*INTREST_RATE;
            ba.setBalance(bal);
            l.setText(Double.toString(bal));
        }
    }
    public static void main(String args[])
    {
        new Investment();
    }
}