package week2.day1;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String name="madam";
		String rev = "";
		int length=name.length();
		System.out.println(length);
		
		for(int i=(length-1);i>=0;i--)
		{
			char charAt = name.charAt(i);
			rev = rev+ name.charAt(i);
			System.out.println(charAt);
	    }
		
	    System.out.println(rev);
		if(name.equals(rev))
		{
			
		System.out.println("madam is a Palindrome string");	
		}
		else
		{
			System.out.println("madam is not a Palindrome string");		
		}
		
		}
}
