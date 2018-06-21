package dojo.form_template_method;

public class ResidentalSite extends Site {

	public ResidentalSite(int units, double rate) {
		super(units, rate);
	}

	public double getBillableAmount() {
		double base = getUnits() * getRate();
		double tax = base * TAX_RATE;
		return base + tax;
	}
	
}
