public class q92 {
    public static void main(String args[])
    {
        int sum=0,sum1=0;
        for(int i=1;i<=100;i++)
        {
            sum=sum+(i*i);
            sum1=sum1+i;

        }
        System.out.println(Math.abs(sum-(sum1*sum1)));

    }
    
}
