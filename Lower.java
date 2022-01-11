import java.lang.Character;
public class Lower 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char a = '@';
    if (Character.isLowerCase(a))
    {
    System.out.println(a+" is a lowercase letter.");
    }
    else if (Character.isUpperCase(a))
    {
    System.out.println(a+ "is an uppercase letter.");
    }
    else if (Character.isDigit(a))
    {
    System.out.println(a+"is not a latter.");
    }
    else
    {
    System.out.println(a+"is a special Character.");
    }
	}
}
    
	


