import java.util.HashSet;
import java.util.LinkedHashSet;

public class Occourancyofeachcharacterinstring2 {

	public static void main(String[] args) {
		String s="i am a good am a good boy";
		String[] str = s.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet();
		for(String s1:str) {
			set.add(s1);
			}
		
		for(String s1:set) {
			
		int count=0;
	for(int i=0;i<str.length;i++) {
		if(s1.equals(str[i]))
			count++;
		
		}
		
		if(count<=1)
			System.out.print(s1+" ");
		
	}		
}
}

