package com.extendaretail.miscotask.perfectnumber;

import java.util.List;

public interface PerfectNumberService {
	boolean isPerfect(Long number);
	List<Long> perfectNumbersFromRange(Long start, Long end);
}
