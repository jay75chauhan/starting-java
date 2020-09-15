package methods;

public class passByvalue {

	public static void main(String[] args) {
	
		dog c=new dog();
		c.legs=4;
		dog d=new dog();
		d.legs=7;
		swap(c,d);
		System.out.println(c.legs+" "+d.legs);
	}

//	static void swap(int a,int b) {
//		
//		int temp=a;
//		    a=b;
//		    b=temp;
//	
//	}
static void swap(dog a,dog b) {
	dog temp=a;
	       a=b;
	    b=temp;
}
static void change(dog dog) {
	dog.legs=88;
 }
}



class dog{
	int legs;
}