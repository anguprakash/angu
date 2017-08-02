import java.util.*;
class Prime1{
  public static void main(String args[])
  {
    int i,n,count=0;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(i=2;i<n;i++)
    {
      if(n%i==0)
      {
        count++;
        break;
        }
        }
        if(count==0)
        {
          System.out.println("prime number");
          }
          else {
            
          System.out.println("not a prime number");
          }
          }
          }
