public class q4
{ public static void main(String args[])
{
    System.out.println(checkRectangle(1.0,1.0,1.0,3.0,4.0,1.0,4.0,3.0));
}

public static boolean checkRectangle( double x1, double y1, double x2, double y2,double x3, double y3, double x4, double y4)
{
  double c_x=(x1+x2+x3+x4)/4;
  double c_y=(y1+y2+y3+y4)/4;
  double d1=Math.pow(c_x-x1,2)+Math.pow(c_y-y1,2);
  double  d2=Math.pow(c_x-x2,2)+Math.pow(c_y-y2,2);
  double d3=Math.pow(c_x-x3,2)+Math.pow(c_y-y3,2);
  double d4=Math.pow(c_x-x4,2)+Math.pow(c_y-y4,2);
  return d1==d2 && d1==d3 && d1==d4;
}
}
