public class q67 {
    public static void main(String args[])
    {
        int ar1[]={1,5,10,20,40,80};
        int ar2[]={6,7,20,80,100};
        int ar3[]={3, 4, 15, 21, 30, 70, 80, 120} ;
        int c=0,c1=0;
        for(int i=0;i<ar1.length;i++)
        { c=0;c1=0;
            for(int j=0;j<ar2.length;j++)
            {
                if(ar2[j]==ar1[i])
                  c++;

            }
            for(int k=0;k<ar3.length;k++)
            {
                if(ar3[k]==ar1[i])
                  c1++;

            }
            if(c>=1&&c1>=1)
            {
                System.out.println(ar1[i]+" ");
            }
        }

    }
    
}
