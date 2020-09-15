package arrays;

public class twodarry {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter dimention");
		
		int r=sc.nextInt();
		int co=sc.nextInt();
		
		System.out.println("enter a");
		
		int a[][]=new int[r][co];
		int b[][]=new int[r][co];
		
		
		for(int i=0;i<r;i++) {
		for(int j=0;j<co;j++) {
			a[i][j]=sc.nextInt();
		}
	}System.out.println("enter b");
		for(int i=0;i<r;i++) {
			for(int j=0;j<co;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		int c[][]=new int[r][co];
		
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<co;j++) {
				for(int k=0;k<co;k++) {
				c[i][j]+=a[i][k]*b[k][j];
			}
		}
		}	
		System.out.println("sum of a nad b");

		for(int i=0;i<r;i++) {
			for(int j=0;j<co;j++) {
				System.out.print(c[i][j]+" ");
			}System.out.println();
	
	
	
	
		}
	
	}
}
