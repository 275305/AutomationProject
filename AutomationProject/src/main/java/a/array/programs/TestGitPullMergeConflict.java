package a.array.programs;

public class TestGitPullMergeConflict {
	
	
	public int getValue(int a,int b) {
		
		System.out.println("sum of a and b :"+(a+b));//pradeep version
		
		return a+b;
	}

	
	public static void main(String[] args) {
		
		TestGitPullMergeConflict test=new TestGitPullMergeConflict();
		
		test.getValue(2, 5);
		
		
	}
}
