

public class SumDividedBy3and7 {
	public static void main(String[] args) {
		int no,sum = 0;
	
	for(int i=500;i<1000;i++) {
		sum=0;
		no=i;
		while(i>1) {
		int rem=i%10;
		sum=sum*10+i;
		no=no/10;
		}
	}
	if(sum%3==0 && sum%7==0) {
		System.out.println(sum);
	}

}
}
