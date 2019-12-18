import java.io.*;
class ABC
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Enter the value");
int x;
x=Integer.parseInt(br.readLine());
System.out.print("value is"+x);
}
}