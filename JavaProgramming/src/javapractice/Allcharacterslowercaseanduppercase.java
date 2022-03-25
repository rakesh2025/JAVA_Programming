package javapractice;

public class Allcharacterslowercaseanduppercase {

	public static void main(String[] args) {
		String s="Hello I Am Dipti";
		
		
		char ch;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.print(Character.toLowerCase(ch));
				
				}
				
				
			else {
				System.out.print(Character.toUpperCase(ch));
			}
		
		}
	}
}
		
	

	


