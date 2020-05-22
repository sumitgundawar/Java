import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;
class StudentGUI extends JFrame
{
DefaultTableModel t1;
JScrollPane jp;
JTable jt1;
StudentGUI()
{
setLayout(null);
jt1=new JTable();
jp=new JScrollPane(jt1);
t1=new DefaultTableModel();
t1.addColumn("Rno");
t1.addColumn("Name");
t1.addColumn("Percentage");
jt1.setModel(t1);
jp.setBounds(10,10,200,200);
add(jp);
try{
Class.forName("org.postgresql.Driver");
Connection con=DriverManager.getConnection("jdbc:postgresql:ty1","postgres","");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from student");
while(rs.next())
{
t1.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
}
}
catch(Exception e)
{

}

setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(500,500);
setLocation(400,400);
}
public static void main(String args[])
{
new StudentGUI();
}
}
