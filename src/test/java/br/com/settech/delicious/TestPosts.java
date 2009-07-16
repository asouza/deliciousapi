package br.com.settech.delicious;

import org.junit.Test;

import junit.framework.Assert;
import br.com.settech.delicious.attribute.Description;
import br.com.settech.delicious.attribute.HREF;
import br.com.settech.delicious.list.Posts;

public class TestPosts {

	@Test
	public void testKeepListOfPostsWhenTryToCreateANewListIfWouldNotHaveAnyPosts(){
		Posts posts = new Posts();
		posts.add(Post.newPostWithNowTimeNotSharedAndNotReplaceable(new Description("tret"),new HREF("fsdhfd")));
		Assert.assertEquals(1,posts.createEmptyListOfPostsIfThereArentPosts().size());
	}
}
