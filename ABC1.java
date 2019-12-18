import java.io.*;
class ABC1
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
 System.out.print("Enter the value");
int x;
x=Integer.parseInt(br.readLine());
System.out.print("value is"+x);
}
catch(Exception e)
{
System.out.println(e);
}
}}