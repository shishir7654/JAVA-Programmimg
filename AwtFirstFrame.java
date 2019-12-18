import java.awt.*;
import java.awt.event.*;
class AwtFirstpage extends Frame implements ActionListener
{
Button b1,b2;
Label l1;

AwtFirstpage()
{
super ("First Frame window");
setLayout(null);
b1=new Button ("clickNext");
b1.setBounds(50,100,80,25);
add(b1);
b1.addActionListener(this);
l1=new Label("This is first page");
l1.setBounds(20,50,200,25);
add(l1);

setSize(700,700);
setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
String str=e.getActionCommand();
if(str.equals("clickNext"));
{

AwtSecondpage s1=new AwtSecondpage();
setVisible(false);
}
}
}
class AwtFirstFrame
{
public static void main(String args[])
{
AwtFirstpage f1=new AwtFirstpage();
}
} 