import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.sql.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.io.DataInputStream;
import java.io.IOException;

class main implements ActionListener
{
	static int dr=0;
JButton b1,b2,b3,b4,b5,b6,b7,b8,ba4,b9,b11,b10,nb,nbb,sb1,sb2,sb3,sb4,sb5,nbu;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,ta8,nt1,nt2,nt4,nt3,nt5,nt6,nt7,nt8,nt9,nd1,ns1,ndu1,ntu1,ntu2,ntu3,ntu4,ntu5,ntu6,ntu7,ntu8,ntu9;
JPasswordField pss1,pssa1;
JTextArea a1,a2,n,s,sa;
String am;
int nc=0;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,la9,la8,nl1,nl2,nl3,nl4,nl5,nl6,nl7,nl8,nl9,ls1,nlu1,nlu2,nlu3,nlu4,nlu5,nlu6,nlu7,nlu8,nlu9;
JComboBox cm1,c;
JFrame j=new JFrame("Payment Billing");
Image bg;
ImageIcon m1,m2;

int w;
JPanel pc=new JPanel(null);
JPanel p0=new JPanel(null);
JPanel p1=new JPanel(null);
JPanel p2=new JPanel(null);
JPanel p3=new JPanel(null);
JPanel p=new JPanel(null);
JPanel p5=new JPanel(null);
JPanel p6=new JPanel(null);
CardLayout cl=new CardLayout();
main() 
{
		j.setVisible(true);
		j.setSize(800,600);
		j.setLocation(200,100);

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	pc.setLayout(cl);
	//j.setLayout(null);
	Font f= new Font("Arial Black",Font.ITALIC,16);
	Font f1= new Font("Arial Black",Font.ITALIC,16);
m1=new ImageIcon("2.png");
bg=m1.getImage();

a1=new JTextArea(20,20);
a1.setLocation(390,20);
a1.setSize(370,400);
p3.add(a1);


l1=new JLabel("Name ");
l1.setLocation(20,20);
l1.setSize(100,20);
l1.setFont(f);
t1=new JTextField(20);
t1.setLocation(150,20);
t1.setSize(150,20);
t1.setFont(f);
p3.add(t1);
p3.add(l1);


l2=new JLabel("Mob. ");
l2.setLocation(20,70);
l2.setSize(50,20);
l2.setFont(f);

t2=new JTextField(20);
t2.setLocation(150,70);
t2.setSize(150,20);
t2.setFont(f);
p3.add(l2);
p3.add(t2);


l3=new JLabel("Address ");
l3.setLocation(20,120);
l3.setSize(100,20);
l3.setFont(f);
t3=new JTextField(20);
t3.setLocation(150,120);
t3.setSize(150,20);
t3.setFont(f);
p3.add(l3);
p3.add(t3);


int y=260;
l5=new JLabel("Item ");
l5.setLocation(20,y);
l5.setSize(100,20);
l5.setFont(f1);
cm1=new JComboBox();
		cm1.addItem("ITEM 1");
		cm1.addItem("ITEM 2");
		cm1.addItem("ITEM 3");
		cm1.addItem("ITEM 4");
		cm1.addItem("ITEM 5");
cm1.setLocation(150,260);
cm1.setSize(150,20);
cm1.setFont(f1);
p3.add(l5);
p3.add(cm1);
l6=new JLabel("Quantity ");
l6.setLocation(20,300);
l6.setSize(100,20);
l6.setFont(f1);
c=new JComboBox();
		for(int g=1;g<=20;g++)
		{
		c.addItem(""+g);
		}

c.setLocation(150,300);
c.setSize(150,20);
c.setFont(f1);
p3.add(c);
p3.add(l6);
		
l7=new JLabel("Amount ");
l7.setLocation(20,340);
l7.setSize(100,20);
l7.setFont(f1);
p3.add(l7);
t7=new JTextField(20);
t7.setLocation(150,340);
t7.setSize(150,20);
t7.setFont(f1);
p3.add(t7);


b1=new JButton("Go");
b1.setLocation(150,170);
b1.setSize(70,20);
b1.setFont(f);
p3.add(b1);
b1.addActionListener(this);


b2=new JButton("Add in Bill");
b2.setLocation(150,380);
b2.setSize(200,20);
b2.setFont(f1);
p3.add(b2); 
b2.addActionListener(this);

b3=new JButton("Total");
b3.setLocation(390,440);
b3.setSize(180,20);
b3.setFont(f1);
p3.add(b3);
b3.addActionListener(this);

b6=new JButton("Print");
b6.setLocation(575,440);
b6.setSize(180,20);
b6.setFont(f1);
p3.add(b6);
b6.addActionListener(this);


b9=new JButton("LogOut");
b9.setLocation(500,470);
b9.setSize(130,70);
b9.setFont(f1);
p3.add(b9);
b9.addActionListener(this);



 pc.add(p1,"1");
 pc.add(p2,"2");
 pc.add(p0,"0");
 pc.add(p3,"3");
 pc.add(p,"new");
 pc.add(p5,"search");
 pc.add(p6,"update");
 


 j.add(pc);

//Login page:-

l8=new JLabel("User:- ");
l8.setLocation(20,220);
l8.setSize(100,20);
l8.setFont(f1);
p1.add(l8);
t8=new JTextField(20);
t8.setLocation(150,220);
t8.setSize(150,20);
t8.setFont(f1);
p1.add(t8);

l9=new JLabel("Password:- ");
l9.setLocation(20,290);
l9.setSize(150,20);
l9.setFont(f1);
p1.add(l9);
pss1=new JPasswordField(20);
pss1.setLocation(150,290);
pss1.setSize(150,20);
pss1.setFont(f1);
p1.add(pss1);

b4=new JButton("Submit");
b4.setLocation(150,360);
b4.setSize(220,20);
b4.setFont(f1);
p1.add(b4);
b4.addActionListener(this);

b8=new JButton("Login as Admin");
b8.setLocation(150,410);
b8.setSize(220,20);
b8.setFont(f1);
p1.add(b8);
b8.addActionListener(this);


//login as admin:--


la8=new JLabel("Admin Id:- ");
la8.setLocation(20,220);
la8.setSize(100,20);
la8.setFont(f1);
p0.add(la8);
ta8=new JTextField(20);
ta8.setLocation(150,220);
ta8.setSize(150,20);
ta8.setFont(f1);
p0.add(ta8);

la9=new JLabel("Password:- ");
la9.setLocation(20,290);
la9.setSize(150,20);
la9.setFont(f1);
p0.add(la9);
pssa1=new JPasswordField(20);
pssa1.setLocation(150,290);
pssa1.setSize(150,20);
pssa1.setFont(f1);
p0.add(pssa1);

ba4=new JButton("Submit");
ba4.setLocation(150,360);
ba4.setSize(220,20);
ba4.setFont(f1);
p0.add(ba4);
ba4.addActionListener(this);

b11=new JButton("Login as Agent");
b11.setLocation(150,410);
b11.setSize(220,20);
b11.setFont(f1);
p0.add(b11);
b11.addActionListener(this);

b10=new JButton("New Regestration");
b10.setLocation(150,460);
b10.setSize(220,20);
b10.setFont(f1);
p1.add(b10);
b10.addActionListener(this);

//new regetration:-

nl1=new JLabel("Name ");
nl1.setLocation(20,50);
nl1.setSize(100,20);
nl1.setFont(f1);
p.add(nl1);

nt1=new JTextField(20);
nt1.setLocation(50,90);
nt1.setSize(160,20);
nt1.setFont(f1);
p.add(nt1);
/*
nt2=new JTextField(20);
nt2.setLocation(220,90);
nt2.setSize(160,20);
nt2.setFont(f1);
p.add(nt2);
*/

nl2=new JLabel("Father Name ");
nl2.setLocation(430,50);
nl2.setSize(160,20);
nl2.setFont(f1);
p.add(nl2);

nt3=new JTextField(20);
nt3.setLocation(480,90);
nt3.setSize(160,20);
nt3.setFont(f1);
p.add(nt3);

nl6=new JLabel("Email Id");
nl6.setLocation(20,120);
nl6.setSize(100,20);
nl6.setFont(f1);
p.add(nl6);

nt7=new JTextField(20);
nt7.setLocation(50,160);
nt7.setSize(160,20);
nt7.setFont(f1);
p.add(nt7);

nl7=new JLabel("Phone no.");
nl7.setLocation(430,120);
nl7.setSize(100,20);
nl7.setFont(f1);
p.add(nl7);

nt8=new JTextField(20);
nt8.setLocation(480,160);
nt8.setSize(160,20);
nt8.setFont(f1);
p.add(nt8);

nl3=new JLabel("Date of Birth");
nl3.setLocation(20,210);
nl3.setSize(150,20);
nl3.setFont(f1);
p.add(nl3);

nt4=new JTextField(300);
nt4.setLocation(50,250);
nt4.setSize(160,20);
nt4.setFont(f1);
p.add(nt4);

nl4=new JLabel("Address");
nl4.setLocation(430,210);
nl4.setSize(100,20);
nl4.setFont(f1);
p.add(nl4);

nt5=new JTextField(15);
nt5.setLocation(480,250);
nt5.setSize(160,20);
nt5.setFont(f1);
p.add(nt5);


nl5=new JLabel("State");
nl5.setLocation(20,280);
nl5.setSize(100,20);
nl5.setFont(f1);
p.add(nl5);

nt6=new JTextField(20);
nt6.setLocation(50,310);
nt6.setSize(160,20);
nt6.setFont(f1);
p.add(nt6);


nl8=new JLabel("Pin Code");
nl8.setLocation(430,280);
nl8.setSize(100,20);
nl8.setFont(f1);
p.add(nl8);

nd1=new JTextField();
nd1.setLocation(480,310);
nd1.setSize(160,20);
nd1.setFont(f1);
p.add(nd1);

nl9=new JLabel("Salary");
nl9.setLocation(20,340);
nl9.setSize(100,20);
nl9.setFont(f1);
p.add(nl9);

nt9=new JTextField(20);
nt9.setLocation(50,370);
nt9.setSize(160,20);
nt9.setFont(f1);
p.add(nt9);

nb=new JButton("Save");
nb.setLocation(480,370);
nb.setSize(160,30);
nb.setFont(f1);
p.add(nb);
nb.addActionListener(this);


nbb=new JButton("Back");
nbb.setLocation(480,420);
nbb.setSize(160,30);
nbb.setFont(f1);
p.add(nbb);
nbb.addActionListener(this);

//search
ls1=new JLabel("Search by Name");
ls1.setLocation(20,50);
ls1.setSize(250,20);
ls1.setFont(f1);
p5.add(ls1);

ns1=new JTextField(20);
ns1.setLocation(50,90);
ns1.setSize(160,20);
ns1.setFont(f1);
p5.add(ns1);


sb1=new JButton("Search");
sb1.setLocation(10,130);
sb1.setSize(150,20);
sb1.setFont(f1);
p5.add(sb1);
sb1.addActionListener(this);

sb3=new JButton("Back");
sb3.setLocation(20,10);
sb3.setSize(100,20);
sb3.setFont(f1);
p5.add(sb3);
sb3.addActionListener(this);

sb2=new JButton("Search in detail");
sb2.setLocation(10,170);
sb2.setSize(220,20);
sb2.setFont(f1);
p5.add(sb2);
sb2.addActionListener(this);

sb4=new JButton("Update");
sb4.setLocation(170,130);
sb4.setSize(120,20);
sb4.setFont(f1);
p5.add(sb4);
sb4.addActionListener(this);

sb5=new JButton("Delete");
sb5.setLocation(240,170);
sb5.setSize(100,20);
sb5.setFont(f1);
p5.add(sb5);
sb5.addActionListener(this);



s=new JTextArea(10,10);
s.setLocation(350,10);
s.setSize(400,180);
s.setFont(f1);
p5.add(s);

sa=new JTextArea(10,10);
sa.setLocation(20,220);
sa.setSize(720,300);
sa.setFont(f1);
p5.add(sa);


/////update page:- 


nlu1=new JLabel("Name ");
nlu1.setLocation(20,50);
nlu1.setSize(100,20);
nlu1.setFont(f1);
p6.add(nlu1);

ntu1=new JTextField(20);
ntu1.setLocation(50,90);
ntu1.setSize(160,20);
ntu1.setFont(f1);
p6.add(ntu1);


nlu2=new JLabel("Father Name ");
nlu2.setLocation(430,50);
nlu2.setSize(160,20);
nlu2.setFont(f1);
p6.add(nlu2);

ntu3=new JTextField(20);
ntu3.setLocation(480,90);
ntu3.setSize(160,20);
ntu3.setFont(f1);
p6.add(ntu3);

nlu6=new JLabel("Email Id");
nlu6.setLocation(20,120);
nlu6.setSize(100,20);
nlu6.setFont(f1);
p6.add(nlu6);

ntu7=new JTextField(20);
ntu7.setLocation(50,160);
ntu7.setSize(160,20);
ntu7.setFont(f1);
p6.add(ntu7);

nlu7=new JLabel("Phone no.");
nlu7.setLocation(430,120);
nlu7.setSize(100,20);
nlu7.setFont(f1);
p6.add(nlu7);

ntu8=new JTextField(20);
ntu8.setLocation(480,160);
ntu8.setSize(160,20);
ntu8.setFont(f1);
p6.add(ntu8);

nlu3=new JLabel("Date of Birth");
nlu3.setLocation(20,210);
nlu3.setSize(150,20);
nlu3.setFont(f1);
p6.add(nlu3);

ntu4=new JTextField(300);
ntu4.setLocation(50,250);
ntu4.setSize(160,20);
ntu4.setFont(f1);
p6.add(ntu4);

nlu4=new JLabel("Address");
nlu4.setLocation(430,210);
nlu4.setSize(100,20);
nlu4.setFont(f1);
p6.add(nlu4);

ntu5=new JTextField(15);
ntu5.setLocation(480,250);
ntu5.setSize(160,20);
ntu5.setFont(f1);
p6.add(ntu5);


nlu5=new JLabel("State");
nlu5.setLocation(20,280);
nlu5.setSize(100,20);
nlu5.setFont(f1);
p6.add(nlu5);

ntu6=new JTextField(20);
ntu6.setLocation(50,310);
ntu6.setSize(160,20);
ntu6.setFont(f1);
p6.add(ntu6);


nlu8=new JLabel("Pin Code");
nlu8.setLocation(430,280);
nlu8.setSize(100,20);
nlu8.setFont(f1);
p6.add(nlu8);

ndu1=new JTextField();
ndu1.setLocation(480,310);
ndu1.setSize(160,20);
ndu1.setFont(f1);
p6.add(ndu1);

nlu9=new JLabel("Salary");
nlu9.setLocation(20,340);
nlu9.setSize(100,20);
nlu9.setFont(f1);
p6.add(nlu9);

ntu9=new JTextField(20);
ntu9.setLocation(50,370);
ntu9.setSize(160,20);
ntu9.setFont(f1);
p6.add(ntu9);

nbu=new JButton("Save");
nbu.setLocation(480,370);
nbu.setSize(160,30);
nbu.setFont(f1);
p6.add(nbu);
nbu.addActionListener(this);

			
}
public void paintComponent(Graphics g)
{
	paintComponent(g);
	g.drawImage(bg,50,250,300,300,j);

}
public void actionPerformed(ActionEvent e)
	{	
		int ag;
		 //static int dr=0;

		
		if(e.getSource()==b1)
		{
	System.out.print("goooooooooooo");
	String S1=t1.getText();
	String S3=t3.getText();
	String S2=t2.getText();
		Connection con=null;
	try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String db_url="jdbc:mysql://localhost:3306/project?useSSL=false";
			String db_UNAME="root";
			String db_UPASS="";
			con= DriverManager.getConnection(db_url,db_UNAME,db_UPASS);
			System.out.print("xampp  mysql connected\n");
			Statement st=con.createStatement();
			String q="insert into user values ('"+S1+"','"+S2+"','"+S3+"')";
			st.executeUpdate(q);
			System.out.println("DATA INSERTED SUCESSFULLY...");
			con.close();
		} 
		catch(Exception e2)
		{
			System.out.print(e2.getMessage());
		}
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
  		 LocalDateTime now = LocalDateTime.now();  
		a1.setText("Company Name:- DAILY GENERAL STORE \nAddress:- INDORE\tCustomer Name:-"+S1+"\n"+dtf.format(now)+"\tMob.:- "+S2+"\n==============================================================\n ITEM\tQuantity\t Rate per\t  Amount\n\n");
		}
		
