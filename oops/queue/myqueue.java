package oops.queue;

import java.util.*;

import oops.linkedList.mylinkedlist1.node;

public class myqueue<E> {
	
	
	private node<E> head,rear;
	
	
	
	
	public void enqueue(E e) {
		
		node<E> toadd = new node(e);
		
		if(head ==null) {
			
			head=rear=toadd;
			return;
		}
		
		rear.next=toadd;
		rear =rear.next;
	}
	
	  public E dequeue() {
		  
		  if(head ==null) {
				
			
				return null;
			}
			
		  
		  
		  node<E> temp=head;
		  head=head.next;
		  
		  if (head==null) {
			  
			  rear=null;
		  }
		  
		  return temp.data;
	  }
		  
		  public E pek() {
		  
		  
		  node<E> temp1=head;
		  
		  return temp1.data;
		  }
	  }
	
	
	


