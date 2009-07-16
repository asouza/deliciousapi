package br.com.settech.delicious;

import junit.framework.Assert;

import org.junit.Test;

import br.com.settech.delicious.attribute.Description;
import br.com.settech.delicious.attribute.HREF;
import br.com.settech.delicious.criteria.AllCriteria;
import br.com.settech.delicious.list.Posts;
import br.com.settech.delicious.mock.MockRequesterForRetrivePosts;
import br.com.settech.delicious.mock.MockRequesterForRetriveZeroPosts;
import br.com.settech.delicious.mock.MockRequesterForSuccessfulSave;
import br.com.settech.delicious.mock.MockRequesterForUnSuccessfulSave;

public class TestBookMark {
	
	private BookMark bookMark;	


	@Test
	public void testSuccessfulSave() {		
		bookMark = new BookMark(new MockRequesterForSuccessfulSave());		
		bookMark.save(Post.newPostWithNowTimeNotSharedAndNotReplaceable(new Description("dede"),new HREF("http://www.google.com.br")));
	}

	@Test(expected = WasNotPossibleUpdateBookMarkException.class)
	public void testFailedSave() {
		bookMark = new BookMark(new MockRequesterForUnSuccessfulSave());		
		bookMark.save(Post.newPostWithNowTimeNotSharedAndNotReplaceable(new Description("dede"),new HREF("http://www.google.com.br")));
	}

	@Test
	public void testBuildPostsFromAnyFetchMethod() {
		bookMark = new BookMark(new MockRequesterForRetrivePosts());
		Posts posts = bookMark.allPosts(new AllCriteria());
		Assert.assertEquals(2,posts.size());		
	}
	
	@Test
	public void testBuildPostsFromAnyFetchMethodWithZeroResults() {
		bookMark = new BookMark(new MockRequesterForRetriveZeroPosts());
		Posts posts = bookMark.allPosts(new AllCriteria());		
		Assert.assertEquals(0,posts.size());		
	}	
}
