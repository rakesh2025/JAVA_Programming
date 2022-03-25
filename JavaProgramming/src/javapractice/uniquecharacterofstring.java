package javapractice;
import java.util.LinkedHashSet;

public class uniquecharacterofstring { 

	public static void main(String[] args) {
		String s="AUSTERLIAGOODMORNING";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++){
		set.add(s.charAt(i));
		}
		for(Character c:set) {
			System.out.print(c+" ");	
		}

	}

}
