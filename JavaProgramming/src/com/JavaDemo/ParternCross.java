package com.JavaDemo;

public class ParternCross {

	public static void main(String[] args) {
		int row=5;
		for(int i=0;i<=row;i++) {
			for(int j=1;j<=row;j++)
				if(i==j || i+j==row+1) {
					System.out.print("X");
				}else {
						System.out.print(" ");
				}
			
			System.out.println();
	
		}
		
	}

}

