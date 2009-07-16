package br.com.settech.delicious.inaction;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.settech.delicious.BookMark;
import br.com.settech.delicious.DefaultDeliciousRequester;
import br.com.settech.delicious.Post;
import br.com.settech.delicious.User;
import br.com.settech.delicious.UserAgent;
import br.com.settech.delicious.attribute.Description;
import br.com.settech.delicious.attribute.HREF;
import br.com.settech.delicious.attribute.Replace;
import br.com.settech.delicious.attribute.Tag;
import br.com.settech.delicious.criteria.AllCriteria;

/**
 * i was trying to remove this class from test goal, but i couldn't... so it has
 * a nothing method to pass by maven test and you can run the main method
 * @author asouza
 *
 */
public class AbstractBookMarkInAction {

	private static BookMark bookMark;

	@Test
	public void testSave() {
		Post post = Post.newPostWithNowTimeNotSharedAndNotReplaceable(
				new Description("inaction!!"), new HREF(
						"http://www.terra.com.br")).withReplace(new Replace(true));
		bookMark.save(post);
	}

	@Test
	public void testFetch() {
		System.out.println(bookMark.allPosts(new AllCriteria().withTag(new Tag("pituba forro"))));
	}
	
	@BeforeClass
	public static void before() {		
		bookMark = new BookMark(new DefaultDeliciousRequester(new User(
				"#login", "#password"), UserAgent.newDefault()));
	}
}
