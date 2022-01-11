import java.util.Scanner;
public class OCTAL {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the octal number to get its binary equivalent");
		String a=S.nextLine();
		int b= Integer.parseInt(a,8);
		String c=Integer.toBinaryString(b);
		System.out.println("Binary equivalent of given octal number is" +c);
	   

	}

}
