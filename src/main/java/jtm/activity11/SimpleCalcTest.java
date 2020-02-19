package jtm.activity11;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import jtm.activity08.SimpleCalc;
import jtm.activity08.SimpleCalcAssertionsTest;
import junit.framework.Assert;

public class SimpleCalcTest  {

	/*
	 * TODO
	 *
	 * Write unit tests. Try to cover as many cases as possible, to have the highest
	 * coverage for SimpleCalc class in jtm.activity08
	 */

	SimpleCalc sc;

	@Before
	public void setUp() {
		sc =new SimpleCalc();
		// TODO initialize SimpleCalc object
	}

	@Test
	public void testAddInRange() {
		
		//sc.add(2, 3);
		int expected= 5;
		int result= SimpleCalc.add( 2, 3);		
		assertEquals("2+3 should be 5", expected, result);
	
		
		expected = 6;
		result= SimpleCalc.add( -2, 8);	
		assertEquals("8+ -2 should be 6", expected, result);
		
		
		expected =0;
		result=SimpleCalc.add(-1, 1);
		assertEquals("-1 +1 should be 0", expected, result);
		
		
		// TODO test addition for case where both numbers and result is in allowed range
	}

	@Test
	public void testAddOutOfRange() {
		
		Integer result=SimpleCalc.add(12, 222);
		assertNull("12 and 222 are out of range", result);
		
		result=SimpleCalc.add(2, 222);
		assertNull("2 and 222 are out of range", result);
		
		
		
		// TODO test addition for cases where both numbers and result is out of allowed
		// range
	}

	@Test
	public void testSubtractInRange() {
		int expected = 4;
		int result= SimpleCalc.subtract( -2, -6);	
		assertEquals("-2 - -6 should be 4", expected, result);
		
		
		expected = 10;
		result= SimpleCalc.subtract( 10, 0);	
		assertEquals("10 - 0 should be 10", expected, result);
		
		
		// TODO
	}

	@Test
	public void testSubtractOutOfRange() {
		
		
		Integer result=SimpleCalc.subtract(20, 60);
		assertNull("20 and 60 are out of range", result);
		
		result=SimpleCalc.subtract(0, 60);
		assertNull("0 and 60 are out of range", result);
		// TODO
	}

	@Test
	public void testMultiplyInRange() {
		int expected= 6;
		int result= SimpleCalc.multiply( 2, 3);		
		assertEquals("2*3 should be 6", expected, result);
		
		expected= -6;
		result= SimpleCalc.multiply( 2, -3);		
		assertEquals("2*3 should be 6", expected, result);
		
		
		expected= 0;
		result= SimpleCalc.multiply( 2, 0);		
		assertEquals("2 *0 should be 0", expected, result);
		
		
		
		
		// TODO
	}

	@Test
	public void testMultiplyOutOfRange() {
		Integer result=SimpleCalc.multiply(22, 11);
		assertNull("22 and 11 are out of range", result);
		
		 result=SimpleCalc.multiply(22, 0);
		assertNull("22 and 11 are out of range", result);
		
		
		result=SimpleCalc.multiply(22,-11);
		assertNull("22 and -11 are out of range", result);
		
		
		// TODO
	}

	@Test
	public void testDivideInRange() {
		
		int expected= 2;
		int result= SimpleCalc.divide(6,3);		
		assertEquals("6/2 should be 2", expected, result);
		// TODO
	}

	@Test
	public void testDivideOutOfRange() {
		Integer result=SimpleCalc.divide(22, 11);
		assertNull("22 and 11 are out of range", result);
		
		
		result=SimpleCalc.divide(-22, 11);
		assertNull("-22 and 11 are out of range", result);
		
		result=SimpleCalc.divide(-22, -1);
		assertNull("-22 and -1 are out of range", result);
		
		// TODO
	}

}
