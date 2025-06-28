package a.array.programs;

public class TestMergeConflict {
	
	public int getSum(int a,int b,int c,int d,int e) {
		
		return a+b+c+d+e;  //feature version
	}
	
	
	public static void main(String[] args) {
		
		TestMergeConflict test=new TestMergeConflict();
		
		int c=test.getSum(10, 20,30,40,10);
		System.out.println(c);
		
		
	}
	

}
