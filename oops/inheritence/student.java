package oops.inheritence;

public class student extends PersonClass {
	public student(String name) {
		super(name);
		System.out.println("inside techer constructor");
	}
	public void stu() {
		
		System.out.println("the can stdey");
	}
	public static void run() {
		System.out.println("student can run");
	}
}
