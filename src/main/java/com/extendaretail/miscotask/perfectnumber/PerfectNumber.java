package com.extendaretail.miscotask.perfectnumber;

public final class PerfectNumber {

	private final Long number;
	
	public PerfectNumber(Long number) {
		this.number = number;
	}

	public boolean isPerfect() {
		if(number.equals(sumOfDivisors())) {
			return true;
		}
		else {
			return false;
		}
	}

	private Long sumOfDivisors() {
		Long sum = 0l;
		for(Long i = 1l; i < number.longValue(); i++) {
			if(number.longValue() % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
