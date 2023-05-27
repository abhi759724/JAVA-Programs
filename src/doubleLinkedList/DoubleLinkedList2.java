package doubleLinkedList;
import LinkedList.Node;
public class DoubleLinkedList2 {
	
	Node head = null;
	void push(int item) {
		if(head == null) {
			head = new Node(item);
			head.next = null;
			head.prev = null;
		}
		else {
			Node newNode = new Node(item);
			Node ptr = head;
			while(ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = newNode;
			newNode.prev = ptr;
			newNode.next = null;
		}
	}
	void insertFirst(int item) {
		Node newNode = new Node(item);
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	void delete_first() {
		int item = -1;
		if(head == null) {
			System.out.println("Error 404 found");
		}
		else {
			item = head.data;
			head = head.next;
			head.prev = null;
		}
		System.out.println(item);
	}
	void delete_end() {
		int item = -1;
		if(head == null) {
			System.out.println("Error 404 found");
		}
		else {
			Node temp = head; 
			while(temp.next.next!= null) {
				temp = temp.next;
			}
			item = temp.next.data;
			temp.next = null;
		}
		System.out.println(item);
	}
	void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	void displayReverse() {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		Node lastNode = temp;
		while(lastNode != null) {
			System.out.print(lastNode.data+" ");
			lastNode = lastNode.prev;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList2 dlist2 = new DoubleLinkedList2();
		dlist2.push(45);
		dlist2.push(46);
		dlist2.push(47);
		dlist2.insertFirst(0);
		dlist2.delete_first();
		dlist2.delete_end();
		dlist2.display();
		System.out.println();
		dlist2.displayReverse();
	}

}
