package a.array.programs;

public class PalindromeNumber {
	
	
	public static void main(String[] args) {
		
		int n=121,r,sum=0,p;
		  p=n;
		while(n>0) 
		{
			
			r=n%10;
			
			sum=sum*10+r;
			
			n=n/10;
		}
		
		if(sum==p)
			System.out.print("Palindrome no"+sum);
		else
			System.out.print("Not Palindrome no"+sum);
	}

}
