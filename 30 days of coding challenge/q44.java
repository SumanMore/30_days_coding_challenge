import java.util.Scanner;

public class q44 {
 public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();	
			
	if (isPallindrome(n)) {
		System.out.println(n + " is palindrome");
    }
						
    else {
	    System.out.println(n + " is not palindrome");	
    }
														
}
	public static boolean isPallindrome(int n)
	{
		int rev = 0;
		int r = n;
		while (r > 0)
		{
									
		 rev = (rev << 1) | (r & 1);
		 r = r >> 1;
	        }
																	
		return n == rev;
	}
}