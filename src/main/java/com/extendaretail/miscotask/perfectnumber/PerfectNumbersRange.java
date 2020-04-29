package com.extendaretail.miscotask.perfectnumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PerfectNumbersRange {
	private List<Long> perfectNumbers;
	private final Long start;
	private final Long end;

	public PerfectNumbersRange(Long start, Long end) {
		this.start = start;
		this.end = end;
		validateRange();
	}

	public void calculatePerfectNumbers() {
		if(perfectNumbers == null) {
			perfectNumbers = new ArrayList<>();
			executeCalculation();
		}
	}

	public List<Long> getPerfectNumbers() {
		return Collections.unmodifiableList(perfectNumbers);
	}

	private void executeCalculation() {
		for(Long i = start; i.compareTo(end) < 0; i++) {
			PerfectNumber currentI = new PerfectNumber(i);
			if(currentI.isPerfect()) {
				perfectNumbers.add(i);
			}
		}
	}
	
	private void validateRange() {
		if(start.compareTo(end) > 0) {
			throw new IllegalArgumentException("Invalid range. Start is bigger than end.");
		}
		
	}

}
