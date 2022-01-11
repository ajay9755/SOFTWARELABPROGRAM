import java.util.Scanner;
public class HEXADECIMAL {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter hexadecimal number to get its binary equivalent");
		String a=Sc.nextLine();
		int b=Integer.parseInt (a,16);
		String c=Integer.toBinaryString(b);
		System.out.println("Binary Equivalent of given hexadecimal number is"+c);
	}

	}


