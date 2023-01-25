package test;
import main.*;

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
		
		Assert.assertEquals(1, list.count());
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
		
		Assert.assertEquals(2, list.count());

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
		
		Assert.assertEquals(5, list.count());
	}
	
	  @Test 
	  void testForToStringWithFiveNodes() { 
		  LinkedList list = new LinkedList(); 
		  list.append("doop"); 
		  list.append("deep"); 
		  list.append("ding");
		  list.append("dah"); 
		  list.append("oom");
	  
		  Assert.assertEquals("doop deep ding dah oom", list.to_string()); 
	  } 
	  
	  @Test
	  void testForPrependMethod() {
		  LinkedList list = new LinkedList(); 
		  list.append("plop");
		  
		  Assert.assertEquals("plop", list.to_string());
		  
		  list.append("suu");
		  
		  Assert.assertEquals("dop", list.prepend("dop"));
		  Assert.assertEquals("dop plop suu", list.to_string());
		  Assert.assertEquals(3, list.count());
	  }
	  
	  @Test
	  void testForInsertMethod() {
		  LinkedList list = new LinkedList(); 
		  list.append("dop"); 
		  list.append("plop"); 
		  list.append("suu");
		  
		  Assert.assertEquals("woo", list.insert(1, "woo"));
		  Assert.assertEquals("deep", list.insert(0, "deep"));
		  Assert.assertEquals("oom", list.insert(3, "oom"));
	  }
	  
	  @Test
	  void testToStringAfterInsertMethod() {
		  LinkedList list = new LinkedList(); 
		  list.append("dop"); 
		  list.append("plop"); 
		  list.append("suu");
		  list.insert(1, "woo");
		  
		  Assert.assertEquals("dop woo plop suu", list.to_string());
		  
		  list.insert(3, "oom");
		  
		  Assert.assertEquals("dop woo plop oom suu", list.to_string());
	  }
	  
	  @Test
	  void testTheFindMethod() {
		  LinkedList list = new LinkedList(); 
		  list.append("deep"); 
		  list.append("woo"); 
		  list.append("shi");
		  list.append("shu");
		  list.append("blop");
		  
		  Assert.assertEquals("shi", list.find(2, 1));
	  }
	  
	  @Test
	  void testTheFindMethodWithMultipleElements() {
		  LinkedList list = new LinkedList(); 
		  list.append("deep"); 
		  list.append("woo"); 
		  list.append("shi");
		  list.append("shu");
		  list.append("blop");
		  
		  Assert.assertEquals("woo shi shu", list.find(1, 3));
	  }
	  
	  @Test
	  void testForIncludesMethod() {
		  LinkedList list = new LinkedList(); 
		  list.append("deep"); 
		  list.append("woo"); 
		  list.append("shi");
		  list.append("shu");
		  list.append("blop");
		  
		  Assert.assertTrue(list.includes("deep"));
	  }
	  
	  @Test
	  void testForIncludesNotMatching() {
		  LinkedList list = new LinkedList(); 
		  list.append("deep"); 
		  list.append("woo"); 
		  list.append("shi");
		  list.append("shu");
		  list.append("blop");
		  
		  Assert.assertFalse(list.includes("dep"));
	  }
}
