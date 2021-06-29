import java.util.*;

class q51{

    public static int nextPalindrome(int n)
    {
        int res=1, digit, rev=0, number;
       
        if(n<10)
        {
            res=0;
            return n+1;
        }

        number=n;
        while(res!=0)
        {   rev=0;digit=0;
            n=++number;

            while(n>0) 
            {
                digit=n%10;
                rev=rev*10+digit;
                n=n/10;
            }

            if(rev==number)
            {
                res=0;
                return number;
            }

            else res=1;
        }
        return number;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        if (n>0)
        {
            System.out.println(nextPalindrome(n));
        }
    }
}