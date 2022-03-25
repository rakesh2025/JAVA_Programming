package javapractice;

public class PalindromeString {

	public static void main(String[] args) {
		String s="RakeshsekaR";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
if(rev.equals(s)) {
	System.out.println("palindrome string");
}else
	System.out.println("not a palindrome string");
	}

}
