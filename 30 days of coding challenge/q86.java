public class q86
 {
public static void main (String[] args)
{
    for (int i=1; i<1000; i++)
            if (kaprekar(i))
                 System.out.print(i + " ");
    }
       
       public  static boolean kaprekar(int n)
        {
      if (n == 1)
         return true;
    int sq = n * n,c=0;
    while (sq != 0)
    {
    c++;
    sq /= 10;
    }
          
    sq = n*n; 
for (int i=1; i<c; i++)
 {
int b = (int) Math.pow(10, i);
if (b== n)
        continue;
int sum = sq/b + sq % b;
 if (sum == n)
    return true;
}
return false;
        }}
