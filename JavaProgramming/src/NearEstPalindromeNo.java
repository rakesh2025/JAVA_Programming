
public class NearEstPalindromeNo {

	public static void main(String[] args) {
		int prev=prevPalindromeNo(122);
		int next=NextPalindromeNo(122);
		if((122-prev)>(next-122)){
			System.out.println(next);
		}
			else {
				System.out.println(prev);	
		}
		
	}
public static int prevPalindromeNo(int n) {
	int temp=n;
while(true) {
	
int n1=temp;

int sum=0;

while(n1>0) {
	int rem=n1%10;
	sum=(sum*10)+rem;
	n1=n1/10;
}if(sum==temp) {
	//System.out.println("previus palindrome no is"+ temp);
	break;
}else
	temp--;

}
return temp;
}

public static int NextPalindromeNo(int n) {
	int temp=n;
	while(true) {
		
	int n1=temp;

	int sum=0;

	while(n1>0) {
		int rem=n1%10;
		sum=(sum*10)+rem;
		n1=n1/10;
	}if(sum==temp) {
		//System.out.println("previus palindrome no is"+ temp);
		break;
	}else
		temp++;

	}
	return temp;

}
}


