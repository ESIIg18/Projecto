import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testHW {

	@Test
	public void testHelloWorld() {
		HelloWorld h = new HelloWorld();
		int x = h.one();
		assertEquals(1, x);
	}

}
