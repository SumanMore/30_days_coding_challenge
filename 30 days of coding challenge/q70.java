import java.util.*;
public class q70 
{
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
           int n = sc.nextInt();;
            System.out.println("the minimum sum is :"+min_sum_fact(n));
        }
    
         public static int min_sum_fact(int n)
        {
            int s = 0;
         for (int i = 2; i * i <= n; i++) 
         {
                while (n% i == 0)
                 {
                    s += i;
                    n /= i;
                }
        }
        s += n;
        return s;
        }
     
     
        
    }
