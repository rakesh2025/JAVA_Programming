
public class Demo1 {

	public static void main(String[] args) {
		String s="rakeshPradhanRam";
		String n="";
		int count = 0;
		for(int i=0;i<s.length();i++) {
			
			Character c=s.charAt(i);
			if(Character.isLowerCase(c)) {
				n=n+c;
			}else {
				if(count==0) {
					n=n+"_"+ c.toLowerCase(c);	
					count=count+1;
				}else {
					n=n+c;
				}
			}
			
		}
		System.out.println(n);
	}

}
