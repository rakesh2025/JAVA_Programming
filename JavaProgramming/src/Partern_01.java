
public class Partern_01 {
	
public static void main(String[] args) {
	int temp=2;
	int n=4;
	int count=1;
	for(int i=0;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(count--);
			
			
		}
		System.out.println();
		count=count+temp+i;
		
	}
}
	
}