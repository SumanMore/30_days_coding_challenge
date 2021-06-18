import java.util.*;
public class q39 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of test cases");
        int t=sc.nextInt();
        boolean res;
        for(int i=1;i<=t;i++)
        {
            System.out.println("enter m");
           int m=sc.nextInt();
       System.out.println("enter n");
       int n=sc.nextInt();
     m=m==1?2:m;
       for( int j=m;j<=n;j++)
     {
       res=prime(j);
       if(res)
         System.out.print(j+ " ");

   }
   System.out.println();

}}
public static  boolean prime(int n)
{
    for(int i=2;i<=Math.sqrt(n);i++)
    {
        if(n%i==0)
           return false;

    }
    return true;


}
        

    
}
