import java.io.*;
class convet
{
public static void main(String[]args)throws IOException
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter an integer:");
String str=br.readLine();

int i=Integer.parseInt(str);
System.out.print("In decimal:"+i);

str=Integer.toBinaryString(i);
System.out.println("In binary:"+str);

str=Integer.toHexString(i);
System.out.println("In hexadecimal:"+str);

str=Integer.toOctalString(i);
System.out.println("In octal:"+str);
}
}






