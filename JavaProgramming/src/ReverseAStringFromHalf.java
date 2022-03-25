
public class ReverseAStringFromHalf {

	public static void main(String[] args) {

		String s="Rakes";
		for(int i=0;i<s.length()/2;i++) {
			System.out.print(s.charAt(i));
		}
		for(int i=s.length()-1;i>=s.length()/2;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
