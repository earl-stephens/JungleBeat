package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class NodeTest {

	@Test
	void testThatNodeExists() {
		Node node = new Node("plop");
		
		Assert.assertNotNull(node);
	}
	
	@Test
	void testThatNodeHasData() {
		Node node = new Node("This is data");
		
		Assert.assertEquals("This is data", node.data);
	}
	
	@Test
	void testThatNodeHasNextNode() {
		Node node = new Node("This is data");
		
		Assert.assertNull(node.next_node);
	}

}
