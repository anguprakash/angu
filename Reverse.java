 import java.io.*;
 class Reverse{
   public static void main(String args[])throws IOException
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String a;
      a=br.readLine();
      StringBuilder b=new StringBuilder(a);
      b.reverse();
      System.out.println(b);
      }
      }
      
