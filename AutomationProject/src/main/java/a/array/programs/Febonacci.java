package a.array.programs;

public class Febonacci {

	
	public static void main(String[] args) {
		
		//print before 20 febonacci series
		int a=0,b=1,c=0,n=20,i;
		
		System.out.print(a);
		for(i=0;i<n &&c<n;i++) {
			
			
			a=b;
			b=c;
			c=a+b;
			if(c<20)
			System.out.print(c+ " ");
		}
		
	}
}
