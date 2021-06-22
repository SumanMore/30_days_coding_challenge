
public class q661
{
  public static void main(String args[])
  {
int ar[]=new int[15];
ar[0]=0;
ar[1]=0;
int j=1;
for(int i=2;i<15;i++)
{
  if(i%2==0)
  {
  ar[i]=7*j;
  }
  else{
  ar[i]=6*j;
  j++;
  }
}
System.out.println(ar[14]);
}}
    

