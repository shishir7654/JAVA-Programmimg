import java.awt.*;
import java.awt.event.*;
class AAwtfbpage extends Frame implements ActionListener
{
Choice qua;//not predefine
Button b0,b1,b2,b3,b4;
Label l1,l2,l3,l4,l5,l9,l8;
TextField t1,t2,t3,t4;
AAwtfbpage()
{
super("Facebook");
setLayout(null);
Label l1=new Label("FaceBook");
l1.setFont(new Font("Californian FB",1,50));
l1.setBounds(390,50,600,100);
l1.setForeground(new Color(0,0,255));
add(l1);




setBackground(new Color(0,255,255));
b0=new Button("SignUp");
b0.setBounds(390,500,70,30);
b0.setFont(new Font("Arials",1,16));
b0.setForeground(new Color(70,40,0));
b0.addActionListener(this);
add(b0);


l2=new Label("First Name");
l2.setBounds(130,195,180,40);
l2.setFont(new Font("Arials",1,28));
l2.setForeground(Color.black);
add(l2);

l3=new Label("Surname");
l3.setBounds(130,250,180,40);
l3.setFont(new Font("Arials",1,28));
l3.setForeground(Color.black);
add(l3);

l4=new Label("Mobile Num");
l4.setBounds(130,305,270,40);
l4.setFont(new Font("Arials",1,28));
l4.setForeground(Color.black);
add(l4);

l5=new Label("New Password");
l5.setBounds(130,355,270,40);
l5.setFont(new Font("Arials",1,28));
l5.setForeground(Color.black);
add(l5);

l9=new Label("Gender");
l9.setBounds(130,400,270,40);
l9.setFont(new Font("Arials",1,28));
l9.setForeground(Color.black);
add(l9);



TextField t1=new TextField(20);
t1.setFont(new Font("Times New Roman",0,18));
t1.setBounds(400,200,250,30);
TextField t2=new TextField(20);
t2.setFont(new Font("Times New Roman",0,18));
t2.setBounds(400,250,250,30);
TextField t3=new TextField(20);
t3.setFont(new Font("Times New Roman",0,18));
t3.setBounds(400,300,250,30);
TextField t4=new TextField(20);
t4.setFont(new Font("Times New Roman",0,18));
t4.setBounds(400,350,250,30);
add(t1);
add(t2);
add(t3);
add(t4);


CheckboxGroup cbg = new CheckboxGroup();  
 
Checkbox checkBox1 = new Checkbox("Male", cbg, false);
checkBox1.setFont(new Font("Arials",1,18));
checkBox1.setBounds(400,400, 60,50);
Checkbox checkBox2 = new Checkbox("Female", cbg, true);
checkBox2.setFont(new Font("Arials",1,18));
checkBox2.setBounds(470,400, 110,50);
add(checkBox1);
 add(checkBox2); 


          //DOB
l8=new Label("DOB");
l8.setBounds(130,450,270,40);
l8.setFont(new Font("Arials",1,28));
l8.setForeground(Color.black);
add(l8);

Choice c1=new Choice();
c1.setBounds(400,450,70,45);
c1.add("Date");
c1.add("01");
c1.add("02");
c1.add("03");
c1.add("04");
c1.add("05");
Choice c2=new Choice();
c2.setBounds(480,450,100,45);
c2.add("Month");
c2.add("January");
c2.add("February");
c2.add("March");
c2.add("April");
c2.add("May");
c2.add("June");
c2.add("July");
c2.add("August");
c2.add("September");
c2.add("October");
c2.add("November");
c2.add("December");
Choice c3=new Choice();
c3.setBounds(590,450,70,45);
c3.add("Year");
c3.add("2001");
c3.add("2002");
c3.add("2003");
c3.add("2004");
c3.add("2005");


add(c1);
add(c2);
add(c3);       

//closing button code
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e1)
{
System.exit(0);
}
});
setVisible(true);
setSize(1100,650);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(str.equals("SignUp"))
{
AAwtWelcome e1=new AAwtWelcome();
setVisible(false);
}
}


public static void main(String args[])
{
AAwtfbpage c1=new AAwtfbpage();
}
}
