import java.awt.*;
import java.awt.event.*;
class AwtCustomercareEntry2 extends Frame implements ActionListener
{
Choice qua;
	Button b0,b1,b2,b3,b4;
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3,t4,t5;
	AwtCustomercareEntry2()
	{
		
		super("Customer management System");
		setLayout(null);
		Label l1=new Label("Register User form");    
		l1.setFont(new Font("Arials",1,30));                       
	                                                                                                                    
                                   l1.setBounds(390,20,600,100);
		l1.setForeground(Color.yellow);
		add(l1);

		setBackground(new Color(100,221,0));  //RGB color range 255
		b0=new Button("OK");
		b0.setBounds(390,600,70,30);
		b0.setFont(new Font("Arials",1,16));
		b0.setForeground(new Color(70,40,0));
		add(b0);
		b0.addActionListener(this);

		b1=new Button("Reset");
		b1.setBounds(510,600,70,30);
		b1.setFont(new Font("Arials",1,16));
		b1.setForeground(new Color(70,40,0));
		add(b1);


		b4=new Button("Home");
		
		b4.setBounds(10,40,90,25);
		add(b4);
		b4.addActionListener(this);

		l2=new Label("User Name");
		l2.setBounds(100,150,180,30);
		l2.setFont(new Font("Arials",1,28));
		l2.setForeground(Color.yellow);
		add(l2);

		l3=new Label("Password");
		l3.setBounds(100,200,180,30);
		l3.setFont(new Font("Arials",1,28));
		l3.setForeground(Color.yellow);
		add(l3);

		l4=new Label("Retype Password");
		l4.setBounds(85,250,180,30);
		l4.setFont(new Font("Arials",1,28));
		l4.setForeground(Color.yellow);
		add(l4);

		l4=new Label("User Type");
		l4.setBounds(100,300,180,30);
		l4.setFont(new Font("Arials",1,28));
		l4.setForeground(Color.yellow);
		add(l4);

		
		 TextField t1=new TextField(20);
		TextField t2=new TextField(20);
		t1.setBounds(340,150,240,30);
		t2.setBounds(350,200,240,30);
		add(t1);
		add(t2);
		TextField t3=new TextField(20);
		t3.setBounds(360,250,240,30);
		add(t3);
		TextField t4=new TextField(20);
		t4.setBounds(370,300,240,30);
		add(t4);
		
		   setVisible(true);
			setSize(1100,650);
}
public void actionPerformed(ActionEvent ae)
        {
	String str=ae.getActionCommand();
	if(str.equals("OK"))
	{
	System.out.print("Hii");
	AwtComplainForm e1=new AwtComplainForm();
	setVisible(false);
	}
}
public static void main(String args[])
{
AwtCustomercareEntry2  c1=new AwtCustomercareEntry2();
}
}
		


