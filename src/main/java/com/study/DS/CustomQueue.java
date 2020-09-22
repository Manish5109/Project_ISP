package com.study.DS;

import java.util.Stack;

public class CustomQueue {
	static class OwnQueue{
		public static Stack<Integer> stack1 = new Stack<Integer>();
		public static Stack<Integer> stack2 = new Stack<Integer>();
		
		/**
		 * @param num
		 *  stack converting into queue
		 */
		public static void inQueue(int num) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			stack1.push(num);
			while(!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
			
		}
		
		/**
		 * printing value from stack1
		 */
		public static void deQueue() {
			while(!stack1.isEmpty()) {
				System.out.println(stack1.peek());
				stack1.pop();
			}
		}
	}
	// stack testing
	public static void stackTest() {
		 Stack<Integer> stack = new Stack<Integer>();
		 stack.push(1);
		 stack.push(5);
		 while(!stack.isEmpty()) {
			 System.out.println(stack.peek());
			 stack.pop();
		 }
	}
	
	public static void main(String[] args) {
		OwnQueue own = new OwnQueue();
		own.inQueue(1);
		own.inQueue(5);
		own.inQueue(10);
		own.deQueue();
		own.deQueue();
		own.deQueue();
		stackTest();
	}

}
