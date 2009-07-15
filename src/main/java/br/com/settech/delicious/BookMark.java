package br.com.settech.delicious;

import br.com.settech.delicious.attribute.Description;
import br.com.settech.delicious.attribute.Extended;
import br.com.settech.delicious.attribute.HASH;
import br.com.settech.delicious.attribute.HREF;
import br.com.settech.delicious.attribute.Meta;
import br.com.settech.delicious.attribute.Tag;
import br.com.settech.delicious.criteria.AllCriteria;
import br.com.settech.delicious.list.Posts;
import br.com.settech.delicious.xstream.SimpleStringAttributeConverter;
import br.com.settech.delicious.xstream.TimeConverter;

import com.thoughtworks.xstream.XStream;

public class BookMark {

	private DeliciousRequester deliciousRequester;	

	public BookMark(DeliciousRequester deliciousRequester) {
		this.deliciousRequester = deliciousRequester;		
	}

	
	public Post save(Post post) {
		// TODO Auto-generated method stub				
		String result = deliciousRequester
				.request(post.attributes(),METHOD.SAVE);		
		XStream stream = new XStream();				
		stream.alias("result",UpdateResult.class);
		stream.useAttributeFor(UpdateResult.class,"code");		
		stream.aliasField("code",UpdateResult.class,"code"); 		
		UpdateResult saveResult = (UpdateResult) stream.fromXML(result);
		saveResult.isOk();
		return post;
	}


	public Posts allPosts(AllCriteria allCriteria) {
		// TODO Auto-generated method stub
		String result = deliciousRequester.request(allCriteria.attributes(),METHOD.ALL);
		XStream stream = configureXStreamForReadPosts();
		Posts posts = (Posts)stream.fromXML(result);
		return posts;
		
	}


	private XStream configureXStreamForReadPosts() {
		XStream stream = new XStream();
		stream.alias("posts", Posts.class);
		stream.alias("post", Post.class);
		stream.addImplicitCollection(Posts.class,"posts");		
		stream.useAttributeFor(Posts.class,"update");
		stream.useAttributeFor(Posts.class,"tag");
		stream.useAttributeFor(Post.class,"href");
		stream.useAttributeFor(Post.class,"hash");
		stream.useAttributeFor(Post.class,"description");
		stream.useAttributeFor(Post.class,"tag");
		stream.useAttributeFor(Post.class,"time");
		stream.useAttributeFor(Post.class,"extended");
		stream.useAttributeFor(Post.class,"meta");
		stream.registerLocalConverter(Posts.class,"update",new TimeConverter());
		stream.registerLocalConverter(Posts.class,"tag",new SimpleStringAttributeConverter(Tag.class));
		stream.registerLocalConverter(Post.class,"href",new SimpleStringAttributeConverter(HREF.class));
		stream.registerLocalConverter(Post.class,"hash",new SimpleStringAttributeConverter(HASH.class));
		stream.registerLocalConverter(Post.class,"description",new SimpleStringAttributeConverter(Description.class));
		stream.registerLocalConverter(Post.class,"tag",new SimpleStringAttributeConverter(Tag.class));
		stream.registerLocalConverter(Post.class,"time",new TimeConverter());
		stream.registerLocalConverter(Post.class,"extended",new SimpleStringAttributeConverter(Extended.class));
		stream.registerLocalConverter(Post.class,"meta",new SimpleStringAttributeConverter(Meta.class));
		return stream;
	}


	

}
