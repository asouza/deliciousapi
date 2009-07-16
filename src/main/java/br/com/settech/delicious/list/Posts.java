package br.com.settech.delicious.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

import br.com.settech.delicious.Post;
import br.com.settech.delicious.attribute.Tag;
import br.com.settech.delicious.attribute.Time;

public class Posts implements Collection<Post>{

	private LinkedHashSet<Post> posts;
	private Time update;
	private Tag tag;

	public Posts() {
		super();		
		posts = new LinkedHashSet<Post>();
		tag = new Tag("");		
		update = new Time();
	}
	

	

	public Posts(Time dt, Tag tag) {
		this();
		this.update = dt;
		this.tag = tag;
	}




	public Time getUpdate() {
		return update;
	}




	public Tag getTag() {
		return tag;
	}




	public boolean add(Post o) {
		return posts.add(o);
	}

	public boolean addAll(Collection<? extends Post> c) {
		return posts.addAll(c);
	}

	public void clear() {
		posts.clear();
	}

	public boolean contains(Object o) {
		return posts.contains(o);
	}

	public boolean containsAll(Collection<?> c) {
		return posts.containsAll(c);
	}

	public boolean equals(Object o) {
		return posts.equals(o);
	}

	public int hashCode() {
		return posts.hashCode();
	}

	public boolean isEmpty() {
		return posts.isEmpty();
	}

	public Iterator<Post> iterator() {
		return posts.iterator();
	}

	public boolean remove(Object o) {
		return posts.remove(o);
	}

	public boolean removeAll(Collection<?> c) {
		return posts.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return posts.retainAll(c);
	}

	public int size() {
		return posts.size();
	}

	public Object[] toArray() {
		return posts.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return posts.toArray(a);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return posts.toString();
	}
	
	
	public Posts createEmptyListOfPostsIfThereArentPosts(){
		if(posts==null){
			posts = new LinkedHashSet<Post>();
		}
		return this;
	}
}
