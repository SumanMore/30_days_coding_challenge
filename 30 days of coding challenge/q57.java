/*public  static int Approach_1(int a)
  {
    int c=0;
     while(a!=0)
     {
    c+=(a&1);
    a=a>>1;
     }
     return c;
  }*/
//full code

class q57 {
    public static void main(String[] args) {
    int x=0b1111111111111111111111000000111;
    int res=Approach_1(x);
    System.out.println("using first approach : "+res);
    int res1=Approach_2(x);
    System.out.println("using second approach : "+res1);
    }
  
  public  static int Approach_1(int a)
  {
    int c=0;
     while(a!=0)
     {
    c+=(a&1);
    a=a>>1;
     }
     return c;
  }
  public static int Approach_2(int  b){
  int y,c1=0;
     while(b!=0)
     {
       y=b & ~(b-1);
       b=b^y;
       ++c1;
     }
     return c1;
    }}
