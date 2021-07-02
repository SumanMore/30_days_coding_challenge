import java.util.*;
public class q12
{
    public static void main(String[] args)
    {
        String str="10001100";
        complement(str);
    }
   
    public static void complement(String s)
    {
        StringBuffer ob=new StringBuffer(s); 
        int i;
        for (i = ob.length()-1 ; i >= 0 ; i--){
            if (ob.charAt(i) == '1')
                break;}
       if (i == -1)
            System.out.println( "1" + s);
      for (int j = i-1 ; j >= 0; j--)
        {
            if (ob.charAt(j) == '1')
                ob.replace(j,j+1, "0");
            else
                ob.replace(j,j+1, "1");
        }
      
        System.out.println(ob.toString());
    }
     
 
  
}
