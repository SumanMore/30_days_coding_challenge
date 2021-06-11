import java.util.*;

public class q81 {
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        int sum=0,sum1=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
            sum=sum+ar[i];
        
        }
        for(int j=n/2;j<n;j++)
        {
            sum1=sum1+ar[j];
        }

        int a=Math.abs(sum-sum1);    
        System.out.print(a);
sc.close();
    }
    
}
