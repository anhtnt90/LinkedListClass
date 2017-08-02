package anhtran;

public class LinkedListCls {
	private static int counter;
	private Node head;

	// Default constructor
	public LinkedListCls() {

	}

	//appends the specified element to the end of this list.
	public void add(int data) {

		if (head == null) {
			head = new Node(data);
		}

		Node nodeTemp = new Node(data);
		Node nodeCurrent = head;

		if (nodeCurrent != null) {

			while (nodeCurrent.getNext() != null) {
				nodeCurrent = nodeCurrent.getNext();
			}

			nodeCurrent.setNext(nodeTemp);
		}

		// increment the number of elements variable
		incrementCounter();
	}

	private static int getCounter() {
		return counter;
	}

	private static void incrementCounter() {
		counter++;
	}

	private void decrementCounter() {
		counter--;
	}

	public Object get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index < 0)
			return null;
		Node nodeCurrent = null;
		if (head != null) {
			nodeCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (nodeCurrent.getNext() == null)
					return null;

				nodeCurrent = nodeCurrent.getNext();
			}
			return nodeCurrent.getData();
		}
		return nodeCurrent;

	}

	// removes the element at the specified position in this list.
	public boolean remove(int index) {

		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;

		Node nodeCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (nodeCurrent.getNext() == null)
					return false;

				nodeCurrent = nodeCurrent.getNext();
			}
			nodeCurrent.setNext(nodeCurrent.getNext().getNext());

			decrementCounter();
			return true;

		}
		return false;
	}

	// removes the element at the specified position in this list.
	public boolean removeTailElement() {
		return remove(size() - 1);
	}
	
	void removeAllElementGreatThanValue(int value){
		for (int i = 0; i < size(); i++) {
			if((int)get(i) > value) {
				if(remove(i)) {
					i=i-1;
				}
			}
		}
    }
	
	// returns the number of elements in this list.
	public int size() {
		return getCounter();
	}

	public String toString() {
		String output = "";

		if (head != null) {
			Node nodeCurrent = head.getNext();
			while (nodeCurrent != null) {
				output += "[" + nodeCurrent.getData() + "]";
				nodeCurrent = nodeCurrent.getNext();
			}

		}
		return output;
	}

	private class Node {
		
		Node next;

		int data;

		public Node(int dataValue) {
			next = null;
			data = dataValue;
		}

		@SuppressWarnings("unused")
		public Node(int dataValue, Node nextValue) {
			next = nextValue;
			data = dataValue;
		}

		public int getData() {
			return data;
		}

		@SuppressWarnings("unused")
		public void setData(int dataValue) {
			data = dataValue;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node nextValue) {
			next = nextValue;
		}

	}
}
