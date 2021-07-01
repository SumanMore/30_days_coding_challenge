import java.util.*;
class q61
{
    public static void main (String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of num");
        double num = sc.nextDouble();
        double l = 0.00001;
     
        System.out.println(squareroot(num, l));
    }
    public static double squareroot(double num, double l)
    {
        double val = num,root;
        int c = 0;
     
        while (true)
        {
            c++;
   
            root = 0.5 * (val + (num / val));
     
            if (Math.abs(root - val) < l)
                break;
    
            val = root;
        }
     
        return root;
    }
  
    
}