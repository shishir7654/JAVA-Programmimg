import java.awt.*;
public class Awtchoicedata
{
Awtchoicedata()
{
Frame f=new Frame("Checkbox Example");
Checkbox checkbox1=new Checkbox("c++");
checkbox1.setBounds(200,50,40,40);
Checkbox checkbox2=new Checkbox("java",true);
checkbox2.setBounds(200,140,40,40);
f.add(checkbox1);
f.add(checkbox2);
f.setSize(700,700);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[])
{
new Awtchoicedata();
}}



