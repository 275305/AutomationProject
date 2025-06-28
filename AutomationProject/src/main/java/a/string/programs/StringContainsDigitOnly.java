package a.string.programs;

public class StringContainsDigitOnly {
	
	
	public static void main(String[] args) {
		// need to extarct number in string
		String str="pra65deep78";
		
		System.out.print(str.replaceAll("\\D+",""));
		System.out.print(str.replaceAll("\\d+",""));
		
	}

}
