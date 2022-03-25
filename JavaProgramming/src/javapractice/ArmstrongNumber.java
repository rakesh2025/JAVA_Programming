package javapractice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no");
		int number=sc.nextInt();
		
	int tempno=number;
	int sum=0;
while(number>0) {
		int rem=number%10;
		sum=sum+(rem*rem*rem);
		number=number/10;
	}
if(sum==tempno) {
	System.out.println(sum);
	System.out.println("this is armstrong no");
}else
	System.out.println("Not a armstrong no");
	}

}
