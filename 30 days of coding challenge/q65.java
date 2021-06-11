import java.util.*;
public class q65 {
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
String s=Integer.toString(N);
char ch []=s.toCharArray();
int f=0;
for(int i=0;i<ch.length-1;i++)
{
    for(int j=i+1;j<ch.length;j++)
    {
        if(ch[i]==ch[j])
        {
            f=1;
            break;
        }
    }
}
if(f==1)
   System.out.println("no is not unique");
else
   System.out.println("no is unique");   




    }
}
