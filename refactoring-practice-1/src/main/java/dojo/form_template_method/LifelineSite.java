package dojo.form_template_method;

public class LifelineSite extends Site {

	public LifelineSite(int units, double rate) {
		super(units, rate);
	}
	
	public double getBillableAmount() {
		double base = getUnits() * getRate() * 0.5;
		double tax = base * TAX_RATE * 1.2;
		return base + tax;
	}

}
