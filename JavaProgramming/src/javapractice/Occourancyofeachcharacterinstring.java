package javapractice;
import java.util.HashSet;

public class Occourancyofeachcharacterinstring {

	public static void main(String[] args) {
		String s="wwabccd";
		HashSet<Character> set= new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
		set.add(s.charAt(i));
		
		}
		
		for(Character ch:set) {
		int count=0;
		for(int i=0;i<s.length();i++) {
		if(ch==s.charAt(i)) {
			count++;
		}
		}
System.out.print(ch+""+count);
	}}
}


