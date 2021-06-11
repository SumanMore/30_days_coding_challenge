

import java.util.Scanner;

public class q77 {
    public static void main(String args[])
    {
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        int ar[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if((Math.abs(ar[i]-ar[j])==num))
                {
                       c++;
                    System.out.print("("+ar[i]+","+ar[j]+")  ");
                   System.out.println(c);
                }
            }
        }
        sc.close();
    }
}
