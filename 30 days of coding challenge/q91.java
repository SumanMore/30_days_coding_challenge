public class q91
{
 public static void main(String args[])
{long num=600851475143l,max;

for(long i=3;i<num;i=i+2)
{
while(num%i==0 && i<num)
   num=num/i;
 
} max=num;

 System.out.println("largest prime factor="+max);
 }
}
