package a.array.programs;

import org.checkerframework.checker.units.qual.Length;

public class Secondhighest {
	
	
	public static void main(String[] args) {
		
		
		int arr[]= {5,7,2,8,3,9};
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			System.out.print(arr[i]);
			
		}
		
		System.out.println(arr[arr.length-2]);
	}
	

}
