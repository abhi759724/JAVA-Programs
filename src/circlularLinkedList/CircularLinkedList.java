package circlularLinkedList;
import LinkedList.Node;
public class CircularLinkedList {
	Node head = null;
	void push(int item) {
		if(head == null) {
			head = new Node(item);
			head.next = head;
		}
		else {
			Node temp = head;
			while(temp.next != head) {
				temp = temp.next;
			}
			Node newNode = new Node(item);
			temp.next = newNode;
			newNode.next = head;
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
	int deleteLast() {
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
		System.out.print(" "+temp.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList clist = new CircularLinkedList();
		clist.push(34);
		clist.push(67);
		clist.push(87);
		clist.push(82);
		clist.push(83);
		clist.push(85);
		clist.push(89);
		clist.push(23);
		System.out.println("\n"+clist.deleteLast());
		System.out.println(clist.deleteFirst());
	//	clist.deleteFirst();
		clist.display();
		
		
	}

}
