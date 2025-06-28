package a.string.programs;

public class B2C3D4 {
	
	
	public static void main(String[] args) {
		
		String str="a2b3c4";
		
		int i,j;
		char c;
		for(i=0;i<str.length();i=i+2) {
			
			c=str.charAt(i);
			int count=Character.getNumericValue(str.charAt(i+1));
			
			
			for(j=0;j<count;j++) {
				
				System.out.print(c);
			}
		}
	}

}
