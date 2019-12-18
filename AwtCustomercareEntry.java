import java.awt.*;
import java.awt.event.*;
class AwtCustomercareEntry extends Frame implements ActionListener
{
Choice qua;
	Button b0,b1,b2,b3,b4;
	Label l1,l2,l3,l4,l5,l6,l7;
	TextField t1,t2,t3,t4,t5,t6,t7;
	AwtCustomercareEntry()
	{
		
		super("Customer management System");
		setLayout(null);
		Label l1=new Label("Customer Entry Form"); 
                          
	                                                                                                                    
                                   l1.setBounds(390,20,600,100);
		l1.setForeground(Color.red);
		add(l1);

		setBackground(new Color(100,221,0));  //RGB color range 255
		b0=new Button("Sbmit");
		b0.setBounds(390,600,70,30);
		b0.setFont(new Font("Arials",1,16));
		b0.setForeground(new Color(70,40,0));
		b0.addActionListener(this);
		add(b0);

		b1=new Button("Reset");
		b1.setBounds(510,600,70,30);
		b1.setFont(new Font("Arials",1,16));
		b1.setForeground(new Color(70,40,0));
		add(b1);


		b4=new Button("Home");
		b4.setBounds(10,40,90,25);
		add(b4);
		b4.addActionListener(this);

		l2=new Label("Enter Name");
		l2.setBounds(100,150,180,30);
		l2.setFont(new Font("Arials",1,28));
		l2.setForeground(Color.yellow);
		add(l2);

		l3=new Label("Last Name");
		l3.setBounds(100,200,180,30);
		l3.setFont(new Font("Arials",1,28));
		l3.setForeground(Color.yellow);
		add(l3);

		l4=new Label("Address");
		l4.setBounds(100,250,180,30);
		l4.setFont(new Font("Arials",1,28));
		l4.setForeground(Color.yellow);
		add(l4);

		l4=new Label("City");
		l4.setBounds(100,300,180,30);
		l4.setFont(new Font("Arials",1,28));
		l4.setForeground(Color.yellow);
		add(l4);

		l5=new Label("State");
		l5.setBounds(100,350,180,30);
		l5.setFont(new Font("Arials",1,28));
		l5.setForeground(Color.yellow);
		add(l5);

		l6=new Label("Email_ID");
		l6.setBounds(100,400,180,30);
		l6.setFont(new Font("Arials",1,28));
		l6.setForeground(Color.yellow);
		add(l6);

	                 l7=new Label("phone_no");
		l7.setBounds(100,450,180,30);
		l7.setFont(new Font("Arials",1,28));
		l7.setForeground(Color.yellow);
		add(l7);

	                 TextField t1=new TextField(20);
		TextField t2=new TextField(20);
		t1.setBounds(220,150,180,30);
		t2.setBounds(220,200,180,30);
		add(t1);
		add(t2);
		TextField t3=new TextField(20);
		t3.setBounds(220,250,180,30);
		add(t3);
		TextField t4=new TextField(20);
		t4.setBounds(220,300,180,30);
		add(t4);

		TextField t5=new TextField(20);
		t5.setBounds(220,350,180,30);
		add(t5);

		TextField t6=new TextField(20);
		t6.setBounds(220,400,180,30);
		add(t6);

		TextField t7=new TextField(20);
		t7.setBounds(220,450,180,30);
		add(t7);




	                                    setVisible(true);
			setSize(1100,650);
}
public void actionPerformed(ActionEvent ae)
        {
	String str=ae.getActionCommand();
	if(str.equals("Sbmit"))
	{
	AwtCustomercareEntry2  e1=new AwtCustomercareEntry2();
	setVisible(false);
	}
}
public static void main(String args[])
{
AwtCustomercareEntry c1=new AwtCustomercareEntry();
}
}
		


