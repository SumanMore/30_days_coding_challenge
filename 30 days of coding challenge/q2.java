import java.util.Scanner;
 
public class q2 {
    public static void main(String args[]) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        for(int i=0; i<n-1; i++) {
        	int c=a+b;
        	System.out.print(" "+c);
        	a=b;
        	b=c;
        }
        System.out.println();
    System.out.println("Partial sum "+result(n));
       
        
    }
    
    static int result(int n)
    {
       int arr[]=new int[n+1];
        arr[0] = 0; 
        arr[1] = 1;
        int add = arr[0] + arr[1];
      
        for (int i=2; i<=n; i++)
        {
        	arr[i] = arr[i-1]+arr[i-2];
            add += arr[i];
        }
      
        return add;
    }
}