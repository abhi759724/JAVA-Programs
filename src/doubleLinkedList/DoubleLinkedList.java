package doubleLinkedList;
import LinkedList.Node;
public class DoubleLinkedList {

	Node head = null;
	public void push(int item) {
		Node newNode = new Node(item);
		if(head == null) {
			newNode.data = item;
			newNode.next = head;
			head = newNode;
			head.prev = null;
			head.next = null;
		}
		else {
			Node currNode = new Node(item);
			currNode.next = null;
			Node ptr = head, ptr1;
			while(ptr.next != null) {
				ptr = ptr.next;
			}
			ptr1 = ptr;
			ptr1.next = currNode;
			currNode.prev = ptr1;
		}
	}
	public void insert_first(int item) {
		Node newNode = new Node(item);
		newNode.prev = null;
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	public int delete_first() {
		int item1 = -1;
		item1 = head.data;
		head = head.next;
		head.prev = null;
		return item1;
	}
	public void del() {
		System.out.println("deleted item is: "+delete_first());
	}
	public int delete_last() {
		int item = -1;
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		item = temp.data;
		temp.next = null;
		return item;
	}
	public void del1() {
		System.out.println("deleted item is: "+delete_last());
	}
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public void display_reverse() {
		Node temp = head;
		while(temp.next != null) {
			temp= temp.next;
		}
		Node newTemp = temp;
		while(newTemp != null) {
			System.out.print(newTemp.data+" ");
			newTemp = newTemp.prev;
		}
	}
	public static void main(String[] args) {
		DoubleLinkedList dlist = new DoubleLinkedList(); 
		dlist.push(43);
		dlist.push(78);
		dlist.push(12);
		dlist.insert_first(51);
//		dlist.display();
		
		System.out.println();
//		dlist.del();
		dlist.display();
		System.out.println();
		dlist.display_reverse();
	//	System.out.println();
//		dlist.del1();
	//	dlist.display();
	}

}
