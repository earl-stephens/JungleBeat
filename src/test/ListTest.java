package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ListTest {

	@Test
	void testThatThereIsAList() {
		LinkedList list = new LinkedList();
		
		Assert.assertNotNull(list);
	}

	@Test
	void testThatHeadStartsOutEmpty() {
		LinkedList list = new LinkedList();
		
		Assert.assertEquals(null, list.head);
	}
	
	@Test
	void testForAppendMethod() {
		LinkedList list = new LinkedList();
		list.append("doop");
		
		Assert.assertEquals("doop", list.head.data);
	}
	@Test
	void testThatListHeadNextNodeIsEmpty() {
		LinkedList list = new LinkedList();
		list.append("doop");
		
		Assert.assertNull(list.head.next_node);
	}
	
	@Test
	void testThatThereIsOnlyOneNodeAtTheStart() {
		LinkedList list = new LinkedList();
		list.append("doop");
		
		Assert.assertEquals(1, list.count);
	}
	
	@Test
	void testForListToStringMethod() {
		LinkedList list = new LinkedList();
		list.append("doop");
		
		Assert.assertEquals("doop", list.to_string());
	}
}
