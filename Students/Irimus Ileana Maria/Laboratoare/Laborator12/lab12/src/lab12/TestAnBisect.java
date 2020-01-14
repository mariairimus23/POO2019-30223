package lab12;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;

@SuppressWarnings("unused")
public class TestAnBisect extends TestCase {
	public static AnBisect an;

	public void setUp() {
		an = new AnBisect();
	}

	@Test
	public void test2() {
		assertTrue(an.esteAnBisect(20));
		assertTrue(an.esteAnBisect(400));
		assertTrue(!an.esteAnBisect(100));
	}
}
