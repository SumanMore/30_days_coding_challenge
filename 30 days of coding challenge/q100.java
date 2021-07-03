
public class q100{
public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i < 1000000; i++){
        if (PalindromeBinary(i) && PalindromeDecimal(i)){
            sum += i;
        }
    }
    System.out.println(sum);
}
public static boolean PalindromeBinary(int n){
    String s = Integer.toString(n,2);
 StringBuilder ob = new StringBuilder(s);
String s1=ob.toString(),s2=ob.reverse().toString();
 return s1.equals(s2);

}
public static boolean PalindromeDecimal(int n)
{
    String s = Integer.toString(n,10);
    StringBuilder ob = new StringBuilder(s);
    String s1=ob.toString(),s2=ob.reverse().toString();
   return s1.equals(s2);
}

}