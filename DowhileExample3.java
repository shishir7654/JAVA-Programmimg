import java.io.*;
public class DowhileExample3
{
public static void main(String []args)throws IOException
{
int i=1,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the number");
n=Integer.parseInt(br.readLine());
do
{
System.out.println(i);
i++;
}
while(i<=n);
}
}