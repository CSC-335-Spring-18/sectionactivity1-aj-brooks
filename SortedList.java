public class SortedList<E extends Comparable<E>> {

	private int size;
	private Node front;

	private class Node {
		private E data;
		private Node next;

		public Node() {
			data = null;
			next = null;
		}

		public Node(E objectReference) {
			data = objectReference;
			next = null;
		}

		public Node(E objectReference, Node nextReference) {
			data = objectReference;
			next = nextReference;
		}
		
		public E getData() {
			return data;
		}
	}

	// External reference to find
	// the first element in this list

	// Number of elements in this list

	public SortedList() {
		front = null;
		size = 0;
	}

	public void insertInOrder(E element) {
		Node toIns = new Node(element);
		if(front == null) {
			front = toIns;
		 }
		else {
			Node current = front;
			Node prev = front;
			while(current != null) {
				if(current.getData().compareTo(element) <= 0) {
					prev.next = toIns;
					toIns.next = current;
					size++;
					return;
				}
				prev = current;
				current = current.next;
			}
			prev.next = toIns;
		}

		size++; // unless element existed
	}

	public int size() {
		return size;
	}

	public void remove(E element) {
		Node curr = front;
		Node prev = front;
		
		while(curr != null) {
			if(curr.getData().compareTo(element) == 0) {
				if(curr == front) {
					front = front.next;
				}
				prev.next = curr.next;
				size--;
				return;
			}
			prev = curr;
			curr = curr.next;
		}
	}
}