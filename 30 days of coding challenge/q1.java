import java.util.*;
 
public class q1 
{
    public static void main (String[] args)
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n");
      int n=sc.nextInt();
       int c=count(n);
       System.out.println("required ans : "+c);
 
    }
    
    public static int count(int n)
    {
        
        if (n == 1) 
           return 0;
        if (n == 2) 
           return 1;
         
      return (n - 1) * (count(n - 1) +count(n - 2));
    }
     
   
   
}
