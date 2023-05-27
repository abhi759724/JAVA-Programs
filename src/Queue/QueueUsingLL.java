package Queue;
import LinkedList.Node;
public class QueueUsingLL {
	Node rear;
	Node front;
	int size;
	public QueueUsingLL() {
		rear = null;
		front = null;
		size = 0;
	}
	public void push(int item) {
		Node newNode = new Node(item);
		if(rear == null) {
			newNode.next = rear;
			rear = newNode;
		}
		else {
			Node temp = rear;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	public void print() {
		Node temp = rear;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		QueueUsingLL q = new QueueUsingLL();
		q.push(43);
		q.push(44);
		q.push(45);
		q.push(46);
		q.print();
	}
}
