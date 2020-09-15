package oops.linkedList;

public class mylinkedlist1<E> {
	
	
	
	node<E> head;
   public	void  add(E data) {
		node<E> toadd = new node<E>(data);
		if (head== null) {
			head = toadd;
			return;
		}
		
		
		node<E> temp =head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next=toadd;
	}
	
	void print() {
		node<E> temp =head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		
	}
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public E removelast() throws Exception {
		node<E> temp =head;
		
		if(temp == null) {
			throw new Exception("cannot remove last element");
		 }
		
		
		if(temp.next ==null) {
			node<E> toremovelast =head;
			head =null;
			return toremovelast.data;		
		}
		
		while(temp.next.next != null) {
			temp = temp.next;
		}
		
		node<E> toremovelast =temp.next;
		temp.next=null;
		return  toremovelast.data;
		
	}
	public E getlast( ) throws Exception{
node<E> temp =head;
		
		if(temp == null) {
			throw new Exception("cannot peek last element");
		 }
		while(temp.next != null) {
			temp = temp.next;
		}
		return  temp.data;	
	}
	
	
	public static class  node<E>{
		public E data;
		public node<E> next;
	
   public node(E data) {
	   this.data =data;
	   next =null;
     }
   }
}
