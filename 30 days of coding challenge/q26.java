import java.util.*;
public class q26 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
    System.out.println("enter a number to be checked");
	int n=sc.nextInt();
	int i,f=0;
	for(i=0;i<n;i++)
	{
		if((i*(i+1))==n)
		{
			f=1;
			break;
		}
	}
	if(f==1)
	   System.out.println("the number "+n+" is pronic");
	else
		System.out.println("the number "+n+" is not pronic");
    sc.close();    
}
}
		
	