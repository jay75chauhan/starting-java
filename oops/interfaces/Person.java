package oops.interfaces;

public  class Person implements Students,Youtube,gamer {

	public static void main(String[] args) {
		Person obj =new Person();
		
		Students obj1 =obj;
	     
	obj.makegame();
			
	
		
		
		obj.study();
		obj.video();
		obj.makegame();
		//obj1.study();

	}

	@Override
	 public void study() {
		   System.out.println("person studei");
		
	}

	@Override
	public void video() {
		System.out.println("make") ;
		
	}

	@Override
	public void makegame() {
		// TODO Auto-generated method stub
		
	}

	
}
