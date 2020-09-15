package oops.maps;

public class HashCodeAndEquals {

	public static void main(String[] args) {
	   
               pen obj1=new pen(10,"black");
               pen obj2=new pen(10,"black");
               
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
		
	}

}
               class pen{
            	   int price;
            	   String color;
            	        public pen(int price,String colors) {
            		    this.color=color;
            		     this.price=price;
            	   }
    @Override        	   
   public boolean equals(Object obj) {
	   pen that = (pen) obj;
	   
	   boolean isEqual = this.price==that.price && this.color==that.color;
	   
	   return isEqual;
   }
            	        
            	        
            	        
               }