
public class reversestringusingthirdvariable {

	public static void main(String[] args) {
		String s="Java";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
			
		}
		System.out.print(rev);
	}

}
