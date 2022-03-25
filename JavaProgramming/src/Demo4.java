
public class Demo4 {

	public static void main(String[] args) {
	String s="aaaabbbccd";//
	//String []a=s.split(" ");
	String str="";
	int count=1;
	for(int i=0;i<s.length()-1;i++) {
		if(s.charAt(i)==s.charAt(i+1)) {
			count++;
		}else {
			str=str+s.charAt(i)+count;
			count=1;
		}
		
	}
	str=str+s.charAt(s.length()-1)+count;
	System.out.println(str);

	}
}
