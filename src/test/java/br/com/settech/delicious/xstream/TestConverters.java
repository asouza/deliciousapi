package br.com.settech.delicious.xstream;

import junit.framework.Assert;

import org.junit.Test;

import br.com.settech.delicious.attribute.Tag;
import br.com.settech.delicious.attribute.Time;

public class TestConverters {

	@Test
	public void testTimeConverter(){
		TimeConverter timeConverter = new TimeConverter();
		Time time = (Time)timeConverter.fromString("2009-07-15T07:00:00Z");
		Assert.assertEquals("2009-07-15T07:00:00Z",time.toString());
	}
	
	@Test
	public void testSimpleStringConverter(){
		SimpleStringAttributeConverter attributeConverter = new SimpleStringAttributeConverter(Tag.class);
		Tag tag = (Tag)attributeConverter.fromString("test test1");
		Assert.assertEquals("test test1", tag.toString());
	}
}
