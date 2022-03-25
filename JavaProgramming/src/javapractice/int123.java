package javapractice;

public class int123 {

	public static void main(String[] args) {
		String s= "welcome to india";
		String [] str=s.split(" ");
		for(String word:str) {
			String p=word.substring(0,1).toUpperCase();
			System.out.print(p+word.substring(1)+" ");
		}

	}

}
