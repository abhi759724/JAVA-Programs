package Stacks;

import java.util.Scanner;



public class stackUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s = new stack();
		
		Scanner scan = new Scanner(System.in);
		int op = -1 ;
		do {
			System.out.println("\nStack Operations");
			System.out.println("1. Add Element in Stack");
			System.out.println("2. Delete Element in Stack");
			System.out.println("3. Show Top Element");
			System.out.println("4. Print Stack");
			System.out.println("Please choose Operation");
			op = scan.nextInt();
			if(op == 1) {
				s.addInStack();
			}
			else if(op == 2) {
				s.deleteInStack();
			}
			else if(op == 3) {
				s.top();
			}
			else if(op == 4) {
				s.Display();
			}
		}while(op!=0);
		
		

	}

}
