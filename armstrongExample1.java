import java.io.*;
public class armstrongExample1     //bin jdk8
{
   public static void main(String[]args)throws IOException
{
   int num,number,temp,total=0;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the number ");
num=Integer.parseInt(br.readLine());
   number=num;
   while(number!=0)
{
   temp=number%10;
   total=total+temp*temp*temp;
   number=number/10;
}
  if(total==num)
    System.out.println(num+"is an Armstrong number");
	else
	System.out.println(num +" is not an Armstrong number");

}
}
