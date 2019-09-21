package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumTest {

	@Test
	public void test() {
		JUnitTesting test= new JUnitTesting();
		int output=test.sum(5);
		assertEquals(15,output);
	}

}
