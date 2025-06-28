package a.array.programs;

public class Swap2NumerWithoutTemp {
	
	
	public static void main(String[] args) {
		
		int a=10,b=20,c;
		
		c=a+b;
		a=c-a;
		b=c-b;
		
		System.out.print(a+" "+b);
	}

}
