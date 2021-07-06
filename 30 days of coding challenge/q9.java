
import java.util.*;
public class q9 {

	static ArrayList<Integer> ob=new ArrayList<Integer>();
	static void multiply(int x)
	{
	 int c = 0; 
	 for (int i = 0 ; i < ob.size();  i++)
	 {
	     int r = c + ob.get(i) * x;

	     ob.set(i,r % 10);
	     c = r / 10;
	 }
	 while (c != 0)
	 {
	     ob.add(c % 10);
	     c /= 10;
	 }
	}
	static int SumOfDigits(int n)
	{
	 ob.add(1);
	
	 for (int i=1; i<=n; i++)
	     multiply(i);

	 int sum = 0;

	 for (int i = 0 ; i < ob.size() ; i++)
	     sum += ob.get(i);
	 return sum;
	}
	public static void main(String[] args)
	{
	 
	 System.out.println(SumOfDigits(100));
	}
}