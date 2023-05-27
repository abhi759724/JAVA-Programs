package DynamicStack;

import java.util.Scanner;

import LinkedList.Node;

public class DynamicStackUse {
	
	static DynamicStackClass<Integer> head = null;
	public static void pushInDynamicStack(int item) {
		DynamicStackClass<Integer> newNode = new DynamicStackClass<Integer>(item);
//		DynamicStackClass<Integer> head = null;
		newNode.next = head;
		head = newNode;
	}
	public static int pop() {
		int item = -1;
		if(head == null) {
			System.out.println("Stack Underflow");
		}
		else {
			item = head.data;
			head = head.next;
		}
		return item;
	}
	public static void displayDynamicStack(){
		DynamicStackClass<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		pushInDynamicStack(23);
		pushInDynamicStack(45);
		pushInDynamicStack(56);
		pushInDynamicStack(67);
		
		displayDynamicStack();
		int a = pop();
		System.out.println("\nDeleted Item is: "+ a);
		displayDynamicStack();
	}

}
