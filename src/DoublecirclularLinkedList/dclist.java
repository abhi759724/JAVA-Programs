package DoublecirclularLinkedList;
import LinkedList.Node;
public class dclist {
	Node head = null;
	
	void push(int item) {
		if(head == null) {
			head = new Node(item);
			head.next = head;
			head.prev = head;
		}
		else{
			Node temp = head;
			while(temp.next!=head) {
				temp = temp.next;
			}
			Node newNode = new Node(item);
			temp.next = newNode;
			newNode.prev = temp;
			newNode.next = head;
		}
	}
	void insertFirst(int item) {
		if(head == null) {
			head = new Node(item);
			head.next = head;
			head.prev = head;
		}
		else {
			Node temp = head;
			while(temp.next != head) {
				temp = temp.next;
			}
			Node newNode = new Node(item);
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			temp.next = head;
		}
	}
	int deleteFirst() {
		int item = -1;
		Node temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		item = head.data;
		head = head.next;
		temp.next = head;
		return item;
	}
	int deleteEnd() {
		int item = -1;
		Node temp = head;
		while(temp.next.next != head) {
			temp = temp.next;
		}
		item = temp.next.data;
		temp.next = head;
		return item;
	} 
	void display() {
		Node temp = head;
		while(temp.next != head) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}
	public static void main(String[] args) {
		dclist dclist = new dclist();
		dclist.push(34);
		dclist.push(45);
		dclist.push(65);
		dclist.insertFirst(98);
		dclist.insertFirst(32);
		dclist.display();
		System.out.println();
		dclist.deleteFirst();
		dclist.display();
		dclist.deleteEnd();
		System.out.println();
		dclist.display();
	}

}
