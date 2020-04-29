package com.extendaretail.miscotask.perfectnumber;

import java.util.List;

public class PerfectNumbersImmutableObjectsService implements PerfectNumberService {

	@Override
	public boolean isPerfect(Long number) {
		return new PerfectNumber(number).isPerfect();
	}

	@Override
	public List<Long> perfectNumbersFromRange(Long start, Long end) {
		PerfectNumbersRange pnr = new PerfectNumbersRange(start, end);
		pnr.calculatePerfectNumbers();
		return pnr.getPerfectNumbers();
	}

}
