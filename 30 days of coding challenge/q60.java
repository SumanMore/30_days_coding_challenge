
public class q60
{
public static void main(String[] args) {  
        int r1,  r2,c1,c2;  
int a[][] = {  { 1, 2, 3},  {4, 5, 6}, {7, 8, 9} };   
                         
int b[][] = { {0, 1, 2},  {6, 7, 8},  {2, 3, 5}  };  
 r1 = a.length;  
 r2 = b.length; 
c1 = a[0].length;  
  c2= b[0].length;  
if(c1 != r2)
{  
System.out.println("Matrice multiplication not possible");  
}  
else if(c1==r2)
{  
 int c[][] = new int[r1][c2];  
for(int i = 0; i < r1; i++)
{  
for(int j = 0; j < c2; j++)
{  
for(int k = 0; k < r2; k++)
{  
c[i][j] = c[i][j] + a[i][k] * b[k][j];   
}  
}  
}  
 System.out.println("Result");  
 for(int i = 0; i < r1; i++)
 {  
for(int j = 0; j < c2; j++)
{  
System.out.print(c[i][j] + " ");  
}  
System.out.println();  
}  
}  
}  
}  