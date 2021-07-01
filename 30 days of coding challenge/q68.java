import java.util.*; 

class q68 { 

    public static void main(String[] args) 
    { 
        int ar[] = { 12, 10, 5, 6, 52, 36 }; 
        int pos=2; 
  
        split(ar, ar.length, pos); 
  
        
    } 
    public static void split(int ar[], int l, int pos) 
    { 

        for (int i = 0; i < pos; i++)
         { 
  
            int x = ar[0]; 
            for (int j = 0; j < l - 1; ++j) 
                ar[j] = ar[j + 1]; 
            ar[l- 1] = x; 
        } 
        for (int i = 0; i < ar.length; ++i) 
            System.out.print(ar[i] + " "); 
        
    } 
  
    
} 
