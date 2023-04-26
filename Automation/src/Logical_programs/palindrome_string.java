package Logical_programs;

public class palindrome_string {
	public static void main(String[] args) {
		String str = "nayan";//madam, radar are palindrome string
		String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("original string is" + str);
		System.out.println("Reverse string is " + rev);
		if(str.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
	}

}
