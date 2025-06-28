
public class TestStringProg {
	
	
	public static void main(String[] args) {
		
		//i/p: "Pradeep Chauhan"
		//o/p: "Chauhan Pradeep"
		
		String str="Pradeep Chauhan";
		
		String arr[]=str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]+ " ");
		}
	}

}
