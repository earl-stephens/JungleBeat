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
}
