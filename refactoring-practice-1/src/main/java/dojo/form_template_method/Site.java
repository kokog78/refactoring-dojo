package dojo.form_template_method;

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
