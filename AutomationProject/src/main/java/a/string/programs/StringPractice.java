package a.string.programs;

import java.util.ArrayList;
import java.util.List;

public class StringPractice {
	
public static void main(String[] args) {
        
        String str="Madam";
        str=str.toLowerCase();
        ArrayList<Character> list=new ArrayList();
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=null;
        for(int i=str.length()-1;i>=0;i--){
            
            list.add(str.charAt(i));
        }
        
        
        for(char c:list){
            sb1=sb.append(c);
        }
        System.out.print(sb1);
        if(str.equals(sb1.toString()))
        System.out.println("String is palindrome"+str);
        else
        System.out.print("String is not palindrome"+str);
    }


}
