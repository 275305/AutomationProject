package a.array.programs;

public class TestMergeConflict {

	public int getSum(int a, int b) {

		return a + b;
	}

	public int getSum(int a, int b, int d, int e) {

		return a * b * d * e;
	}

	public int getSum(int a, int b, int c, int d, int e) {

		return a + b + c + d + e; // feature version
	}

	public static void main(String[] args) {

		TestMergeConflict test = new TestMergeConflict();

		System.out.println(test.getSum(10, 20));
		System.out.println(test.getSum(10, 20, 2, 1));

		System.out.println(test.getSum(10, 20, 30, 40, 10));

	}

}
