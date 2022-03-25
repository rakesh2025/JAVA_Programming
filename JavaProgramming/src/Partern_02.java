
public class Partern_02 {

	public static void main(String[] args) {
int count=1;
int n=3;
for(int row=1;row<=n;row++) {
	for(int col=1;col<=n;col++) {
		if(row==col||row+col==n+1) {
			System.out.print(count++);
		}
		else
			System.out.print(" ");
		
	}
	System.out.println();
}
	}

}
