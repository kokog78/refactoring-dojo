package dojo.replace_method_with_method_object;

public class DummyCalculator {

	/*
	 * Hozzunk létre egy Gamma osztályt, aminek a compute metódusa kiszámolja, amit kell.
	 */
	public int computeGamma(int inputVal, int quantity, int yearToDate) {
		int importantValue1 = (inputVal * quantity) + delta();
		int importantValue2 = (inputVal * yearToDate) + 100;
		if ((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}
		int importantValue3 = importantValue2 * 7;
		// etc
		return importantValue3 - 2 * importantValue1;
	}
	
	private int delta() {
		return 10;
	}
	
}
