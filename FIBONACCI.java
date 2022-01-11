import java.util.Scanner;
public class FIBONACCI {

	public static void main(String[] args) {
		int n,i,t1=0,t2=1,next= t1+t2;
		
		Scanner S=new Scanner(System.in);
		System.out.println("For how many terms do you want to display the Fibonacci series");
		n=S.nextInt();
		System.out.println("Fibonacci series with "+n+" terms :-");
		System.out.println(t1+"\n"+ t2);
		for (i=1;i<=n-2;i++)
		{
			System.out.println(next);
			t1=t2;
			t2=next;
			next=t1+t2;
			
			
		}
 
	}

}
