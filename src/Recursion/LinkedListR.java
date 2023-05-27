package Recursion;



public class LinkedListR {
	public static int c;
	public static int size(Node<Integer> head) {
		return c;
	}
	
	public static Node<Integer> addNode(Node<Integer> head, int item){
		if(head == null) {
			head = new Node<Integer>(item);
			head.next = null;
			c++;
		}
		else if(item < head.data) {
			head = insertInOrder(head, item);
		}
		else {
			head.next = addNode(head.next, item);
		}
		return head;
	}
	public static Node<Integer> insertInOrder(Node<Integer> head1, int val){
		if(head1 == null) {
			head1 = new Node<Integer>(val);
			head1.next =  null;
			c++;
		}
		else if(val<head1.data) {
			Node<Integer> temp = new Node<Integer>(val);
			temp.next = null;
			temp.next = head1;
			head1 = temp;
			c++;
		}
		else {
			head1 = addNode(head1.next, val);
		}
		return head1;
	}
	
	public static Node<Integer> delete_firsthelper(Node<Integer> head, int size){
		if(head == null) {
			return head;
		}
		if(size == 0) {
			c--;
			return head.next;
		}
		head.next = delete_firsthelper(head.next, size-1);
		
		return head;
	}
	public static Node<Integer> delete_first(Node<Integer> head){
		return delete_firsthelper(head, size(head)-1);
	}
	
	public static void print(Node<Integer> head) {
		
		if(head == null) {
			return;
		}
		System.out.print(head.data+" ");
		print(head.next);
	}
	
	public static Node<Integer> copyList(Node<Integer> head, Node<Integer> newList) {
		if(head!= null) {
			newList = new Node<Integer>(head.data);
//			newList.data = head.data;
			newList.next = null;
			newList.next = copyList(head.next,newList.next);
		}
		return newList;
	}
	
	public static Node<Integer> mergeSort1(Node<Integer> head1, Node<Integer> head2, Node<Integer> newList1){
		if(head1 == null && head2 == null) {
			newList1 = null;
		}
		else if(head1 == null) {
			newList1 = copyList(head2, newList1);
		}
		else if(head2 == null) {
			newList1 = copyList(head1, newList1);
		}
		else if(head1.data < head2.data) {
			newList1 = new Node<Integer>(head1.data);
			newList1.next = null;
			newList1.next = mergeSort1(head1.next, head2, newList1.next);
		}
		else if(head1.data > head2.data) {
			newList1 = new Node<Integer>(head2.data);
			newList1.next = null;
			newList1.next = mergeSort1(head1, head2.next, newList1.next);
		}
		else {
			newList1 = new Node<Integer>(head2.data);
			newList1.next = null;
			newList1.next = mergeSort1(head1.next, head2.next, newList1.next);
		}
		return newList1;
	}
	
	public static Node<Integer> combineList(Node<Integer> head1, Node<Integer> head2, Node<Integer> newList1) {
		
		if(head1 == null && head2 == null) {
		//	System.out.println("1");
			newList1 = null;
		}
		if(head1 == null) {
//			System.out.println("2");
			newList1 = copyList(head2, newList1);
		}
		if(head2 == null) {
	//		System.out.println("3");
			newList1 = copyList(head1, newList1);
		}
		if(head1 != null) {
//			System.out.println("4");
			newList1 = new Node<Integer>(head1.data);
			newList1.next = null;
			newList1.next = combineList(head1.next, head2, newList1);
		}
	
		return newList1;
	}
	
	public static Node<Integer> concatinate(Node<Integer> head1, Node<Integer> head2 ){
		if(head1 == null) {
			return head2;
		}else if(head2 == null) {
			return head1;
		}
		else {
			head1.next = concatinate(head1.next, head2);
		}
		return head1;
	}
	
	public static Node<Integer> reverse(Node<Integer> head1, Node<Integer> newList){
		if(head1 != null) {
			Node<Integer> temp = new Node<Integer>(head1.data);
			temp.next = null;
			temp.next = newList;
			newList = temp;
			newList = reverse(head1.next, newList);
		}
		return newList;
	}
	
public static int findNodehelper(Node<Integer> head1, int x, int si) {
	if(head1 == null) {
		return 0;
	}
	if(x == head1.data) {
		return si;
	}
	else {
		return findNodehelper(head1.next, x, si+1);
	}
}
	
	public static int findNode(Node<Integer> head1, int x) {
		return findNodehelper(head1, x, 0);
	}
	
	public static boolean find(Node<Integer> head1, int x) {
		if(head1 == null) {
			return false;
		}
		if(head1.data == x) {
			return true;
		}
		return find(head1.next, x);
	}
	
	public static Node<Integer> removeDup(Node<Integer> head1, Node<Integer> newList1){
		if(head1 != null) {
			if(find(newList1, head1.data) == false) {
				newList1 = addNode(newList1, head1.data);
			}
				newList1 = removeDup(head1.next, newList1);
			
		}
		return newList1;
		
		
	}
	public static Node<Integer> findanddeleteNode(Node head, int val) {
		if(head == null) {
			return head;
		}
		if(find(head, val) == true) {
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head1 = null, head2 = null;
		head1 = addNode(head1, 1);
		head1 = addNode(head1, 2);
		head1 = addNode(head1, 3);
		head1 = addNode(head1, 3);
		head1 = addNode(head1, 3);
		head1 = addNode(head1, 4);
		head1 = addNode(head1, 3);
		head2 = addNode(head2, 5);
		head2 = addNode(head2, 6);
		head2 = addNode(head2, 89);
		print(head1);
		System.out.println();
		print(head2);
//		System.out.println(size(head));
//		head = delete_first(head);
//		print(head);
		System.out.println();
//		int s = size(head);
//		System.out.println(s);
		Node<Integer> newList1 = null, list = null;
//		newList = reverse(head1, newList);
//		newList = copyList(head, newList);
//		Node<Integer> newList1 = null;
		newList1 = combineList(head1, head2, newList1);
//		print(newList1);
//		head1 = concatinate(head1, head2);
//		print(head1);
//		System.out.println();
//		System.out.println(find(newList1, 99));
		list = removeDup(newList1, list);
		print(list);
	}

}
