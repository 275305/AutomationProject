package merge.conflict;

public class MergeConflict1 {

	public String getValue(String str) {

		return str;
	}

	public static void main(String[] args) {

		MergeConflict1 test = new MergeConflict1();

		System.out.println(test.getValue("This is Gurgaon"));
	}
}
