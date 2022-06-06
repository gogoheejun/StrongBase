package 예상문제들.자료구조구현;

public class LinkedList {
	private Node head;//첫번째 노드
	private Node tail;
	private int size = 0;
	
	public class Node{
		private Object data;
		
		private Node next;//다음 노드가리키는 애
		
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		//출력
        public String toString(){
            return String.valueOf(this.data);
        }
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		
		newNode.next = head;//기존의 첫번째애
		head = newNode;
		
		size++;
		if(head.next==null) {//바로위쪽에서 newNode.next=head 했잖아. 만약 head가 null이면(즉 이땐 진짜 처음일때임)
			tail = head;
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		
		if(size==0) {
			addFirst(input);
		}else {
			tail.next = newNode;
			size++;
		}
	}
	
	//특정 인덱스의 노드 찾기
	public Node node(int index) {
		Node x = head;
		for(int i=0; i<index; i++) {
			x = x.next;
		}
		return x;
	}
	
	//중간에 넣기
	public void add(int k, Object input) {
		if(k==0) {
			addFirst(input);
		}else {
			Node temp1 = node(k-1);
			Node temp2 = temp1.next;//k번째 노드
			
			//요게 키포인트
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			
			size++;
			
			if(newNode.next ==null) {
				tail = newNode;
			}
		}
	}
}

































