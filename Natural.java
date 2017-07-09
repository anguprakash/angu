import java.io.*;
import java.util.*;
class Natural{
public static void main(String[] args)throws IOException
{
int i,m,ans=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
m=Integer.parseInt(br.readLine());
for(i=1;i<=m;i++)
ans=ans+i;
System.out.println(ans);
}
