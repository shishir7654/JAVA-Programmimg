import java.io.*;
public class DemocopyValueOf
{
public static void main(String[] args)
{
char ch[]={'e','n','l','i','g','h','t','m','e','n','t'};
String str=new String(ch);
System.out.println("string conversion of ch[] is:"+str);

String str1=String.copyValueOf(ch);
System.out.println("Result of copyValueOf(ch) is:"+str1);

String str2=String.copyValueOf(ch,2,5);
System.out.println("Result of copyValueOf(ch,2,5) is:"+str2);
}
}