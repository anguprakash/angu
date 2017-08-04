import java.util.*;
class ReverseNum1{
  public static void main(String args[])
  {
    int n,rev=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    while(n>0)
    {
      rev=rev*10;
      rev=rev+n%10;
      n=n/10;
      }
      System.out.println(rev);
      }
      }
