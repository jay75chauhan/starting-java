package oops;


class dog{
	
}

class cat{
	
	//state
	boolean flur;
	String color, breed;
	int legs,eyes;
	//behavior
	public void walk() {
		System.out.println("cat run");
	}
	public void description() {
		System.out.println("flur"+ legs +"legs and"+ eyes+"eyes");
	}
}

public class MainClass {

	public static void main(String[] args) {
		cat cat1=new cat();
		cat1.legs=4;
	cat1.color="lnl";
		cat1.description();
		

	}


}
