package arrays;

public class array {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner (System.in);
		
		
		
		System.out.println("student");
				
		int n=sc.nextInt();
	System.out.println("marks");
		int marks[]=new int[n]	;
		
		for(int i = 0;i<n;i++) {
		
		marks[i] =sc.nextInt();
		
				
		}
		int avr=0;
		
		for(int i = 0;i<n;i++) {
	
		avr+=marks[i];
		
	
	avr/=n;
	
		}System.out.println("the avr marks"+avr);
	
	
	}	

}
