package javapractice;

public class test11111 {

	public static void main(String[] args) {
		int a[]= {1,0,1,0,1,0};
		for (int i=0;i<a.length;i++) {
			
		
	     for(int j=i+1;j<a.length;j++) {
	    	 if(a[j]==0) {
	    		 int temp=a[i];
	    		 a[i]=a[j];
	    		 a[j]=temp;
	    		 
	    	 }
	     }
	     
		System.out.print(a[i]+" ");
		}}


	}


