import java.util.*;

public class q59 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of elements");
    int N = sc.nextInt();
    System.out.println("enter the rotation count ");
    int p= sc.nextInt();
    System.out.println("enter the number of queries");
    int q = sc.nextInt();
    int[] ar = new int[N];
    int[] q1 = new int[q];
   System.out.println("enter the elements:");
    for (int i = 0; i < N; i++) 
      ar[i] = sc.nextInt();
System.out.println("enter the queries:") ; 
    for (int i = 0; i < q; i++)
       q1[i] = sc.nextInt();
     int[] rotation = circulararray(ar, p, q1);
     System.out.println("output: ");
    for (int i : q1) 
    {
      System.out.println(rotation[i]);
    }
  }
 
 public static int[] circulararray(int[] a, int p, int[] q) 
 {
    int[] arr = new int[a.length];

    for (int i = 0; i < a.length; i++) 
    {
      if (i + p > a.length - 1) 
      {
         arr[(i + p) % a.length] = a[i];
      } 
      else 
      {
        arr[i + p] = a[i];
      }
    }

    return arr;
  }
}