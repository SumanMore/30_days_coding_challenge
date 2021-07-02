import java.math.BigInteger;
public class q96
 { public static void main(String[] args) {
    BigInteger modulo = BigInteger.TEN.pow(10);
    BigInteger s = BigInteger.ZERO;
    for (int i = 1; i <= 1000; i++)
    {
    s = s.add(BigInteger.valueOf(i).modPow(BigInteger.valueOf(i), modulo));
    } 
    System.out.println( s.mod(modulo).toString());
    
}}
