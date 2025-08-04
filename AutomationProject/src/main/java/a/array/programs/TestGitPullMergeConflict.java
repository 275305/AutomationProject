package a.array.programs;

public class TestGitPullMergeConflict {
	
	
	public int[] getValue(int a,int b) {
		
         int sum=a+b;
         int diff=a-b;
         
         return new int[] {sum,diff};
         

	}

	
	public static void main(String[] args) {
		
		TestGitPullMergeConflict test=new TestGitPullMergeConflict();
		
		int result[]=test.getValue(2, 5);
		
		System.out.print("Sum:"+result[0]);
		System.out.println("diff:"+result[1]);
		
		
	}
}
