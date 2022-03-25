package javapractice;

public class GeneratePrimeNumbersBetween1to100 {

	public static void main(String[] args) {
				  
{  
	int d=0,n=0,i=1,j=1;  
		
	for(int p=0;p<100;p++)  
		
	{  
		j=1;  
		d=0;  
		while(j<=i)  
		{  
		if(i%j==0)  
		d++;  
		j++;   
		}  
		if(d==2)  
		{  
		System.out.println(i);                                        
		}  
		i++;  
		}    
		}  
		}  
	


	
}

