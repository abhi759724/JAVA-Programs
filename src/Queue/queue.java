package Queue;

import java.util.Scanner;

public class queue {
	int max = 5;
	int queue[];
	int rear = -1;
	int front = -1;
	public queue(){
		queue = new int[max];
	}
	void push(int item) {
		if(rear == max - 1 && front == 0 || rear + 1 == front) {
			System.out.println("Queue Overflow");
		}
		else {
			if(rear == max -1) {
				rear = 0;
			}
			else if(rear == -1)
			{
				rear = 0;
				front = 0;
			}
			else
			{
				rear = rear + 1;
				
			}
			queue[rear] = item;
		}
	}
	void add() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the Element");
		int n = s.nextInt();
		push(n);
		System.out.println("Item Added");
	}
	void front() {
		if(front == -1) {
			System.out.println("front is Null");
		}
		else {
		System.out.println("Front Element is: "+queue[front]);
		}
	}
	void rear() {
		if(rear == -1) {
			System.out.println("front is Null");
		}else {
		System.out.println("rear Element is: "+queue[rear]);
		}
	}
	int deleteQueue() {
		int item = queue[front];
		if(rear == -1) {
			System.out.println("Queue Underflow");
		}else{
			if(rear == front){
				front = -1;
				rear = -1;
			}
			else if(front == max -1) {
				front =0;
			}
			else {
				front = front +1;
			}
		}
		return item;
	}
	void delete() {
		deleteQueue();
		System.out.println("Item Deleted"); 
	}
	void print() {
		for(int i  = front ; i  <= rear ; i++) {
			System.out.print(queue[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q = new queue();
		Scanner s = new Scanner(System.in);
		int op = -1 ;
		do {
			System.out.println("Queue Operations");
			System.out.println("1. Add Element");
			System.out.println("2. Delete Element");
			System.out.println("3. Print Queue");
			System.out.println("4. Show front");
			System.out.println("5. Show rear");
			System.out.println("6. Exit");
			System.out.println("\nPlease choose Operation");
			op = s.nextInt();
			if(op == 1) {
				q.add();
			}
			else if(op == 2) {
				q.delete();
			}
			else if(op == 3) {
				q.print();
			}
			else if(op == 4) {
				q.front();
			}
			else if(op == 5) {
				q.rear();
			}else if(op== 0) {
				break;
			}
		}while(op!=0);
	}
}
