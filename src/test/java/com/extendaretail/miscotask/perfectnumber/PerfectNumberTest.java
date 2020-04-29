package com.extendaretail.miscotask.perfectnumber;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class PerfectNumberTest {

	@Test
	public void testIsNotPerfect() {
		PerfectNumber three = new PerfectNumber(3l);
		
		assertFalse(three.isPerfect());
		
		PerfectNumber fifteen = new PerfectNumber(15l);
		
		assertFalse(fifteen.isPerfect());
	}

	@Test
	public void testIsPerfect() {
		PerfectNumber six = new PerfectNumber(6l);
		
		assertTrue(six.isPerfect());
		
		PerfectNumber twentyEight = new PerfectNumber(28l);
		
		assertTrue(twentyEight.isPerfect());
	}

	@Test
	public void testIsPerfectVeryBigNumber() {
		PerfectNumber veryBigNumber = new PerfectNumber(33550336l);
		assertTrue(veryBigNumber.isPerfect());
	}
	
	/* tooks around 3 mins on my env.*/
	@Ignore
	@Test
	public void testIsPerfectVeryVeryBigNumber() {
		PerfectNumber veryBigNumber = new PerfectNumber(8589869056l);
		assertTrue(veryBigNumber.isPerfect());
	}
}
