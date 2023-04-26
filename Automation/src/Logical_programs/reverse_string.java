package Logical_programs;

public class reverse_string {//VVIMP
	public static void main(String[] args) {
		String str = "pooja";
		String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("original string is" + str);
		System.out.println("Reverse string is " + rev);
	}

}
