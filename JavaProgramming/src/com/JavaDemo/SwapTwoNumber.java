package com.JavaDemo;

import java.util.LinkedHashSet;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int []a= {12,34,12,26,45};
		LinkedHashSet<Integer> st=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			st.add(a[i]);
		}
		for(int b:st) {
		System.out.print(b+ " ");
		}
	}

}
