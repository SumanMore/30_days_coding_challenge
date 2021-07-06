public class q97
{
    public static void main(String args[])
    {
int n = 200;
int[] p = { 1, 2, 5, 10, 20, 50, 100, 200 };
int[] ar = new int[n+1];
ar[0] = 1;
 
for (int i = 0; i <p.length; i++)
 {
    for (int j = p[i]; j <= n; j++) 
    {
        ar[j] += ar[j - p[i]];
    }
}
System.out.println(ar[ar.length-1]);
    }
}