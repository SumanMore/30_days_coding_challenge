public class q55{
   
    double real, imaginary;
     
    q55(double r, double i)
    {
     this.real = r;
     this.imaginary = i;
    }
     
    public static q55  add(q55 c1, q55 c2)
    {
         q55 c3 = new q55(0, 0);
 
         c3.real = c1.real + c2.real;
         c3.imaginary = c1.imaginary + c2.imaginary;
         
         return c3;
     }
     public static void main(String args[]) 
     {
    q55 c1 = new q55(1,2);
     q55 c2 = new q55(3.5, 7.5);
         q55 c3 = add(c1, c2);
         System.out.printf("Sum "+ c3.real+" + "+ c3.imaginary +"i");
     }
 }