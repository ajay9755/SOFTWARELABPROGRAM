import java.util.Scanner;
public class BINARY_TO_DECIMAL {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter binary number to get its decimal equivalent");
		String a = s.nextLine();
		int b= Integer.parseInt(a,2);
		System.out.println("binary equivalent of given decimal number is "+b);

	}

}

