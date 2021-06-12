



    
  import java.util.*;

  public class q62 {
      Scanner sc = new Scanner(System.in);
  
      public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
  
          int N = sc.nextInt();
          int ar[] = new int[N];
          int r, r1 = 0;
          for (int i = 0; i < N; i++) {
              ar[i] = sc.nextInt();
          }
          for (int i = 0; i < N; i++) {
              r = check_prime(ar[i]);
              r1 = check_pallindrome(ar[i]);
  
              
              if (r1 == 1 && r==1) {
                  System.out.println(ar[i]);
              }
  
          }
      }
  
  
      public static int check_prime(int n) {
  
          for (int i = 2; i <= Math.sqrt(n); i++) {
              if (n % i == 0)
                  return 0;
          }
          return 1;
  
  
      }
  
      public static int check_pallindrome(int N1) {
          int r, rev = 0, d = N1;
          while (d > 0) {
              r = d % 10;
              rev = rev * 10 + r;
              d /= 10;
          }
          if (N1 == rev)
              return 1;
          else
              return 0;
  
      }
  
  
  }

