package loop;

public class ForLoop {

	public static void main(String[] args) {
		
	
	
		java.util.Scanner f = new java.util.Scanner(System.in);
		
		
		System.out.println("enter value");
		int n = f.nextInt();
		int a= 0;
		int b=1;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
				
		for(int i=0;i<n-2;i++) {
			
			
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
			
			
		}
	
			
		
	}

}
