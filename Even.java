import java.io.*;
class Even
{ 
 
 public
 int a;
   void get()throws IOException
      {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the value of a");
       a=Integer.parseInt(br.readLine());
       if(a%2==0)
	System.out.print("Numner is even");    
      }
 public static void main(String args[])throws IOException
 {
  Even e=new Even();
     e.get();
    }
}
       
       
     
