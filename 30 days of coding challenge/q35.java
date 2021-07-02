import java.util.*;
public class q35 {	 
    public static int fibonacci(int n)
    {
       if (n ==0) 
        { 
            return n;
        } 
       else  if (n ==1) 
        { 
            return n;
        } 
        else
        {
        return fibonacci(n - 1) + fibonacci(n - 2);}
    } 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        if(n<0)
          System.out.println("invalid");
        else
        {
            int res=fibonacci(n);
            System.out.println("output : "+res);

        }		
           
        }
    }
