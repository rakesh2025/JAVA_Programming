package javapractice;

public class AccuranceOfCharWithoutSet {

	public static void main(String[] args) {
		
		String s="aaabcfffsda";
		int count=1;
		String rev="";
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count ++;
			}
			else
			{
				rev=rev+s.charAt(i)+count;
				count=1;
				//System.out.println(rev);
			}
		}
		rev=rev+s.charAt(s.length()-1)+count;
		count=1;
		System.out.println(rev);
			


	}

}
