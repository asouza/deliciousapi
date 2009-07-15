package br.com.settech.delicious;

import java.util.Collection;

import br.com.settech.delicious.attribute.Attribute;
import br.com.settech.delicious.attribute.Description;
import br.com.settech.delicious.attribute.Extended;
import br.com.settech.delicious.attribute.HASH;
import br.com.settech.delicious.attribute.HREF;
import br.com.settech.delicious.attribute.Meta;
import br.com.settech.delicious.attribute.Replace;
import br.com.settech.delicious.attribute.Shared;
import br.com.settech.delicious.attribute.Tag;
import br.com.settech.delicious.attribute.Time;
import br.com.settech.delicious.list.AttributeList;

public class Post {

	private HREF href;
	private HASH hash;
	private Description description;
	private Tag tag;
	private Time time;
	private Extended extended;
	private Meta meta;
	private Replace replace;
	private Shared shared;	

	private Post() {			
	}

	
	/**
	 * 
	 * 
	 * @param description
	 * @param link
	 * @return
	 */
	public static Post newPostWithNowTimeNotSharedAndNotReplaceable(Description description, HREF link) {
		return new Post().withDescription(description).withLink(link).withTime(
				new Time()).withReplace(new Replace(false)).withShared(
				new Shared(false)).withTag(new Tag(""));
	}

	public HREF getHREF() {
		return href;
	}

	public HASH getHash() {
		return hash;
	}

	public Description getDescription() {
		return description;
	}

	public Tag getTag() {
		return tag;
	}

	public Time getTime() {
		return time;
	}

	public Extended getExtended() {
		return extended;
	}

	public Meta getMeta() {
		return meta;
	}

	public Post withReplace(Replace replace) {
		this.replace = replace;		
		return this;
	}

	public Post withShared(Shared shared) {
		this.shared = shared;		
		return this;
	}

	public Post withLink(HREF link) {			
		this.href = new HREF(link.toString());
		return this;
	}


	public Object withHash(HASH hash) {
		this.hash = hash;		
		return this;
	}

	public Post withDescription(Description description) {			
		this.description = new Description(description.toString());
		return this;
	}

	public Post withTag(Tag tag) {
		this.tag = tag;
		return this;
	}


	public Post withTime(Time time) {
		this.time = time;		
		return this;
	}

	public Post withExtended(Extended extended) {
		this.extended = extended;		
		return this;
	}

	public Object withMeta(Meta meta) {
		this.meta = meta;		
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((meta == null) ? 0 : meta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (meta == null) {
			if (other.meta != null)
				return false;
		} else if (!meta.equals(other.meta))
			return false;
		return true;
	}

	public String formattedTime() {
		// TODO Auto-generated method stub
		return time.toString();
	}

	public Collection<Attribute> attributes() {
		Collection<Attribute> attributes = new AttributeList();
		attributes.add(description);		
		attributes.add(href);		
		attributes.add(extended);
		attributes.add(replace);
		attributes.add(shared);
		attributes.add(tag);
		attributes.add(time);		
		// TODO Auto-generated method stub		
		return attributes;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return description+";"+tag+";"+time+";"+extended+";"+meta;
	}

	
	

}
