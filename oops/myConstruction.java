package oops;

public class myConstruction {
	int wheels;
	int headLights;
	 String colour;
	
	myConstruction(int wheels){
		this.wheels=wheels;
		headLights=2;
		
		
		
	}
myConstruction(int wheels,String colour){
	this.wheels=wheels;
	this.colour=colour;
	
}
	public static void main(String[] args) {
		
		myConstruction car=new myConstruction(4);
		System.out.println(car.wheels+"wheels in ");
		
	myConstruction mycar=new myConstruction(4,"black");
	System.out.println(mycar.wheels+"  "+mycar.colour);

	}

}
