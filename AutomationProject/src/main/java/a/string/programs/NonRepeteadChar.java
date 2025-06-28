package a.string.programs;

public class NonRepeteadChar {
	
	
	public static void main(String[] args) {
				
		String str="Pradeep";
		
		str=str.toLowerCase();
		  char arr[]=str.toCharArray();
		int i,j,count;
		for(i=0;i<arr.length;i++) {
			 count=1;
			for(j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]&& arr[j]!=' ') {
					count=count+1;
					arr[j]='0';
				}
			}
			
			if(count==1 && arr[i]!='0')
				System.out.print(arr[i]);
		}
		
	}

}
