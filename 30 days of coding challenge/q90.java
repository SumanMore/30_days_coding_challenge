import java.util.*;
public class q90 {
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a integer");
    int n=sc.nextInt();
    int d=Math.abs(n);
    int r,rev=0;
    while(d!=0)
    {
         r=d%10;
         rev=rev*10+r;
         d/=10;
  }
  if(n<0)
      System.out.println(-rev);
  else
    System.out.println(rev);

}

}
