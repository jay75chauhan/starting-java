package oops.inheritence;

public class PersonClass {
	
	protected String name;
	public PersonClass(String name) {//constructore
	this.name=name;
	}
	 static public void walk() {
		System.out.println("the can walk");
	}
	
	public void eat() {
		System.out.println("the can eat");
	}
	public static void run() {
		System.out.println("the can run");
	}
}
