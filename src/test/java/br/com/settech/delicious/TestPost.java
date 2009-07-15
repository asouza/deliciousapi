package br.com.settech.delicious;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.settech.delicious.attribute.Description;
import br.com.settech.delicious.attribute.Extended;
import br.com.settech.delicious.attribute.HREF;
import br.com.settech.delicious.attribute.Tag;
import br.com.settech.delicious.attribute.Time;

public class TestPost {

	private Post post;

	@Before
	public void before() {
		post = Post.newPostWithNowTimeNotSharedAndNotReplaceable(new Description("Meridiano Restaurante Conceito"),
				new HREF("http://www.noitesalvador.com.br/maridiano"));
	}

	@Test(expected = NullPointerException.class)
	public void testThrowsInvalidPostExceptionIfLinkIsNull() {
		post.withLink(null);
	}

	@Test(expected = NullPointerException.class)
	public void testThrowsInvalidPostExceptionIfDescriptionIsNull() {
		post.withDescription(null);
	}

	@Test
	public void testFormattedTime() {
		post.withTime(new Time().withDayOfMonth(10).withHourOfDay(10)
				.withMinuteOfHour(10).withMonthOfYear(10).withHourOfDay(10)
				.withYear(2009).withSecondOfMinute(10));
		Assert.assertEquals("2009-10-10T10:10:10Z", post.formattedTime());
	}

	@Test
	public void testNumberOfAttributes() {
		post.withExtended(new Extended("ex")).withTag(new Tag("google"));
		Assert.assertEquals(7, post.attributes().size());
	}
	


	
	
}
