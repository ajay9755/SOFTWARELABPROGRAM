import java.util.Scanner;
public class BINARY_TO_HEXA {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a binary number to get its hexadecimal equivalent");
		String a= s.nextLine();
		int b= Integer.parseInt(a,2);
		String c= Integer.toHexString(b);
		System.out.println("Hexadecimal equivalent of given Binary number is "+c);
		

	}

}
