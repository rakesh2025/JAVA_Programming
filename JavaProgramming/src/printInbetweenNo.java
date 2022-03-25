import java.util.LinkedList;

public class printInbetweenNo {

	public static void main(String[] args) {
int a[]= {1,2,7};


for(int i=0;i<a.length-1;i++) {
	for(int j=a[i];j<a[i+1]-1;j++) {
		System.out.println(j+1);
	}
}
	}

}
