import java.util.Scanner;
public class SQUARE_ROOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner S=new Scanner(System.in);
  System.out.println("Enter any number to get its square root");
  int n=S.nextInt();
  double sq=Square_root(n);
  System.out.println("Square root of "+n+" is "+sq);
	}
	public static double Square_root(int num)
	{
		double temp;
		double sqroot=num/2;
		do
		{
			temp=sqroot;
			sqroot=(temp+(num/temp))/2;
		}
		while((sqroot-temp)!=0);
		return sqroot;
		}
	}


