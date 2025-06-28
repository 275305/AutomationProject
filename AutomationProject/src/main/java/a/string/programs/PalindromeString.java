package a.string.programs;

import java.util.ArrayList;
import java.util.List;

public class PalindromeString {
	
	
	public static void main(String[] args) {
		
		//1st way
		String str="Madam";
		
		str=str.toLowerCase();
		
		StringBuilder sb=new StringBuilder(str);
		
		if(sb.reverse().toString().equals(str)) 
		System.out.print("String is palindrome");
		
		else
			System.out.print("String is not palindrome");
	
	
	
	//2nd way
	
	String str3="Nitin";
	
	str3=str3.toLowerCase();
	 ArrayList<Character> list = new ArrayList<>();
	 
	 System.out.println(str3.length());
	for(int i=str3.length()-1;i>=0;i--) 
	{
	   	
		list.add(str3.charAt(i));
		
	}
	   StringBuilder sb1=new StringBuilder();
	   StringBuilder sb3 = null;
	   for(char c:list) {
		   
		  sb3=sb1.append(c); 
		   
	   }
	
	   
	   if(str3.equals(sb3.toString()))
		  System.out.print("String is palindrome");
	   else
		  System.out.print("String is not palindrome:");
		 
}
}
