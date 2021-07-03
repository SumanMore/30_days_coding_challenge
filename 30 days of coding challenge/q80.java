import java.io.*;
import java.util.*;
 public class q80
{
public static int SIZE = 8;
public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of m and n");
        long m=sc.nextInt();
        long n=sc.nextInt();
        boolean res= anagram(m, n)?true:false;
        System.out.println(res);
    }
 public static boolean anagram(long m, long n)
    {
      int i = 0;
        long[] a = new long[SIZE];
        Arrays.fill(a, 0);
        while (m > 0)
        {
            a[i]= m % 2;
            m /= 2;
            i++;
        }
  
    
        int j = 0;
        long[] b= new long[SIZE];
        Arrays.fill(b, 0);
        while (n > 0)
        {
           b[j] = n%2;
            n/= 2;
            j++;
        }
       Arrays.sort(a);
        Arrays.sort(b);
 
        for (i = 0; i < SIZE; i++)
            if (a[i] !=b[i])
                return false;
  
        return true;
    }}