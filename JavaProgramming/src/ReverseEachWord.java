
public class ReverseEachWord {

	public static void main(String[] args) {
		String s="My Name Is Rakesh Pradhan";
		String []ar=s.split(" ");
		for(int i=0;i<ar.length;i++) {
			int len=ar[i].length();
			for(int j=ar[i].length()-1;j>=0;j--) {
				System.out.print(ar[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
