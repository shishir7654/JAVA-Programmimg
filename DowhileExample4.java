import java.io.*;
public class DowhileExample4
{
public static void main(String []args)throws IOException
{
int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the number");
n=Integer.parseInt(br.readLine());
do
{
System.out.println(n);
--n;
}
while(n>=1);
}
}