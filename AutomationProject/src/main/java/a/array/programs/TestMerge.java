package a.array.programs;

public class TestMerge {

	public int getSum(int a, int b) {

		System.out.println("sum of :"+ (a + b));  // Raju version
		return (a+b);
	}

	public int getSub(int a, int b) {



		System.out.println("substract of "+(a - b));   //Pradeep version

		return (a - b +10);   // Vishal Version


	}

	public int getMul(int a, int b) {

		return a / b;
	}

	public static void main(String[] args) {

		TestMerge test = new TestMerge();

		test.getSum(20, 10);
		test.getSub(20, 5);
		test.getMul(5, 3);
	}

}
