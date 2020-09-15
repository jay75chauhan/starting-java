package statment;

public class primenumber {

	public static void main(String[] args) {
	
		
		java.util.Scanner o = new java.util.Scanner(System.in);
		
		
		
		int n =o.nextInt();
		
		float  r =0;
		for(float i=1;i<=n;i++)  {
			
		     if (i %2==0) {
		    	 
		    	 r-=1/i;}
		     
		     else {r+=1/i;}
		    			 
		    			 
		     }
			
			
			
			
		System.out.println(r);	
			
		
		
		
	}

}
