package br.com.settech.delicious.attribute;

import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import org.joda.time.format.DateTimeFormat;

public class Time implements Attribute{

	public static final String DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";
	private DateTime time;
	
	
	/**
	 * New time with now
	 */
	public Time() {
		this(new DateTime());
		// TODO Auto-generated constructor stub
	}

	public Time(DateTime dateTime) {
		super();
		this.time = dateTime;
	}

	public Time withDayOfMonth(int arg0) {
		time = time.withDayOfMonth(arg0);
		return this;
	}

	public Time withHourOfDay(int arg0) {
		time = time.withHourOfDay(arg0);
		return this;
	}

	public Time withMinuteOfHour(int arg0) {
		time = time.withMinuteOfHour(arg0);
		return this;		
	}

	public Time withMonthOfYear(int arg0) {
		time = time.withMonthOfYear(arg0);
		return this;
	}

	public Time withSecondOfMinute(int arg0) {
		time = time.withSecondOfMinute(arg0);
		return this;
	}

	public Time withYear(int arg0) {
		time = time.withYear(arg0);
		return this;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub		
		return time.toString(DateTimeFormat.forPattern(Time.DATE_PATTERN));
	}

	public String name() {
		// TODO Auto-generated method stub
		return "dt";
	}

	@Override
	public int hashCode() {		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((time == null) ? 0 : time.toString().hashCode());
		return result;
	}

	/**
	 * compare just the dates
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;		
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (DateTimeComparator.getDateOnlyInstance().compare(time,other.time)!=0)
			return false;
		return true;
	}


	
	
	
	
}
