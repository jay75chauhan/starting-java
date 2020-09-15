package statment;

public class WillLoops {
	 public static void main(String[] args) {
	
		 java.util.Scanner n =new java.util.Scanner (System.in);
	  
		
//		int i=n;
//		
//		int sum=0;
//		
//		while(i>0) {
//		
//		int   u=i%10;
//		
//		i/=10;
//		sum+=u;
//		
//		
//		
//		}System.out.println(sum);
	int t=n.nextInt();
	
	int i=t;
	int ri=0;
	
	
	
	while(i>0) {
		
		int l=i%10;
		ri=ri*10+l;
		i/=10;
		}
	
	
	if(ri==t) {
		System.out.println(n +" is palidrom");
	
	         }else {System.out.println(n +"  pnotalidrom");
	}

	 }
}
