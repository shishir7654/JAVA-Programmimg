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
BuferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the value of l,b");
l=Integer.parseInt(br.readLine());
b=Integer.ParseInt(br.readLine());
a=0.5*(l*b);
System.out.print("Area is"+a);
}
public static void main(String arge[])throws IOException
{
Area t1=new Area();
t1.Area();
t1.get();
}
}



