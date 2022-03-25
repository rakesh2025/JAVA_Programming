package javapractice;

public class Gcd {

	public static void main(String[] args) {
	int num1=30,num2=45;
	int gcd=0;
	int Lnum=num1;
	if(num1>num2)
	{
		Lnum=num2;
	}
		for(int i=Lnum;i>1;i--) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
				
			}
		}
		System.out.println(gcd);
	}

}
