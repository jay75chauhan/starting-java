package oops.queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueclass {

	public static void main(String[] args) {
	
       myqueue<Integer>    ee=new myqueue<Integer>();
        
        ee.enqueue(12);
        ee.enqueue(14);
        ee.enqueue(123);
        ee.enqueue(125);
        System.out.println(ee.dequeue());
        
       
      System.out.println(ee.pek());

}
}