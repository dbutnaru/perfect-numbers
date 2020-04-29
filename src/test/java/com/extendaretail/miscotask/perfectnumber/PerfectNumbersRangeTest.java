package com.extendaretail.miscotask.perfectnumber;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class PerfectNumbersRangeTest {

	@Test
	public void testRangeDoNotHasPerfectNumbers() {
		PerfectNumbersRange pnr = new PerfectNumbersRange(7l, 20l);
		
		pnr.calculatePerfectNumbers();
		
		List<Long> pnl = pnr.getPerfectNumbers();
		
		assertTrue(pnl.isEmpty());
	}

	@Test
	public void testRangeHasPerfectNumbers() {
		PerfectNumbersRange pnr = new PerfectNumbersRange(1l, 30l);
		
		pnr.calculatePerfectNumbers();
		
		List<Long> pnl = pnr.getPerfectNumbers();
		
		assertFalse(pnl.isEmpty());
		assertTrue(pnl.size() == 2);
	}
	
	@Test
	public void testRangeIsValid() {
		new PerfectNumbersRange(1l, 30l);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testRangeIsNotValid() {
		new PerfectNumbersRange(30l, 1l);
	}
	
	@Test
	public void testBigRangeHasPerfectNumbers() {
		PerfectNumbersRange pnr = new PerfectNumbersRange(1l, 10000l);
		
		pnr.calculatePerfectNumbers();
		
		List<Long> pnl = pnr.getPerfectNumbers();
		
		assertFalse(pnl.isEmpty());
		assertTrue(pnl.size() == 4);
	}
	
	@Ignore
	@Test
	public void testVeryBigRangeHasPerfectNumbers() {
		PerfectNumbersRange pnr = new PerfectNumbersRange(1l, 33550336l);
		
		pnr.calculatePerfectNumbers();
		
		List<Long> pnl = pnr.getPerfectNumbers();
		
		assertFalse(pnl.isEmpty());
		assertTrue(pnl.size() == 2);
	}
}
