package 예상문제들.자료구조구현;

public class myLinkedList {
	Node head;
	Node tail;

	private int size = 0;
	
	public static void main(String[] args) {
		

	}
	
	class Node{
		Object data;
		Node next;
		
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
	}
	
	void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		
		if(head.next==null) {
			tail = head;
		}
		
		size++;
	}
	
	void add(int k, Object input) {
		if(k==0) {
			addFirst(input);
		}else {
			Node x = head;
			for(int i=0; i<k-1; i++) {
				x = x.next;
			}
			Node newNode = new Node(input);
			Node temp = x.next;
			x.next = newNode;
			newNode.next = temp;
		}
	}

}
















