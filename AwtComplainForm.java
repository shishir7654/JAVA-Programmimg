import java.awt.*;
import java.awt.event.*;
class AwtComplainForm extends Frame implements ActionListener
{

	Choice qua;
	Button b0,b1,b2,b3,b4;
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3,t4;
	AwtComplainForm()
	{
		
		super("Manager Form");
		setLayout(null);
		Label l1=new Label("Complain Entry Form");
		l1.setBounds(390,50,600,100);
		l1.setForeground(Color.yellow);
		add(l1);

		setBackground(new Color(100,0,0));
		b0=new Button("ok");
		b0.setBounds(390,500,70,30);
		b0.setFont(new Font("Arials",1,16));
		b0.setForeground(new Color(70,40,0));
		add(b0);
		b0.addActionListener(this);
		
		
		

		b1=new Button("Reset");
		b1.setBounds(510,500,70,30);
		b1.setFont(new Font("Arials",1,16));
		b1.setForeground(new Color(70,40,0));
		add(b1);


		b4=new Button("Homee");
		
		b4.setBounds(10,40,90,25);
		add(b4);
		b4.addActionListener(this);

		l2=new Label("Complain_ID");
		l2.setBounds(130,195,180,40);
		l2.setFont(new Font("Arials",1,28));
		l2.setForeground(Color.yellow);
		add(l2);

		l3=new Label("Customer_ID");
		l3.setBounds(130,250,180,40);
		l3.setFont(new Font("Arials",1,28));
		l3.setForeground(Color.yellow);
		add(l3);

		l4=new Label("Customer_ID Name");
		l4.setBounds(130,305,180,40);
		l4.setFont(new Font("Arials",1,28));
		l4.setForeground(Color.yellow);
		add(l4);

		l5=new Label("Complain Description");
		l5.setBounds(130,355,290,40);
		l5.setFont(new Font("Arials",1,28));
		l5.setForeground(Color.yellow);
		add(l5);

		TextField t1=new TextField(20);
		TextField t2=new TextField(20);
		t1.setBounds(400,195,250,30);
		t2.setBounds(400,250,250,30);
		add(t1);
		add(t2);
		TextField t3=new TextField(20);
		t3.setBounds(400,305,250,30);
		add(t3);
		TextField t4=new TextField(20);
		t4.setBounds(400,355,250,30);
		add(t4);

			setVisible(true);
			setSize(1100,650);
}
public void actionPerformed(ActionEvent ae)
        {
	String str=ae.getActionCommand();
	
	if(str.equals("Homee"))
	{
	System.out.print("Hello me");
                AwtCustomercareEntry2 e2=new AwtCustomercareEntry2();
	setVisible(false);
	}
	else if(str.equals("ok"))
	{
	System.out.print("Hello");
                AwtComplainAllotment3 e1=new AwtComplainAllotment3();
	setVisible(false);
	}
}
public static void main(String args[])
{
AwtComplainForm c1=new AwtComplainForm();
}
}
		




		
		