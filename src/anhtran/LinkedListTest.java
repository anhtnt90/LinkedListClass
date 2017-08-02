package anhtran;

public class LinkedListTest {
	
	public static void main(String[] args) {
		// Default constructor - let's put "0" into head element.
		LinkedListCls linkedList = new LinkedListCls();

		// add more elements to LinkedList
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(7);

	
		System.out.println("Print: linkedList: \t\t" + linkedList);
		linkedList.removeTailElement();
		linkedList.removeAllElementGreatThanValue(5);
		System.out.println("Print again: linkedList: \t" + linkedList);

	}

}
