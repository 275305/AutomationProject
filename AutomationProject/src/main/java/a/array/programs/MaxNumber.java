package a.array.programs;

public class MaxNumber {
	
	public static void main(String[] args) {
		
		
		int arr[]= {2,5,1,9,3,8};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println(max);
	}

}
