

import java.util.*;
public class q23 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        int n1=sc.nextInt();
        int B[]=new int[n1];
        
        int C[]=new int[n+n1];
        int n2=n+n1;
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n1;i++)
        {
            B[i]=sc.nextInt();
        }
        int z=0;
        for(int j=0;j<n2;j++)
        {
            C[j]=A[z];
            j++;
            C[j]=B[z];
           
            z++;
        }
        for(int i=0;i<n2;i++)
        {
            System.out.print(C[i]+" ");
        }


    }
    
}
