import java.util.LinkedHashSet;

public class OneMAXandOneMinfromArray {

	public static void main(String[] args) {
int []a= {1,3,5,4,2,9,7,8,6};
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
/*
 * for(int i=0;i<a.length;i=i+2) { int temp=a[i]; a[i]=a[a.length-1];
 * a[a.length-1]=temp; }
 */
int count=a.length-1;
LinkedHashSet<Integer> set=new LinkedHashSet<>();
for(int i=0;i<=a.length/2;i++) {
	set.add(a[i]);
	set.add(a[a.length-(1+i)]);
	//System.out.print(a[i]+" ");
	//System.out.print(a[count]+" ");
	//count--;
	
}
System.out.println(set);
	}

}
