import java.util.*;
public class q31 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.println("enter matrix size");
	int n=sc.nextInt();
	int sum=0;
	int  ar[][] =new int[n][n];
    System.out.println("enter elements");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			ar[i][j]=sc.nextInt();
		}
	}
    /*System.out.println("array looks like :");
    for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
            System.out.print(ar[i][j]+" ");
        }
        System.out.println();
    }*/

	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
	
			if(i==0||j==0||j==(n-1)||i==(n-1))
			{
				sum+=ar[i][j];
			}
		}}
		System.out.println("the sum of bordered elements "+sum);
        sc.close();
	}}
	
	
	
	