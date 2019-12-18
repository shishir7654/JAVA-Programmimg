import java.awt.*;
import java.awt.event.*;
class AAwtWelcome extends Frame implements ActionListener
{


	Choice qua;
	Button b0,b4;
	Label l1,l2;
	TextField t1,t2;
                 AAwtWelcome()
	{
			super("Manager Form");
		setLayout(null);
                  setBackground(Color.RED);
	l1=new Label(" YOUR ARE WELCOME T0 FACEBOOK");
		l1.setFont(new Font("Arials",1,28));  
		l1.setBounds(170,290,500,60);
		l1.setForeground(Color.white);
		add(l1);

		b4=new Button("Home");
		
		b4.setBounds(10,40,90,25);
		add(b4);
		b4.addActionListener(this);

			setVisible(true);
			setSize(1000,650);
                   }


	public void actionPerformed(ActionEvent e)
{
String str=e.getActionCommand();
if(str.equals("Home"));
{

AAwtfbpage s1=new AAwtfbpage();
setVisible(false);
}
}
public static void main(String args[])
{
AAwtWelcome f1=new AAwtWelcome();
}
} 