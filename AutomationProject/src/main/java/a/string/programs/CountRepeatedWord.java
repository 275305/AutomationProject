package a.string.programs;

public class CountRepeatedWord {
	
	
	public static void main(String[] args) {
		
		
		String str="Pradeep Kumar Pradeep jai shree jai ram";
		
		   str=str.toLowerCase();
		   
		   String str1[]=str.split(" ");
		   int i,j,count;
		   for(i=0;i<str1.length;i++)
		   {
			   count=1;
			   for(j=i+1;j<str1.length;j++) 
			   {
				   if(str1[i].equals(str1[j]) && str1[j]!=" ") 
				   {  					   
					   count=count+1;
					   str1[j]="0";
				   }
				   
			   }
			     //to print repeated word
			   if(count>1 && str1[i]!="0")
				    System.out.print(str1[i]+"-"+count+" ");  
			   
			   // to print non repeated word
			   if(count==1 && str1[i]!="0")
				    System.out.print(str1[i]+"-"+count+" ");
			   
		   }
		
	}

}
