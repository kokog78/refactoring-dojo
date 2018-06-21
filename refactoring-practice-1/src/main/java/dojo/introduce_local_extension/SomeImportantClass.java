package dojo.introduce_local_extension;

import java.util.Calendar;
import java.util.Date;

public class SomeImportantClass {

	private final Date startDate;
	
	public SomeImportantClass(Date startDate) {
		super();
		this.startDate = startDate;
	}

	/*
	 * Jó lenne, ha lenne egy Date.nextDay metódus, mert akkor csak azt kellene hívnunk.
	 * Csináljunk hát egy AdvancedDate osztályt, ami a date-ből származik, és van nextDay metódusa!
	 */
	public Date getEndDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		return calendar.getTime();
	}
	
}
