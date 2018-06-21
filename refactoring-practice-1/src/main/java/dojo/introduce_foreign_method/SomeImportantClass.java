package dojo.introduce_foreign_method;

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
	 * Csináljunk hát egy nextDay(Date) metódust.
	 */
	public Date getEndDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		return calendar.getTime();
	}
	
}
