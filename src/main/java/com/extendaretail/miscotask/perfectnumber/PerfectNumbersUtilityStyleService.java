package com.extendaretail.miscotask.perfectnumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerfectNumbersUtilityStyleService implements PerfectNumberService {

	@Override
	public boolean isPerfect(Long number) {
		if(number.equals(sumOfDivisors(number))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<Long> perfectNumbersFromRange(Long start, Long end) {
		List<Long> perfectNumbers = new ArrayList<>();
		for(Long i = start; i.compareTo(end) < 0; i++) {
			if(isPerfect(i)) {
				perfectNumbers.add(i);
			}
		}
		return Collections.unmodifiableList(perfectNumbers);
	}

	private Long sumOfDivisors(Long number) {
		Long sum = 0l;
		for(Long i = 1l; i < number.longValue(); i++) {
			if(number.longValue() % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
