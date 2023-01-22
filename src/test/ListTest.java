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

}
