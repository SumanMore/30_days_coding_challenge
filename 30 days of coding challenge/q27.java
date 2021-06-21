import java.util.*;
 class Main {
 
    
     public static int num (int ar[], int n)
    {
        int i = 0,temp;;
        for (int j = 0; j < n; j++) {
            if (ar[j] <= 0) 
            {
                temp = ar[j];
                ar[j] = ar[i];
                ar[i] = temp;
                
                i++;
            }
        }
 
        return i;
    }
 
    
    static int missing(int ar[], int n)
    {
        int i,x;
      for (i = 0; i < n; i++) 
      {
            x = Math.abs(ar[i]);
            if (x - 1 < n && ar[x - 1] > 0)
                ar[x - 1] = -ar[x - 1];
    }
 
        
        for (i = 0; i < n; i++)
            if (ar[i] > 0)
                return i + 1; 
       
 
        return n + 1;
    }
 
    
    static int findMissing(int ar[], int n)
    {
         int shift = num(ar, n);
        int ar2[] = new int[n - shift];
        int j = 0;
        for (int i = shift; i < n; i++) 
        {
            ar2[j] = ar[i];
            j++;
        }
        
        return missing(ar2, j);
    }
     
    
    public static void main(String[] args)
    {
        int arr[] = {  2, 3, -7, 6, 8, 1, -10, 15 };
        int l = arr.length;
        int n = findMissing(arr, l);
        System.out.println(n);
    }
}