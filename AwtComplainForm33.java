import java.awt.*;
import java.awt.event.*;
class AwtComplainForm33 extends Frame implements ActionListener
{

	Choice qua;
	Button b0,b1,b2,b3,b4;
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3,t4;
	Checkbox checkbox1,checkbox2,checkbox22,checkbox11,checkbox3,checkbox21;
	CheckboxGroup cbg;
	AwtComplainForm33()
	{
		
		super("Manager Form");
		setLayout(null);
		Label l1=new Label("Form page");
		l1.setBounds(500,20,600,100);
		l1.setForeground(Color.yellow);
		add(l1);

		setBackground(new Color(100,221,0));  //RGB color range 255
		b0=new Button("Sbmit");
		b0.setBounds(390,500,70,30);
		b0.setFont(new Font("Arials",1,16));
		b0.setForeground(new Color(70,40,0));
		add(b0);

		b1=new Button("Reset");
		b1.setBounds(510,500,70,30);
		b1.setFont(new Font("Arials",1,16));
		b1.setForeground(new Color(70,40,0));
		add(b1);


		b4=new Button("Home");
		b4.addActionListener(this);
		b4.setBounds(10,40,90,25);
		add(b4);

		l2=new Label("Enter Name");
		l2.setBounds(100,150,180,30);
		l2.setFont(new Font("Arials",1,28));
		l2.setForeground(Color.yellow);
		add(l2);

		l3=new Label("Choice");
		l3.setBounds(100,220,150,40);
		l3.setFont(new Font("Arials",1,28));
		l3.setForeground(Color.yellow);
		add(l3);

			l4=new Label("D.B.O");
		l4.setBounds(100,280,150,40);
		l4.setFont(new Font("Arials",1,28));
		l4.setForeground(Color.yellow);
		add(l4);

		l5=new Label("Choice");
		l5.setBounds(100,220,150,40);
		l5.setFont(new Font("Arials",1,28));
		l5.setForeground(Color.yellow);
		add(l5);


	Choice c1=new Choice();
	c1.setBounds(280,280,50,50);
	c1.add("Date");
	c1.add("1");
	c1.add("2");
	c1.add(" 3");
	c1.add("4");
	c1.add(" 5");
	add(c1);




	Choice c2=new Choice();
	c2.setBounds(350,280,95,95);
	c2.add("Month");
	c2.add("jan");
	c2.add("feb");
	c2.add(" mar");
	c2.add("april");
	c2.add(" may");
	add(c2);


	Choice c3=new Choice();
	c3.setBounds(500,280,95,95);
	c3.add("Year");
	c3.add("2000");
	c3.add("2001");
	c3.add(" 2002");
	c3.add("2003");
	c3.add(" 2004");
	add(c3);
	

 
 checkbox1=new Checkbox("music");
checkbox1.setBounds(280,220,50,50);
 checkbox2=new Checkbox("Cricket");
checkbox2.setBounds(370,220,50,50);
 checkbox3=new Checkbox("Next");
checkbox3.setBounds(450,220,50,50);

add(checkbox1);
add(checkbox2);
add(checkbox3);

 cbg=new CheckboxGroup();
 checkbox11=new Checkbox("Male",cbg,false);
checkbox11.setBounds(280,320,95,95);

checkbox22=new Checkbox("Female",cbg,true);
checkbox22.setBounds(380,320,95,95);
add(checkbox11);
add(checkbox22);

			TextField t1=new TextField(20);
		                 t1.setBounds(220,150,180,30);
		                  add(t1);

	                                  setVisible(true);
			setSize(1100,650);
}
public void actionPerformed(ActionEvent ae)
        {
	String str=ae.getActionCommand();
	if(str.equals("Home"))
	{
	//Frame Test e1=new Frame Test();
	//setVisible(False);
	}
}
public static void main(String args[])
{
AwtComplainForm33 c1=new AwtComplainForm33();
}
}
		




		
		