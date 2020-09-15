package arrays;

public class bubbleshort {

	public static void main(String[] args) {
		
		
		int a[]= {3,4,43,6,5,4,3,};
		
		int n=a.length;
	
	for(int i=0;i<n-1;i++) {
		
		for(int j=0;j<n-1;j++) {
	
			if(a[j+1]<a[j]) {
				
			int tt=	a[j+1];
			
			a[j+1]=a[j];
			a[j]=tt;
				
				
			}
			
	     }
	for(int ii:a) {
		
		
		System.out.println(ii);
	}
	}
	  }
	
	}

