import java.util.*;
public class q63{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the total distance");
     int td = sc.nextInt();
     double cost;

		if (td== 0) 
        {
            cost=0.00;
            System.out.println("Cost= P"+ cost);
        }
        else if(td<=250)
        {
            cost=40.00;
            System.out.println("Cost= P"+ cost);
        }
        else
        {
            cost=(Math.ceil((td-250.0)/200)*2.5)+40.00;
            System.out.println("Cost= P"+ cost);
        }

    }}
        
		

