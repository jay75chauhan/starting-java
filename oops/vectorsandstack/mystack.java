package oops.vectorsandstack;

import oops.linkedList.mylinkedlist1;

public class mystack<E>  {
	
	
	
	private mylinkedlist1<E>  kk = new mylinkedlist1<E>();
	 
	
	void push(E e) {
	 kk.add(e);
	 
	}
	
	E pop() throws Exception {	
		if(kk.isEmpty()) {
			throw new Exception("popping from empty stack noy allow");
			
		}
			
		return kk.removelast();
	}
	
	E peek()  throws Exception{
		if(kk.isEmpty()) {
			throw new Exception("popping from empty stack noy allow");	
		}
		 return kk.getlast();	
		
	}
	
}
