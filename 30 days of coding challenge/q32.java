import java.util.*;
public class q32 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n and m");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int mfact=fact(m);
		int nfact=fact(n);
		int mnfact=fact(n-m);
		int r=nfact/(mfact*mnfact);
		System.out.println("answer is : "+r);
		sc.close();
		
	}
	
		 public static  int fact( int k ) 
		 {
			 int f=1;
			 for(int i=1;i<=k;i++)
			 {
				 f=f*i;
			 }
			 return f;
		
	}
    
}
