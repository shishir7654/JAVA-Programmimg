import java.awt.*;
import java.awt.event.*;
class AwtComplainForm extends Frame implements ActionListener
{

	Choice qua;
	Button b0,b1,b2,b3,b4;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	TextField t1,t2,t3,t4,t5,t6,t7;
	CheckboxGroup cbg;
	AwtComplainAllotment3()
	{
		
		super("Manager Form");
		setLayout(null);
		Label l1=new Label("COMPLAIN ALLOTMENT FORM");
		l1.setBounds(500,20,600,100);
		l1.setForeground(Color.yellow);
		add(l1);

		setBackground(new Color(100,221,0));  //RGB color range 255
		b0=new Button("Sbmit");
		b0.setBounds(600,650,70,30);
		b0.setFont(new Font("Arials",1,16));
		b0.setForeground(new Color(70,40,0));
		add(b0);

		b1=new Button("Reset");
		b1.setBounds(720,650,70,30);
		b1.setFont(new Font("Arials",1,16));
		b1.setForeground(new Color(70,40,0));
		add(b1);


		b4=new Button("Home");
		
		b4.setBounds(10,40,90,25);
		add(b4);
		b4.addActionListener(this);

		l2=new Label("Enter Name");
		l2.setBounds(55,105,180,30);
		l2.setFont(new Font("Arials",1,28));
		l2.setForeground(Color.yellow);
		add(l2);

		l7=new Label("Subject");
		l7.setBounds(55,150,180,30);
		l7.setFont(new Font("Arials",1,28));
		l7.setForeground(Color.yellow);
		add(l7);

		l3=new Label("Address");
		l3.setBounds(55,205,180,30);
		l3.setFont(new Font("Arials",1,28));
		l3.setForeground(Color.yellow);
		add(l3);

	            /*     l4=new Label("Police station name");
		l4.setBounds(50,280,180,30);
		l4.setFont(new Font("Arials",1,28));
		l4.setForeground(Color.yellow);
		add(l4);*/

		  l6=new Label("Complain Type");
		l6.setBounds(50,290,210,30);
		l6.setFont(new Font("Arials",1,28));
		l6.setForeground(Color.yellow);
		add(l6);

		l5=new Label("City");
		l5.setBounds(55,400,180,30);
		l5.setFont(new Font("Arials",1,28));
		l5.setForeground(Color.yellow);
		add(l5);

		l8=new Label("phone");
		l8.setBounds(55,470,180,30);
		l8.setFont(new Font("Arials",1,28));
		l8.setForeground(Color.yellow);
		add(l8);

		l9=new Label("Email");
		l9.setBounds(55,520,180,30);
		l9.setFont(new Font("Arials",1,28));
		l9.setForeground(Color.yellow);
		add(l9);

		l10=new Label("Your complaint");
		l10.setBounds(50,600,200,30);
		l10.setFont(new Font("Arials",1,28));
		l10.setForeground(Color.yellow);
		add(l10);
		


	/*Choice c1=new Choice();
	c1.setBounds(300,283,150,150);
	c1.add("Select police Station");
	c1.add("Jaipur police");
	c1.add("Delhi police");
	c1.add(" kolkata police");
	c1.add("Mumbai police");
	c1.add(" Bihar police");
	add(c1);*/




	Choice c2=new Choice();
	c2.setBounds(290,290,210,30);
	c2.add("--Select type--");
	c2.add("Action Complain");
	c2.add("Withholding Complain");
	c2.add("Aggresive complain");
	add(c2);

			TextField t1=new TextField(20);
		                 t1.setBounds(220,105,180,30);
		                  add(t1);

			TextField t2=new TextField(20);
		                 t2.setBounds(220,150,180,30);
		                  add(t2);
			
			TextField t3=new TextField(20);
		                 t3.setBounds(220,205,180,30);
		                  add(t3);
	
			TextField t4=new TextField(20);
		                 t4.setBounds(200,400,180,30);
		                  add(t4);

			TextField t5=new TextField(20);
		                 t5.setBounds(200,470,180,30);
		                  add(t5);

			TextField t6=new TextField(20);
		                 t6.setBounds(200,520,180,30);
		                  add(t6);
			

			TextField t7=new TextField(20);
		                 t7.setBounds(260,600,180,30);
			
		                  add(t7);
			
				

	                                  setVisible(true);
			setSize(1200,700);
}
public void actionPerformed(ActionEvent ae)
        {
	String str=ae.getActionCommand();
	if(str.equals("Home"))
	{
	AwtComplainForm e1=new AwtComplainForm();
	setVisible(false);
	}
}
public static void main(String args[])
{
AwtComplainAllotment3 c1=new AwtComplainAllotment3();
}
}
		




		
		