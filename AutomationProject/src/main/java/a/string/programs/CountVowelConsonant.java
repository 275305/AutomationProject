package a.string.programs;

public class CountVowelConsonant {
	
	
	public static void main(String[] args) {
		
		String str="Pradeep";
		str=str.toLowerCase();
		
		int i,vcount=0,wcount=0;
		
		for(i=0;i<str.length();i++) {
		
		  if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u') {
			         vcount=vcount+1;
		             
		  }
		  else if(str.charAt(i)>'a' && str.charAt(i)<'z') {
		       wcount=wcount+1;
		       
		  }
		}
		System.out.println(vcount);
		System.out.print(wcount);
		
	}

}
