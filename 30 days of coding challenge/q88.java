import java.util.Scanner;
public class q88 {

      public static void main( String args[] ){ 
	    Scanner sc = new Scanner( System.in ); 
        System.out.println("Enter lower range"); 
        int a = sc.nextInt(); 
        System.out.println("enter ending range"); 
        int b = sc.nextInt(); 
	    int res = a + (int)(Math.random() * ((b - a) + 1));
	    System.out.println(res);
     }  
}