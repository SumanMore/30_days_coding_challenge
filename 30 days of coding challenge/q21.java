public class q21{
    public static void main(String args[])
    {
        q21 ob = new q21();
        ob.solveNQ();
    }
    final int N = 4;
    void display(int ar[][])
    {
        for (int i = 0; i < N; i++)
         {
            for (int j = 0; j < N; j++)
                System.out.print(" " + ar[i][j]
                                 + " ");
            System.out.println();
        }
    }
  boolean isSafe(int ar[][], int r, int c)
    {
        int i, j;
        for (i = 0; i < c; i++)
            if (ar[r][i] == 1)
                return false;
  
        for (i = r, j = c; i >= 0 && j >= 0; i--, j--)
            if (ar[i][j] == 1)
                return false;
        
        for (i = r, j = c; j >= 0 && i < N; i++, j--)
            if (ar[i][j] == 1)
                return false;
  
        return true;
    }
  
   
    boolean calculate(int ar[][], int c)
    {
        if (c >= N)
            return true;
        for (int i = 0; i < N; i++) 
        {
        if (isSafe(ar, i, c))
           {
            ar[i][c] = 1;
            if (calculate(ar, c + 1) == true)
                    return true;
            ar[i][c] = 0;
            }
        }
        return false;
    }
    boolean solveNQ()
    {
        int ar[][] = { { 0, 0, 0, 0 },{ 0, 0, 0, 0 },{ 0, 0, 0, 0 },{ 0, 0, 0, 0 } };
      if (calculate(ar, 0) == false) {
            System.out.print("invalid");
            return false;
        }
  
        display(ar);
        return true;
    }
    
}