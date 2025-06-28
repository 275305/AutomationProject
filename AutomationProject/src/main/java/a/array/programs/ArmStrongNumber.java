package a.array.programs;

public class ArmStrongNumber {
	
	
	public static void main(String[] args) {
		
		int n=153,r,sum=0,p;
		 p=n;
		
		while(n>0) {
			
			r=n%10;
			
			sum=sum+r*r*r;
			
			n=n/10;
		}
		
		if(sum==p)
			System.out.print("armstrong no:" +sum);
		
		else
			System.out.print("not armstrong:" +sum);
	}

}
