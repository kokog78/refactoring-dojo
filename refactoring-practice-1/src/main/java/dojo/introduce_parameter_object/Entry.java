package dojo.introduce_parameter_object;

import java.util.Date;

public class Entry {

	private final Date chargeDate;
	private final double value;
	
	public Entry(Date chargeDate, double value) {
		super();
		this.chargeDate = chargeDate;
		this.value = value;
	}

	public Date getChargeDate() {
		return chargeDate;
	}

	public double getValue() {
		return value;
	}
	
}
