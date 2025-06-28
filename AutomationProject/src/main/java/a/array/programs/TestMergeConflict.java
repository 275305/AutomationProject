package a.array.programs;

public class TestMergeConflict {
	
	public int getSum(int a,int b,int c,int d) {
		
		return a+b+c+d;
	}
	
	
	public static void main(String[] args) {
		
		TestMergeConflict test=new TestMergeConflict();
		
		int c=test.getSum(10, 20,30,40);
		System.out.println(c);
		
		
	}
	

}
