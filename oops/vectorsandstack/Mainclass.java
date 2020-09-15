package oops.vectorsandstack;

import java.util.*;

public class Mainclass {

	public static void main(String[] args) throws Exception {
	
		
		mystack<Integer> stack = new mystack<>();
		stack.push(1);
		stack.push(44);
		stack.push(45);
		
		int popp =stack.pop();
		System.out.println(popp);
		
		int popu =stack.pop();
		System.out.println(popu);
		
		int pottpu =stack.pop();
		System.out.println(pottpu);
		
		
	}

}
