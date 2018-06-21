package dojo.form_template_method;

/*
 * A leszármazott osztályok getBillableAmount metódusai nagyon hasonló dolgot csinálnak.
 * Készítsünk a számukra itt egy sablonfüggvényt, ami két absztrakt függvényt hív meg:
 * getBaseAmount és getTaxAmount!
 */
public abstract class Site {

	final static double TAX_RATE = 0.27;
	
	private final int units;
	private final double rate;
	
	public Site(int units, double rate) {
		super();
		this.units = units;
		this.rate = rate;
	}
	
	public int getUnits() {
		return units;
	}
	
	public double getRate() {
		return rate;
	}
	
}
