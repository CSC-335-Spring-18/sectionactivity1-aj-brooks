import static org.junit.Assert.*;

import org.junit.Test;

public class SortedListTest {
	
	@Test
	public void test() {
		testSize();
		testRemove();
	}
	public void testSize() {
		SortedList newList = new SortedList();
		newList.insertInOrder(8);
		newList.insertInOrder(2);
		newList.insertInOrder(4);
		newList.insertInOrder(3);
		newList.insertInOrder(1);
		assertEquals(newList.size(), 5);
	}
	
	public void testRemove() {
		SortedList newList = new SortedList();
		newList.insertInOrder(8);
		newList.insertInOrder(2);
		newList.insertInOrder(4);
		newList.insertInOrder(3);
		newList.insertInOrder(1);
		newList.remove(2);
		newList.remove(1);
		assertEquals(newList.size(), 3);
		
	}
	
}
