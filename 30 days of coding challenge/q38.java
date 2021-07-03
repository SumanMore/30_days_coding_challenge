import java.io.*;
import java.util.*;
import java.lang.*;
 public class q38
{
    public static void main(String[] args)
{
    int ar[] = {4,6,10};
    NonEmptySubset(ar,ar.length);
}
public static void NonEmptySubset(int arr[],int size)
{
 HashMap<Integer, Integer> ob =new HashMap<Integer, Integer>();
 int sum = 0;
    for (int i = 0; i < size; i++)
    { 
    sum = (sum + arr[i]) % size;
     if (sum == 0)
        {
           System.out.print(i + 1 + "\n");
           for (int j = 0; j <= i; j++)
                System.out.print(j + 1 + " ");
            return;
        }
        if (ob.containsKey(sum) == true)
        {
          System.out.println((i - ob.get(sum)));
            for (int j = ob.get(sum) + 1; j <= i; j++)
                System.out.print(j + 1 + " ");
 
            return;
        }
        else
            ob.put(sum,i);
    }
}
 


}