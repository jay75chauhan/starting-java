package oops.inheritence;

public class Techer extends PersonClass {
	
	public Techer(String name) {
		super(name);
		System.out.println("inside techer constructor");
	}
	
	public void tech() {
		System.out.println(name+"the can tech");
	}
    public void eat() {
    	super.eat();//childrenclass to access parentclass
    	
    	System.out.println("Techer"  +name+" is eat");
    }
	public static void run() {
		System.out.println("techer can run");
	}
}

