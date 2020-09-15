package oops.inheritence;

public class Mainclass {

	public static void main(String[] args) {
	Techer t1=new Techer("ijfrjf");
	
	System.out.println(t1);
//	t.eat();
//	t.walk();
//	t.tech();
//	t.run();
	PersonClass p=t1;//up casting
	Techer t=(Techer)p;//down casting
	
	
	
	
//	System.out.println(t instanceof PersonClass) ;
//	System.out.println(p instanceof   Techer ) ;
	
	
	t1.eat();
	}

}
