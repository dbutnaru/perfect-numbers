package com.extendaretail.miscotask.perfectnumber;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PerfectNumbersUtilityStyleServiceTest {
	
	private PerfectNumberService service;

	@Before
	public void up() {
		service = new PerfectNumbersUtilityStyleService();
	}

	@Test
	public void testIsPerfect() {
		assertTrue(service.isPerfect(6l));
	}

	@Test
	public void testIsNotPerfect() {
		assertFalse(service.isPerfect(7l));
	}
	
	@Test
	public void testRangeHasPerfectNumbers() {
		List<Long> pnl = service.perfectNumbersFromRange(1l, 30l);
		
		assertFalse(pnl.isEmpty());
		assertTrue(pnl.size() == 2);
	}
	
	@Test
	public void testBigRangeHasPerfectNumbers() {
		List<Long> pnl = service.perfectNumbersFromRange(1l, 10000l);
		
		assertFalse(pnl.isEmpty());
		assertTrue(pnl.size() == 4);
	}
}
