import java.awt.*;
class AwtFirst extends Frame
 {
AwtFirst()
{
Button b=new Button("Clock me");
b.setBounds(30,100,80,30); //setting button position
add(b); //adding button into frame

setSize(300,300); //frame size 300 width and 300height
setLayout(null);//no layout manager
setVisible(true); //frame will visible
}
public static void main(String args[])
{
 AwtFirst f=new  AwtFirst();
}
}
