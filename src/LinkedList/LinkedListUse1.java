package LinkedList;

import java.util.Scanner;

public class LinkedListUse1 {
	
	
	public static void printLinkedList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
public static Node takeInputs() {
	Scanner s = new Scanner(System.in);
	int data = s.nextInt();
	Node head = null;
	while(data != -1) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else
		{
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		data = s.nextInt();
	}
	return head;
}
public static void insertRandomly(Node head, int element, int index) {
	Node newNode = new Node(element);
	if(index == 0) {
		newNode.next = head;
		head = newNode;
	}
	else {
		
		Node temp = head;
		int c = 1;
		while(c <= index - 1 && temp != null) {
			c++;
			temp = temp.next;
		}
		if(temp != null) {
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
}
public static void insert_first(Node head, int element) {
	Node newNode = new Node(element);
	if(head == null) {
		newNode.next = head;
		head = newNode;
	}
	else {
		newNode.next = head;
		head = newNode;
	}
}

public static void main(String[] args) {  
  //Node head = takeInputs();
	Node head = new Node(32);
	Node n2 = new Node(21);
	head.next = n2;
	Node n3 = new Node(24);
	n2.next = n3;
	Node n4 = new Node(25);
	n3.next = n4;
	Node n5 = new Node(26);
	n4.next = n5;
	Node n6 = new Node(27);
	n5.next = n6;
		
	insertRandomly(head, 28, 1);
	//insert_first(head, 43);	
	printLinkedList(head);
			
		
	}

}
