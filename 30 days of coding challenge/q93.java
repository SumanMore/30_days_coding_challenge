import java.math.BigInteger;

public class q93 
{
    public static void main(String args[])
    {
        String s = BigInteger.ONE.shiftLeft(1000).toString();
		int sum = 0;
		for (int i = 0; i < s.length(); i++)
			sum += s.charAt(i) - '0';
		System.out.println( Integer.toString(sum));
    }
}
