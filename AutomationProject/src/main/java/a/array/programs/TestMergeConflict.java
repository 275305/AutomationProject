package a.array.programs;

public class TestMergeConflict {
	
	public int getSum(int a,int b) {
		
		return a+b;
	}
	
	public int getSum(int a,int b,int d) {
		
		return a*b*d;
	}
	public static void main(String[] args) {
		
		TestMergeConflict test=new TestMergeConflict();
		
		int c=test.getSum(10, 20);
		
		System.out.println(c);
		System.out.println(test.getSum(10, 20,2));
		
		
	}
	

}
