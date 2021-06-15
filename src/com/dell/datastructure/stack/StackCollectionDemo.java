package com.dell.datastructure.stack;

import java.util.Stack;

public class StackCollectionDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(55);
		stack.push(100);
		stack.push(23);
		stack.push(66);
		stack.push(99);
		stack.push(100);
		
		System.out.println(stack);
		
		// top of the stack
		System.out.println("Top : "+stack.peek());
		
		//remove top element
		System.out.println("Remove Element : "+stack.pop());
		System.out.println(stack);
	}

}
