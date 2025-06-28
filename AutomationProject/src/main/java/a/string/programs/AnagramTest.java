package a.string.programs;

public class AnagramTest {
	
	
	public static void main(String[] args) {
		
		
		String str="cafe";
		String str1="acfe";
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			for(int j=0;j<str1.length();j++) {
				
				    if(str.charAt(i)==str1.charAt(j)) {
				    	count=count+1;
				    }
			}
			
			
		}
		if(count==str.length())
			System.out.print("Anagram String" +str);
		else
			System.out.print("Not Anagram string"+ str);
		
	}

}