	if(e.getSource()==b2)
		{	System.out.print("cart");
			int i=Integer.parseInt(t7.getText());
			int j=Integer.parseInt((String)c.getSelectedItem());	
			ag=i*j;
			 dr= dr+ag;
			if(nc==1)
			{
				ag=0;
			}			
 
				
			a1.setText(a1.getText()+(String)cm1.getSelectedItem()+"\t"+(String)c.getSelectedItem()+"\t"+t7.getText()+"\t"+ag+"\n");
			

		}
		if(e.getSource()==b3)
		{	
a1.setText(a1.getText()+"\n========================================================\n Total Amount\t\t\t"+dr+"\n\tby Agent Name:-"+t8.getText());
					  nc++;
					  dr=0;
					   System.out.println(); 
		}
		if(e.getSource()==b6)
		{	try{
				a1.print();
				}catch(Exception e3){}	
		}
		if(e.getSource()==b8)
		{
			cl.show(pc,"0");

		}
		if(e.getSource()==b9)
		{
			cl.show(pc,"1");
			JOptionPane.showMessageDialog(null,"LOGOUT succesfully");
			t8.setText("");
			pss1.setText("");
			ta8.setText("");
			pssa1.setText("");

		}
		if(e.getSource()==b5)
		{
			System.out.print("yesss");

		}






