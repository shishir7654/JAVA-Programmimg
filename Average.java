import java.io.*;
class Average
{
public static void main(String arge[])throws IOException
  {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the three value");
int x,y,z,avg;
x=Integer.parseInt(br.readLine());
y=Integer.parseInt(br.readLine());
z=Integer.parseInt(br.readLine());
avg=(x+y+z)/3;
System.out.print("Average is"+avg);
}
} 