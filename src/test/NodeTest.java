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

}
