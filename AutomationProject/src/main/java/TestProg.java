
public class TestProg {

	public static void main(String[] args) {

		String str = "abhinav akash tapan ravi ramu pradeep rakesh";

		String arr[] = str.split(" ");
	

		for (int i = 0; i < arr.length; i++) {

			if(i%2!=0) {
				StringBuilder sb = new StringBuilder(arr[i]);
				System.out.print(sb.reverse().toString()+" ");
				
			}

			else {
				System.out.print(arr[i]+" ");
			
			}
		}

	}

}
