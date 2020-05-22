import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FontGUI extends JFrame implements ItemListener
{
	JLabel l1,l2,l3;
	JComboBox cb1,cb2;
	JCheckBox ck1,ck2;
	JTextField t;
	String c1[]={"Arial","Times New Roman"};
	String c2[]={"15","16","18","20","25"};
	FontGUI()
	{
		setLayout(null);
		t=new JTextField();
		cb1=new JComboBox(c1);
		cb2=new JComboBox(c2);
		ck1=new JCheckBox("Bold");
		ck2=new JCheckBox("Italic");
		l1=new JLabel("Font");
		l2=new JLabel("Size");
		l3=new JLabel("Style");

		l1.setBounds(10,10,100,30);
		cb1.setBounds(10,30,100,30);
		cb1.addItemListener(this);
		l2.setBounds(10,80,100,30);
		cb2.setBounds(10,120,100,30);
		cb2.addItemListener(this);
		l3.setBounds(180,10,100,30);
		ck1.setBounds(180,40,100,30);
		ck1.addItemListener(this);
		ck2.addItemListener(this);
		ck2.setBounds(180,80,100,30);
		t.setBounds(12,180,180,50);

		add(l1);
		add(cb1);
		add(l2);
		add(cb2);
		add(l3);
		add(ck1);
		add(ck2);
		add(t);

		setLocation(400,400);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==cb1)
		{
			String sel=cb1.getSelectedItem().toString();
			t.setFont(new Font(sel,Font.BOLD,20));
		}
		if(ie.getSource()==cb2)
		{
			String sel=cb2.getSelectedItem().toString();
			int se=Integer.parseInt(sel);
			t.setFont(new Font("Ariel",Font.BOLD,se));                                                                                                                    
		}
		if(ck1.isSelected())
		{
			t.setFont(new Font("Times New Roman",Font.BOLD,20));                                                                }
			if(ck2.isSelected())
			{

				t.setFont(new Font("Times New Roman",Font.ITALIC,20));                                                                                                                    
			}
	}
	public static void main(String args[])
	{
		new FontGUI();
	}
}
