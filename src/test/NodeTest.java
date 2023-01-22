package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NodeTest {

	@Test
	void testThatNodeExists() {
		Node node = new Node("plop", null);
		
		Assert.assertNotNull(node);
	}
	
	@Test
	void testThatNodeHasData() {
		Node node = new Node("This is data", null);
		
		Assert.assertEquals("This is data", node.data);
	}
	
	@Test
	void testThatNodeHasNextNode() {
		LinkedList list = new LinkedList();
		
		Assert.assertEquals("doop", list.append("doop"));
	}

}
