import java.util.Scanner;
import java.lang.Math;
public class Smallest5 
{

	public static void main(String[] args)
	{
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1");
    int a = sc.nextInt();
    System.out.println("Enter number 2");
    int b = sc.nextInt();
    System.out.println("Enter number 3");
    int c = sc.nextInt();
    int d = Math.min (a, b);
    int e = Math.min (c, d);
    if (a==b && a==c);
    {
    System.out.println("All three numbers are equal.");
    }
    else
    {
    System.out.println(e+ "is the smallest number.");
    }
 }
}
    
    
	


