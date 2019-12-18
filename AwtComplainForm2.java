import java.awt.*;
import java.awt.event.*;
class AwtComplainForm2 extends Frame implements ActionListener
{

	Choice qua;
	Button b0,b1,b2,b3,b4;
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3,t4;
	AwtComplainForm2()
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

		b1=new Button("Reset");
		b1.setBounds(510,500,70,30);
		b1.setFont(new Font("Arials",1,16));
		b1.setForeground(new Color(70,40,0));
		add(b1);


		b4=new Button("Home");
		b4.addActionListener(this);
		b4.setBounds(10,40,90,25);
		add(b4);

		l2=new Label("Complain_ID");
		l2.setBounds(130,195,180,40);
		l2.setFont(new Font("Arials",1,28));
		l2.setForeground(Color.yellow);
		add(l2);

		TextField t1=new TextField(20);
		t1.setBounds(400,195,250,30);
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
AwtComplainForm2 c1=new AwtComplainForm2();
}
}
		