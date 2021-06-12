import java.util.*;
public class q75 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        System.out.println(dfactorial(n));
    }
    public static long dfactorial(long n)
    {
        if(n==0||n==1)
           return 1;
        else
           return n* dfactorial(n - 2);
    }
}
