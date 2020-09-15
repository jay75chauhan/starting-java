package userInput;


public class Scanner {

	public static void main(String[] args) {
		java.util.Scanner t = new java.util.Scanner(System.in);
		
		int p = t.nextInt();
		float f= t.nextFloat();
		
		int time = t.nextInt();
		
		
		float intrest =  p*f*time/100;
		
		
		System.out.println(intrest);
		
	}

}
