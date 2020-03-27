package esg18;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest extends HelloWorld{

	@Test
	public void testHelloWorld() {
		HelloWorld h = new HelloWorld();
		int x = 1;
		assertEquals(1, x);
	}

}
