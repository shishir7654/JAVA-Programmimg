import java .io.*;
public class DemostringComparision
{
public static void main(String[] args)
{
String s1="java";
String s2="java";
String s3=new String("java");
String s4=new String("JAVA");

if(s1==s2)

System.out.println("Shallow comparision:refrence is checked");

if(s1.equals(s2))
System.out.println("Deep comparision:refrence is checked");

if(s3.equals(s3))
System.out.println("Deep comparision:refrence is checked");
System.out.println("s1==s3:"+(s1==s3));
System.out.println("s3.equals(s4):"+(s3.equals(s4)));
System.out.println("s1.equalsIgnoreCase(s4):"+s1.equalsIgnoreCase(s4));
}
}



