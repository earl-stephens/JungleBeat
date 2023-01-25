package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class JungleBeatTest {

	@Test
	void testForInstanceOfJungleBeatClass() {
		JungleBeat jb = new JungleBeat();
		
		Assert.assertNotNull(jb);
	}
	
	@Test
	void testForListAttribute() {
		JungleBeat jb = new JungleBeat();
		
		Assert.assertEquals(LinkedList.class, jb.list.getClass());
	}
	
	@Test
	void testThatListStartsOutEmpty() {
		JungleBeat jb = new JungleBeat();
		
		Assert.assertNull(jb.list.head);
	}
	
	@Test
	void testThatDataIsFormattedBeforeGoingToLinkedListClass() {
		JungleBeat jb = new JungleBeat();
		
		Assert.assertEquals("deep doo ditt", jb.append("deep doo ditt"));
	}
	
	@Test
	void testThatAppendFormatsTheData() {
		JungleBeat jb = new JungleBeat();
		jb.append("deep doo ditt");
		
		Assert.assertEquals("deep", jb.list.head.data);
		Assert.assertEquals("doo", jb.list.head.next_node.data);
		
		jb.append("woo hoo shu");
		
		Assert.assertEquals(6, jb.list.count());
	}
	
	@Test
	void testValidationOnAppend() {
		JungleBeat jb = new JungleBeat();
		jb.append("deep");
		
		jb.append("Mississippi");
		
		Assert.assertEquals("deep", jb.list.to_string());
	}
}
