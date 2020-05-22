import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MenuOperations extends JFrame{
	private JMenuBar mbMain;
	private JMenu mnuOperation,mnuCompute;
	private JMenuItem miAccept,miExit,miGCD,miPower;

	private int a,b;
	
	public MenuOperations(){
		mbMain = new JMenuBar();

		mnuOperation = new JMenu("Operation");
		mnuCompute = new JMenu("Compute");

		miAccept = new JMenuItem("Accept");
		miExit = new JMenuItem("Exit");
		miGCD = new JMenuItem("GCD");
		miPower = new JMenuItem("Power");

		mnuOperation.add(miAccept);
		mnuOperation.addSeparator();
		mnuOperation.add(miExit);
		
		mnuCompute.add(miGCD);
		mnuCompute.add(miPower);

		mbMain.add(mnuOperation);
		mbMain.add(mnuCompute);

		setTitle("Menu Operations");
		setSize(400,400);
		setLocation(100,100);
		setJMenuBar(mbMain);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miAccept.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				a = Integer.parseInt(
				JOptionPane.showInputDialog("Enter first number:"));
				b = Integer.parseInt(
				JOptionPane.showInputDialog("Enter second number:"));
			}
		});

		miExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.exit(0);
			}
		});

		miGCD.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int x = a, y = b;
				while(x!=y){
					if(x>y) x=x-y;
					else y=y-x;
				}
				JOptionPane.showMessageDialog(null,"GCD="+a);
			}
		});

		miPower.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int x = a, y = b, ans=1;

				for(int i=1;i<=y;i++)
					ans*=x;

				JOptionPane.showMessageDialog(null,
						"pow("+x+","+y+")="+ans);
			}
		});
	}

	public static void main(String args[]){
		new MenuOperations();
	}
}
