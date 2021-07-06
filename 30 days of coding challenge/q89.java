import java.util.*;
public class q89 {

    public static void main(String[] args) 
    { 
	   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ar = new int[n][n];
        if ((n % 2 == 0) || (n <=0 ))
        {
            System.out.print("Input number must be odd and >0"); 			
			System.exit(0); 
		}
         int r= n-1;
        int c = n/2;
        ar[r][c] = 1;

        for (int i = 2; i <= n*n; i++) 
        {
            if (ar[(r + 1) % n][(c + 1) % n] == 0) 
            {
                r= (r + 1) % n;
                c = (c + 1) % n;
            }
            else 
            {
                r= (r - 1 + n) % n;                
            }
            ar[r][c] = i;
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (ar[i][j] < 10)  System.out.print(" ");   
                if (ar[i][j] < 100) System.out.print(" ");  
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }
}