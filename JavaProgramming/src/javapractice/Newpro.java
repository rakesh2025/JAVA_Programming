package javapractice;

import java.util.LinkedHashSet;

public class Newpro {

	public static void main(String[] args) {
	int space=3;
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
			space--;
		}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
		
		System.out.println();
		
	}
}
}