import java.util.Scanner;
 public class DowhileExample7
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number");
int n;
n=sc.nextInt();
do
{
if(n%2==1)  

System.out.println(n*n);
--n;
}

while(n>=5);
}
}