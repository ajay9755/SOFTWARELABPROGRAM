import java.util.Scanner;
public class TABLE {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter any number to get its table");
		int n=S.nextInt();
		int i;
		System.out.println("Table of "+n+" is :-\n");
		for(i=1;i<=10;i++)
		{
			int p=n*i;
			System.out.println(n+"x"+i+"="+p);
		}

	}

}
