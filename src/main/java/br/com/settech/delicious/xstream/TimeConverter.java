package br.com.settech.delicious.xstream;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import br.com.settech.delicious.attribute.Time;

import com.thoughtworks.xstream.converters.SingleValueConverter;

public class TimeConverter implements SingleValueConverter {

	public Object fromString(String strTime) {
		DateTime dateTime = DateTimeFormat.forPattern(Time.DATE_PATTERN).parseDateTime(strTime);
		// TODO Auto-generated method stub
		return new Time(dateTime);
	}

	public String toString(Object obj) {
		// TODO Auto-generated method stub
		return ((Time)obj).toString();
	}

	public boolean canConvert(Class type) {
		// TODO Auto-generated method stub
		return type.equals(Time.class);
	}

}
