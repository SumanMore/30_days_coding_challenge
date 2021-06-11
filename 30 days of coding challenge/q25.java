import java.util.*;

public class q25 {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int t=sc.nextInt();
     
       System.out.println("öriginal no in binary form "+Integer.toBinaryString(n));
       n = n ^ 1 << (t-1);//using index which starts from zero
      // n=n^1<<t;//if taking first bit as index 1
       System.out.println("after toggling "+Integer.toBinaryString(n)+ ": " +n);
     
sc.close();
    }
    
}
