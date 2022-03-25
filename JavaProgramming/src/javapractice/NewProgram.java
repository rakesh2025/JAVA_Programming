package javapractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class NewProgram {

	public static void main(String[] args) {
	String s="12312345456";
	int sum=0;
	HashSet<Character> set= new HashSet<Character>();
	for(int i=0;i<s.length();i++) {
		set.add(s.charAt(i));
	}
	for(Character ch:set) {
		int n=ch-48;
		sum=sum+n;
		
	}
	System.out.println(sum);	
	}
	

	}


