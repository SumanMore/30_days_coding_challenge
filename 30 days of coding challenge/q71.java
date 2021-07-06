public class q71
{
    public static void main(String[] srgs)
    {
        int n=7;
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
        {
            ar[i] = i + 1;
        }
     square(ar, n);
    }
 public static void square(int[] ar,int n)
    {
        for (int i = 0; i < n; i++)
        {
        for (int j = 0; j < n; j++)
        {
            System.out.print(ar[(j + i) % 7] + " ");
         }
            System.out.println();
        }}
    
}