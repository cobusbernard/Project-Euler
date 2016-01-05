package za.co.cobusbernard.projecteuler;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class ProblemsTest {

	@Test
	public void test() {
		Assert.assertEquals(23, Problems.problem1(10));
	}
	
	@Test
	public void testPrimes() {
		
		ArrayList<Integer> primesTo11 = Problem3.generatePrimes(11);
		
		int i = 0;
		
		Assert.assertEquals(new Integer(2), primesTo11.get(i++));
		Assert.assertEquals(new Integer(3), primesTo11.get(i++));
		Assert.assertEquals(new Integer(5), primesTo11.get(i++));
		Assert.assertEquals(new Integer(7), primesTo11.get(i++));
		Assert.assertEquals(new Integer(11), primesTo11.get(i++));
	}
}
