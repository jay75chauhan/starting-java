package oops.deque;

import java.util.ArrayDeque;

public class deueclass {

	public static void main(String[] args) {
		
     mydeque<Integer>  i = new mydeque<>();
     
     
           i.addFirst(1);
           i.addFirst(2);
           i.addFirst(3);
         
           System.out.println(i.removeLast());
           System.out.println(i.removeFirst());
	}
}