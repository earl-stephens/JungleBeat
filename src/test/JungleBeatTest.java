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

}
