package br.com.settech.delicious;

import org.junit.Test;

import junit.framework.Assert;
import br.com.settech.delicious.attribute.Time;

public class TestAttributes {

	@Test
	public void testEqualsTime(){
		Time time = new Time().withSecondOfMinute(10).withMinuteOfHour(10);
		Time time2 = new Time().withSecondOfMinute(10).withMinuteOfHour(10);
		Assert.assertTrue(time.equals(time2));
	}
}
