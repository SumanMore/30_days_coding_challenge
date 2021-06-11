import java.util.*;
public class q56 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=num,r;
        
        while(sum>9)
        {
            num=sum;
        sum=0;
        while(num>0)
        { 
             r=num%10;
            sum=sum+r;
            num/=10;
        }
        
    }
    if(sum==1)
    {
        System.out.println("it is a magic number");

    }
    else{
        System.out.println("it is  not a magic number");
    }
    sc.close();
    
}}
