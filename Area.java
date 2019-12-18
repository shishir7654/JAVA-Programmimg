import java.io.*;
class Area
{
private
int l,b,a;
public
Area()
{
l=0;
b=0;
}
void get()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the value of l,b");
l=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
}
void disp()
{
a=1*(l*b);
System.out.print("Area is"+a);
}
public static void main(String arge[])throws IOException
{
Area t1=new Area();
t1.disp();
t1.get();
t1.disp();
}
}




