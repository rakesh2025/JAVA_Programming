package com.JavaDemo;

public class Demo2 {

	public static void main(String[] args) {
String s="Hello [@123] java";
String[] s1 = s.split(" ");


/*
 * String p=""; for(int i=0;i<s.length();i++) { if(s.charAt(i)>='a' &&
 * s.charAt(i)<='z' ||s.charAt(i)>='A' && s.charAt(i)<='Z'|| s.charAt(i)==' ') {
 * p=p+s.charAt(i); } } System.out.println(p);
 */

System.out.println(s1[0]+ " "+ s1[2]);
	}
	
	

}
