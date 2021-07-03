import java.util.*;
public class q721 {
    public static void main(String args[])
    {

        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>(n);
        ArrayList<Integer> index =new ArrayList<Integer>(n);
        ArrayList<Integer> arr1=new ArrayList<Integer>(Collections.nCopies(n,0));
        ArrayList<Integer> index1 =new ArrayList<Integer>();

        for(int i=0;i<n;i++)
        {
        arr.add(sc.nextInt());
        }
        for(int i=0;i<n;i++)
        {
        index.add(sc.nextInt());
        }
        for(int i=0;i<n;i++)
        {
            arr1.set(index.get(i),arr.get(i));
            index1.add(i);

        }
        System.out.print(arr1);
        System.out.print(index1);

        sc.close();
        

    }
    
}
