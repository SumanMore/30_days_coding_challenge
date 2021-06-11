import java.util.Scanner;
public class q64
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
        if(n<1000 || n>9999)
        {
            System.out.println(n+"not valid number");
        }
        else
        {
            int s=0;
            while(n>0)
            {
                int r=n%10;
                s+=r;
                n/=10;
            }
            if(s%3==0 || s%5==0 || s%7==0)
            {
                System.out.println("Lucky Number");
            }
            else
            {
                System.out.println("Not lucky number");
            }
        }
    }
}