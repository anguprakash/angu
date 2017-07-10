import java.util.*;
class Digit{
  public static void main(String args[])
  {
  int n,i;
  int count=0;
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  while(n>0)
  {
       n=n/10;
       count++;
       }
       System.out.println(count);
       }
       }
