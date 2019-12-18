
import java.awt.*;
class AwtFirsttt extends Frame
 {
AwtFirsttt()
{
Button b1=new Button("Clock me");
b1.setBounds(30,100,80,30);    //setting button position
add(b1);                   //adding button into frame
setSize(600,600);   //frame size 300 width and 300height
setLayout(null);    //no layout manager
setVisible(true);   //frame will visible



Button c1=new Button("Clock me");
c1.setBounds(220,100,80,30);    //setting button position
add(c1);      //adding button into frame
setSize(600,600);   //frame size 300 width and 300height
setLayout(null);   //no layout manager
setVisible(true);  //frame will visible

Button d1=new Button("Clock me");
d1.setBounds(100,200,80,30);   //setting button position
add(d1);    //adding button into frame
TextField t1=new TextField();
t1.setBounds(30,200,80,25);
add(t1);
TextArea t2=new TextArea();
t2.setBounds(30,500,80,50);
add(t2);

setSize(700,600);   //frame size 300 width and 300height
setLayout(null);    //no layout manager
setVisible(true);   //frame will visible
}
public static void main(String args[])
{
 AwtFirsttt f=new  AwtFirsttt();
}
}
