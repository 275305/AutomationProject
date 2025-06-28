package a.string.programs;

public class Count2CharStop {
	
	
	public static void main(String[] args) {
		
		String str="asdfgggjkhkk";
		
		char arr[]=str.toCharArray();
		 int count=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					count=count+1;
					
				}
				
			
			}
			
			if(count>2)
				break;
			else
				System.out.print(arr[i]);
		}
		
		
	}

}
