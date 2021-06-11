

public class q85 {
    public static void main(String args[])
    {
        String s=" ";
        int t=1;
   for(int i=4;i>=1;i--)
   {
       for(int j=1;j<=t;j++)
       {
           System.out.print(" ");
       }
       for(int z=1;z<=i;z++ )
       {
           System.out.print(z+s);
       }
       System.out.println();
       t+=2;
   }
    }
    
}
