package esg18;

import org.junit.Test;

import esg18.HelloWorld;

public class HelloWorldTest {

	@Test
	public void testHelloWorld() {
		HelloWorld h = new HelloWorld();
		int x = h.one();
		assertEquals(1, x);
	}

}
