package a.string.programs;

public class Prime1to20 {
	
	public static void main(String[] args) {
		
		  int i,n,f;
		  
		  for(n=2;n<=20;n++) {
			     f=0;
			  for(i=2;i<=n;i++) 
			  {
				  
				  if(n%i==0) 
					  f=f+1;
				  
			  }
			  
			  if(f==1)
				  System.out.print(n+" ");
			  
		  }
		
	}

}
