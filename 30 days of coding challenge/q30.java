
    

    import java.util.*;
    public class q30
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the total number of elements");
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            int j=0;
            System.out.println("enter " +n+ " elements");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                if(a[i]>=0)
                {
                   b[j]=a[i];
                   j++;
                }
            }
            for(int i=0;i<n;i++)
            {
                if(a[i]<0)
                {
                   b[j]=a[i];
                   j++;
                }
                
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(b[i]+" ");
            }
            sc.close();
            
        }
    
    }
