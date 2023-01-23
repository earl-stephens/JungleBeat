package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

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
	
	@Test
	void testForHeadWithOnlyOneNode() {
		LinkedList list = new LinkedList();
		list.append("doop");
		
		Assert.assertEquals(list.head.getClass(), Node.class);
	}
	
	@Test
	void testForAddingASecondNode() {
		LinkedList list = new LinkedList();
		list.append("doop");
		list.append("deep");
		
		Assert.assertEquals("deep", list.head.next_node.data);
	}
	
	@Test
	void testThatThereAreTwoNodes() {
		LinkedList list = new LinkedList();
		list.append("doop");
		list.append("deep");
		
		Assert.assertEquals(2, list.count);

	}
	
	@Test
	void testForToStringWithTwoNodes() {
		LinkedList list = new LinkedList();
		list.append("doop");
		list.append("deep");
		
		Assert.assertEquals("doop deep", list.to_string());
	}
	
	@Test
	void testForAddingFiveNodes() {
		LinkedList list = new LinkedList();
		list.append("doop");
		list.append("deep");
		list.append("ding");
		list.append("dah");
		list.append("oom");
		
		Assert.assertEquals(5, list.count);
	}
	
	  @Test void testForToStringWithFiveNodes() { 
		  LinkedList list = new LinkedList(); 
		  list.append("doop"); 
		  list.append("deep"); 
		  list.append("ding");
		  list.append("dah"); 
		  list.append("oom");
	  
		  Assert.assertEquals("doop deep ding dah oom", list.to_string()); }
	 
}
