
package javapractice;

public class ggggggg {
	public static void main(String[] args) {

		String s= "kiran is a girl";
		String [] str=s.split(" ");
		for(String word:str) {
			//String p=word.substring(0,2).toUpperCase();

			for(int i=word.length()-1;i>=0;i--) {
				if (i>0) 
					System.out.print(word.charAt(i));
				else
					System.out.print(word.charAt(i)+" ");
			}
		}
	}
}




