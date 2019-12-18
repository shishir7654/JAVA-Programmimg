class Exception3
{
public static void main(String args[])
{
int n=(int)(Math.random()+5);
int arr[]={3,6,10,15};
try
{
int z=50/n;
System.out.println("Value of z is"+z);
System.out.println(arr[6]);
}
catch(ArithmeticException e)
{
System.out.println(e.toString());
}
catch(ArrayIndexOutOfBoundsException e1)
{
System.out.println(e1.toString());
}
}
}