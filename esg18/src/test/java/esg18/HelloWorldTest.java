package esg18;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testHelloWorld() {
		HelloWorld h = new HelloWorld();
		int x = h.one();
		assertEquals(1, x);
	}

}
