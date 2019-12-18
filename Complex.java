import java.io.*;
class Complex
 {
  private
  int real1,real2,img1,img2,a,b;
  public
  void get()throws IOException
{
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              System.out.print("Enter the value of complex no");

     real1=Integer.parseInt(br.readLine());
     real2=Integer.parseInt(br.readLine());
     img1=Integer.parseInt(br.readLine()); 
     img2=Integer.parseInt(br.readLine());
}
            void show()
{
            a=real1+real2;
            b=img1+img2;
           System.out.print(a);      //s.o.p("a+"+"+"i"+b);
           System.out.print("+");
           System.out.print("i");
           System.out.print(b);
}
      public static void main(String arge[])throws IOException
{
      Complex r1=new Complex();
      r1.get();
      r1.show();
}
}