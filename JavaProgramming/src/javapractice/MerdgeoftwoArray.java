package javapractice;

public class MerdgeoftwoArray {

	public static void main(String[] args) {
		int a[]= {1,6,3,2,0};
		int b[]= {2,3,4,5};
		int c[]=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
			
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length+i]=b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}

	}

}
