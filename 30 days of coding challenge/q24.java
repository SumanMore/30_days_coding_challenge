import java.util.*;
public class q24 {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   int ob[]=new int[n];
    for(int i=0;i<n;i++)
    {
        ob[i]=sc.nextInt();
    }
    int even=0,odd=n-1;
    
while (even < odd)
 { 
if (ob[even] % 2 == 0)
{ 
even++; 
} 
else { 
int temp = ob[even]; 
ob[even] = ob[odd]; 
ob[odd--] = temp; 

}
    
}
for(int i=0;i<n;i++)
{
    System.out.print(ob[i]+" ");
}
}}