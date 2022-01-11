import java.util.Scanner;
public class BINARY_TO_OCTAL {

	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a binary number to get its octal equivalent");
		String a= s.nextLine();
		int b= Integer.parseInt(a,2);
		String c = Integer .toOctalString(b);
		System.out.println("Octal equivalent of given binary number is "+c);
		

	}

}

