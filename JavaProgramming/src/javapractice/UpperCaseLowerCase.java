package javapractice;

public class UpperCaseLowerCase {

	public static void main(String[] args) {
		String s="mY nAME iS rAkESH";
		
		char []a=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			char temp=a[i];
			if(Character.isUpperCase(temp)) {
				temp=Character.toLowerCase(temp);
			}
			else {
					temp=Character.toUpperCase(temp);
			}
			a[i]=temp;
			
			}
		
				System.out.println(a);
		}

	

}
