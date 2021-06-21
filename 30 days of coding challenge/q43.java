import java.util.*;
public class q43 {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int dec=sc.nextInt();
        String binary = Integer.toBinaryString(dec);
        System.out.println(binary);
        String octal = Integer.toOctalString(dec);
        System.out.println(octal);
        String hexadecimal = Integer.toHexString(dec);
        System.out.println(hexadecimal );


    }
    
}
/*
import java.util.*;
class Main {
  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int decimal=sc.nextInt();

base(decimal,2);
base(decimal,8);
base(decimal,16);
  }
  public static void base(int num, int n)
  {
  int r;
    String s=""; 
 int ar[]=new int[n];
 if(n<=8){
    for(int i=0;i<n;i++)
    {
      ar[i]=i;
    }
 
    while(num>0)
    {
       r=num%n; 
       s=ar[r]+s; 
       num=num/n;
    }
    System.out.println(s);
  }
  else if(n==16)
  {
    int r1;  
     String s1="";   
     char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    while(num>0)  
     {  
       r1=num%16;   
       s1=ch[r1]+s1;   
       num=num/16;  
     }  
     System.out.println(s1);

  }
  }
}

*/