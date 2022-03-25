package javapractice;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Aiphabetical {

	public static void main(String[] args) {
		
		String s="dipti";
		
		 TreeSet<Character> set = new TreeSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		for (Character character : set) {
			System.out.print(character);
			
		}

	}

}
