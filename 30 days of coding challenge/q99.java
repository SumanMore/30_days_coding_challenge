import java.text.DecimalFormat;
import java.text.NumberFormat;

public class q99 {
		public static boolean isPrime(int n)
		{
			if (n < 2) 
			    return false;
			if (n == 2 || n == 3) 
			    return true;
			if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) 
			    return false;
			int sqrtN = (int)Math.sqrt(n) + 1;
			for (int i = 6; i <= sqrtN; i += 6) 
			{
			    if (n % (i - 1) == 0 || n % (i + 1) == 0) 
			        return false;
			}
			return true;
		}
		
		public static int getNextPrime(int n)
		{
			boolean prime = false;
			while (!prime)
			{
				n += 2;
				prime = isPrime(n);
			}
			return n;
		} 
		public static int rotate(int n, int length)
		{
			int rightDigit = n % 10;		//gets right digit
			int temp = (n - rightDigit) / 10;	//gets all but right digit
			return (rightDigit * (int)(Math.pow(10, length - 1))) + temp; 	//rotates digits
		}
		public static boolean isCircular(int n)
		{
			boolean circular = true;
			int length = (int) Math.log10((long)n) + 1; //determines amount of digits in n
			
			
			int i = 0;
			while (i < length - 1 && circular)
			{
				n = rotate(n, length);
				circular = isPrime(n);
				i++;
			}
			return circular;
		}
	public static void main(String[] args) {
			
			//Iterates to one million and counts circular primes on the way
			int n = 11;
			int total = 4;
			while (n < 1000000)
			{
				if (isCircular(n))
				{  
					total++;
				}
				n = getNextPrime(n);
			}
			System.out.println("Total of circular primes below one million: " + total);
	}
}