import java.util.*;
import java.lang.Math;
public class QUADRATIC {

	public static void main(String[] args)
	{
	 Scanner s = new Scanner(System.in);	
	 System.out.println("Enter the value of coefficient of x square ");
	 int a=s.nextInt();
	 System.out.println("Enter the value of coefficient of x");
	 int b=s.nextInt();
	 System.out.println("Enter the value of constant term ");
	 int c=s.nextInt();
	 
	 double d= Math.pow(b, 2)-4*a*c;
	 
	 double e= Math.sqrt(d);
	 if (d<0)
	 {
		 System.out.println("The equation has no real  solution.");
	 }
	 else if (d==0)
	 {
	 double root=(-b-e)/2*a;
	 System.out.println("The equation has two equal roots whose value is "+root);
	 }
	 else
	 {
	 double root1 = (-b-e)/2*a;
	 double root2 = (-b+e)/2*a;
	 System.out.println("The roots of the equation are "+root1+" and "+root2);
	 }
	 
	}
	 }


