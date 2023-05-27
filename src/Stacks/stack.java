package Stacks;
import java.util.Scanner;
public class stack {
	int stack[];
	int max = 5;
	int topIndex = -1;
	
	public stack() {
		stack = new int[max];
	}
	void pushInStack(int item) {
		if(topIndex == max-1) {
			System.out.println("Stack OverFlow");
		}
		else {
			stack[++topIndex] = item;
		}
	}
	void addInStack() {
		int item;
		System.out.println("Enter the element");
		Scanner s = new Scanner(System.in);
		item = s.nextInt();
		pushInStack(item);
		System.out.println("Item Added");
	}
	int popInStack() {
		int item = -1;  
		if(topIndex == -1) {
			System.out.println("Stack UnderFlow");
		}
		else {
			item = stack[topIndex];
			topIndex = topIndex - 1;
			
		}
		return item;
	}
	void top() {
		System.out.println("Top Element is: "+stack[topIndex]);
	}
	void deleteInStack() {
		int num = popInStack();
		System.out.println("Item Deleted is: "+ num);
	}
	void Display() {
		for(int i = topIndex ; i >=0 ; i--) {
			System.out.print(stack[i]+" ");
		}
	}
}
