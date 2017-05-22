public class Q2{
	public static void main(String[] args){
		LinkedList li = new LinkedList(); 
		
		li.append(1).append(2).append(3).append(4).append(5).append(6); // [1, 2, 3, 4, 5, 6]

		int k = 2;
		System.out.println(li.find(k)); // 4

		k = 5;
		System.out.println(li.find(k)); // 1

		k = 0;
		System.out.println(li.find(k)); // 6

		k = 7;
		System.out.println(li.find(k)); // No such element\nnull
	}
}

class LinkedList{
	Node head;
	int size;
	Node last; // points to the last element

	LinkedList(){
		size = 0;
	}

	LinkedList append(int n){ //
		Node end = new Node(n);	
		
		if(size == 0){
			this.head = end;
		}else{				
			last.next = end;
		}
		size++;
		last = end;
		
		return this;
	}
		
	Node get(int pos){ // returns the element at a given position from the list
		Node current = this.head;  
		int count = 0; 

		if(pos == 0){
			return current;
		}

		while (current != null)
		{
		    current = current.next;
		    count ++;
		    if(count == pos)
			return current;
		}
		System.err.println("error");
		return null;
	}
	
	Integer find(int k){ // finds the kth element to the last in the given list li
		int si = size;	
		
		if(si <= k || k < 0){
			System.out.println("No such element");
			return null;
		}
		
		return this.get(si - k - 1).data;
	}
}

class Node{
		int data;
		Node next;
			 
		Node(int d) {
			data = d;
		}
	}
