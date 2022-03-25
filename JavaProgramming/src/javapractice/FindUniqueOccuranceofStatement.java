package javapractice;

import java.util.HashSet;

public class FindUniqueOccuranceofStatement {

	public static void main(String[] args) {
		String s="welcome to banglore welcome";
		String[] str=s.split(" ");
		HashSet <String>set =new HashSet();
		for(int i=0; i<str.length;i++)
		{
			set.add(str[i]);
		}
		for(String word:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i])) 
				{
					count++;
				}
			}
			if(count==1)
			System.out.println(word+" & "+count);
		}

	}

}
