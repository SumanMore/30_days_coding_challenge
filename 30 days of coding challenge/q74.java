

import java.util.*;
public class q74 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
double arr[]=new double[n];
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextDouble();

}
double sum=0;
for(int i=0;i<n;i++)
{
sum=sum+(1/arr[i]);
}
double sum1=n/sum;
System.out.print(sum1);



    }
}
