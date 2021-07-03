import java.util.*;
public class q82
{
    public static void main (String[] args)
{
    int ar[] = {0,0,0,0, 1};
    int res = Transition (ar);
    System.out.print(res);
}
 public static int Transition(int ar[])
{
   
    for(int i = 0; i < ar.length ; i++)
       if(ar[i] == 1)
         return i;
    return -1;
}
 }
 