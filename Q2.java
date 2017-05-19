
public class Q2{
	public static void main(String[] args){
		LinkedList li = new LinkedList();
		li.head = new Node(1);

		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		

		li.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		int k = Integer.parseInt(args[0]);

		System.out.println(find(li, k));
	}

	public static Integer find(LinkedList li, int k){ // finds the kth element to the last in the given list li
		int si = size(li);	
		
		if(si <= k){
			System.out.println("No such element");
			return null;
		}
		
		return get(si - k, li);
	}

	public static int size(LinkedList li){ // returns the size of the list
		Node current = li.head;  
		int count = 0; 

		while (current != null)
		{
		    current = current.next;
		    count ++;
		}
		return count; 
    	}

	public static Integer get(int pos, LinkedList li){ // returns the element at a given position from the list
		Node current = li.head;  
		int count = 1; 

		if(pos == 1)
			return current.data;

		while (current != null)
		{
		    current = current.next;
		    count ++;
		    if(count == pos)
			return current.data;
		}
		System.err.println("error");
		return 0;
	}
}

class LinkedList{
	Node head;  
}

class Node{
		int data;
		Node next;
			 
		Node(int d) {
			data = d;
		}
	}
