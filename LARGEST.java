import java.util.*;
import java.lang.Math;
public class largestofthreenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input=new Scanner(System.in);
    System.out.println("Enter Number 1");
    int a=input.nextInt();
    System.out.println("Enter Number 2");
    int b=input.nextInt();
    System.out.println("Enter Number 3");
    int c=input.nextInt();
    int d=Math.max(a, b);
    int e=Math.max(d, c);
    if (a==b && a==c)
    {
    	System.out.println("All the three numbers are equal");
    }
    else
    {
    System.out.println(e+" is the largest number");
    }
	}
}
    