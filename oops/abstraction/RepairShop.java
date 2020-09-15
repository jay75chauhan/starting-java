package oops.abstraction;

public class RepairShop {
	public   static  void RepairCar (car hh) {
		System.out.println("car is RepairShop ");
	}

	public static void main(String[] args) {
		wagonr wagonr=new wagonr();
		audi audi =new audi();
		
		
		RepairCar(wagonr);
		RepairCar(audi);
	
	}

}