		if(e.getSource()==b4)
		{
			try
			{
		String s1=t8.getText();
        Class.forName("com.mysql.jdbc.Driver");
			String db_url="jdbc:mysql://localhost:3306/project?useSSL=false";
			String db_UNAME="root";
			String db_UPASS="";
			Connection con= DriverManager.getConnection(db_url,db_UNAME,db_UPASS);
			System.out.print("xampp  mysql connected\n");
			Statement st1=con.createStatement();
			String q="select name from new where name='"+s1+"'";
		ResultSet rs=st1.executeQuery(q);
		if(s1.equals(""))
		{
			JOptionPane.showMessageDialog(null,"fail!! ID is mandatory");
		}
		if(rs.next())
		{
		if(pss1.getText().equals("1234"))
		{	
		JOptionPane.showMessageDialog(null,"LOGIN succesfully as "+t8.getText());
		cl.show(pc,"3");
		}
		}
		if((pss1.getText().equals(""))&&(t8.getText().equals("")))
		{
			JOptionPane.showMessageDialog(null,"fail!! Please fill user id and password");
		}
		if(pss1.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"fail!! Password is Required");
		}
			}
			catch(Exception e4)
			{
				System.out.println(e4);
			}
		}








		if(e.getSource()==ba4)
		{
		if(ta8.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"ID is mandatory");
		}
		if(pssa1.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"Password is Required");
		}
		if((pssa1.getText().equals("Admin123")&&ta8.getText().equals("Admin")))
		{
		JOptionPane.showMessageDialog(null,"LOGIN succesfully as "+ta8.getText());
		cl.show(pc,"search");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Please Enter Right Admin id and Password");
		}
		}
		if(e.getSource()==b11)
		{
			cl.show(pc,"1");
			t8.setText("");
			pss1.setText("");

		}
		if(e.getSource()==b10)
		{
			cl.show(pc,"new");

		}
		if(e.getSource()==nb)
		{
				Connection con=null;
				String s1=nt1.getText();
				String s2=nt3.getText();
				String s3=nt4.getText();
				String s4=nt7.getText();
				String s5=nt8.getText();
				String s6=nt5.getText();
				String s7=nt6.getText();
				String s8=nd1.getText();
				String s9=nt9.getText();
	try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String db_url="jdbc:mysql://localhost:3306/project?useSSL=false";
			String db_UNAME="root";
			String db_UPASS="";
			Connection conn= DriverManager.getConnection(db_url,db_UNAME,db_UPASS);
			System.out.print("xampp  mysql connected\n");
			Statement stt=conn.createStatement();
			String qq="insert into new values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"')";
//(,'"+nt3.getText()+"','"+nt4.getText()+"','"+nt7.getText()+"','"+nt5.getText()+"','"+nt6.getText()+"','"+nt8.getText()+"','"+nd1.getText()+"',"+nt9.getText()+"')
			stt.executeUpdate(qq);
			JOptionPane.showMessageDialog(null,"Data is Successfully Stored in DataBase");
			System.out.println("DATA INSERTED SUCESSFULLY...");
			conn.close();
		} 
		catch(Exception e2)
		{
			System.out.print(e2.getMessage());
		}
		cl.show(pc,"0");
		nt1.setText("");
		nt3.setText("");
		nt4.setText("");
		nt5.setText("");
		nt6.setText("");
		nt7.setText("");
		nt8.setText("");
		nt9.setText("");
		nd1.setText("");
		}
		if(e.getSource()==nbb)
		{
			cl.show(pc,"0");
		}
		if(e.getSource()==sb1)
		{	System.out.print("search");

			try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			String db_url="jdbc:mysql://localhost:3306/project?useSSL=false";
			String db_UNAME="root";
			String db_UPASS="";
			Connection conn= DriverManager.getConnection(db_url,db_UNAME,db_UPASS);
			System.out.print("xampp  mysql connected\n");
			Statement st1=conn.createStatement();
			String d=ns1.getText();
			String re="Select name,mob,salary from new where name='"+d+"'";
			ResultSet rs=st1.executeQuery(re);
			int counter=0;
			if(counter<=1)
			{
				s.setText("Name\tMobile No.\t Salary\n\n");
				counter++;
			}
			if(rs.next())
			{
				do{
					s.setText(s.getText()+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\n");
					
				}while(rs.next());
			}
			else
			{
				s.setText("no record is found");
			}
			conn.close();
		} 
		catch(Exception e2)
		{
			System.out.print(e2.getMessage());
		}
		}
		if(e.getSource()==sb2)
		{	
			try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			String db_url="jdbc:mysql://localhost:3306/project?useSSL=false";
			String db_UNAME="root";
			String db_UPASS="";
			Connection conn= DriverManager.getConnection(db_url,db_UNAME,db_UPASS);
			System.out.print("xampp  mysql connected\n");
			Statement st1=conn.createStatement();
			String d=ns1.getText();
			String rr="Select name,fname,dob,email,mob,address,salary from new where name='"+d+"'";
			ResultSet rf=st1.executeQuery(rr);
			int counter=0;
			 if(counter<=1)
			 {
			 	sa.setText("Name  Father Name   Date of Birth    Email   Mobile No.   Address  Salary\n\n");
			 }
			
			if(rf.next())
			{	
				do{
			sa.setText(sa.getText()+rf.getString(1)+"   "+rf.getString(2)+"   "+rf.getString(3)+"   "+rf.getString(4)+"   "+rf.getString(5)+"   "+rf.getString(6)+"   "+rf.getString(7)+"\n");
				}while(rf.next());
			}
			else
			{
				sa.setText("No Such detail are found !!");
			}
			conn.close();
		} 
		catch(Exception e2)
			{
				System.out.print(e2.getMessage());
			}

		}

		if(e.getSource()==sb3)
		{
			cl.show(pc,"0");
			ta8.setText("");
			pssa1.setText("");
		}
		if(e.getSource()==sb4)
		{	
			try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			String db_url="jdbc:mysql://localhost:3306/project?useSSL=false";
			String db_UNAME="root";
			String db_UPASS="";
			Connection conn= DriverManager.getConnection(db_url,db_UNAME,db_UPASS);
			System.out.print("xampp  mysql connected\n");
			Statement st1=conn.createStatement();
			String d=ns1.getText();
			String rr="Select name,fname,dob,email,mob,address,salary from new where name='"+d+"'";
			ResultSet rf=st1.executeQuery(rr);
			int counter=0;
			 if(counter<=1)
			 {
			 	sa.setText("Name  Father Name   Date of Birth    Email   Mobile No.   Address  Salary\n\n");
			 }
			
			if(rf.next())
			{	
				do{
			sa.setText(sa.getText()+rf.getString(1)+"   "+rf.getString(2)+"   "+rf.getString(3)+"   "+rf.getString(4)+"   "+rf.getString(5)+"   "+rf.getString(6)+"   "+rf.getString(7)+"\n");
				}while(rf.next());
			}
			else
			{
				sa.setText("No Such detail are found !!");
			}
			conn.close();
		} 
		catch(Exception e2)
			{
				System.out.print(e2.getMessage());
			}

		}
		if(e.getSource()==sb4)
		{
			cl.show(pc,"update");
				
			}
		if(e.getSource()==nbu)
		{
				String su1=ntu1.getText();
				String su2=ntu3.getText();
				String su3=ntu4.getText();
				String su4=ntu7.getText();
				String su5=ntu8.getText();
				String su6=ntu5.getText();
				String su7=ntu6.getText();
				String su8=ndu1.getText();
				String su9=ntu9.getText();
				String d=ns1.getText();
	try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String db_url="jdbc:mysql://localhost:3306/project?useSSL=false";
			String db_UNAME="root";
			String db_UPASS="";
			Connection connc= DriverManager.getConnection(db_url,db_UNAME,db_UPASS);
			System.out.print("xampp  mysql connected\n");
			Statement stt1=connc.createStatement();
			String qq1="insert into new values('"+su1+"'"+su2+"','"+su3+"','"+su4+"','"+su5+"','"+su6+"','"+su7+"','"+su8+"','"+su9+"')";
			stt1.executeUpdate(qq1);
			JOptionPane.showMessageDialog(null,"Data is Successfully Stored in DataBase");
			System.out.println("DATA INSERTED SUCESSFULLY...");
			connc.close();
		} 
		catch(Exception e2)
		{
			System.out.print(e2.getMessage());
		}
		cl.show(pc,"0");
		ntu1.setText("");
		ntu3.setText("");
		ntu4.setText("");
		ntu5.setText("");
		ntu6.setText("");
		ntu7.setText("");
		ntu8.setText("");
		ntu9.setText("");
		ndu1.setText("");
		ta8.setText("");
		pssa1.setText("");
		}

if(e.getSource()==sb5)
		{	
			try
		{
			Class.forName("com.mysql.jdbc.Driver");	
			String db_url="jdbc:mysql://localhost:3306/project?useSSL=false";
			String db_UNAME="root";
			String db_UPASS="";
			Connection conn= DriverManager.getConnection(db_url,db_UNAME,db_UPASS);
			System.out.print("xampp  mysql connected\n");
			Statement st1=conn.createStatement();
			String d=ns1.getText();
			String rr="delete from new where name='"+d+"'";
			st1.executeUpdate(rr);
			JOptionPane.showMessageDialog(null,"Deleted");
			conn.close();
		} 
		catch(Exception e2)
			{
				System.out.print(e2.getMessage());
			}

		}

	}
}

		

class express
{
	public static void main(String ar[])
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				
				main m=new main();
				
			}

		})	;
			

	}

}