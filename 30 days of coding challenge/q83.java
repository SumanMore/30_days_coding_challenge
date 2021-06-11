
import java.util.*;
public class q83 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)

        {
          if(ar[i]<=ar[i+1])
          {
              System.out.print(ar[i+1]+" ");
          }

        }
        System.out.print(ar[n-1]);
        
sc.close();

    }

    
}
