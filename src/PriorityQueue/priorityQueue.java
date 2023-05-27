package PriorityQueue;
import LinkedList.Node;
public class priorityQueue {
	Node head;
	public priorityQueue(){
		head = null;
	}
	
	public void push(int item, int p) {
		Node newNode = new Node(item);
		newNode.pr = p;
		newNode.next = null;
		
		if(head == null || p > head.pr) {
			newNode.next = head;
			head = newNode;
		}
		else {
			Node temp = head;
			while(head.next != null && p <= temp.next.pr) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	public void display() {
		Node temp = head;
		System.out.print("head -> ");
		while(temp != null) {
			System.out.print(temp.data+":");
			System.out.print(temp.pr+" -> ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	public int pop() {
		int item = -1;
		if(head == null) {
			System.out.println("UnderFlow");
		}
		else {
			Node temp = head;
			while(temp.next.next != null) {
				temp = temp.next;
			}	
			item = temp.next.data;
			temp.next = null;
		}
		return item;
	}
	public void delete() {
		int a = pop();
		System.out.println("\nDeleted Item is: "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		priorityQueue pqueue = new priorityQueue();
		pqueue.push(34, 0);
		pqueue.push(23,5);
		pqueue.push(45,6);
		pqueue.push(65,1);
		pqueue.push(78,4);
		pqueue.push(89,9);
		pqueue.pop();
		pqueue.display();
		pqueue.delete();
		pqueue.display();
	}

}
