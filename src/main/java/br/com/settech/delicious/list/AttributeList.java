package br.com.settech.delicious.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import br.com.settech.delicious.attribute.Attribute;

public class AttributeList implements Collection<Attribute> {

	private List<Attribute> list;

	public AttributeList() {

		list = new ArrayList<Attribute>();
	}
	

	public AttributeList(Attribute... attributes){
		this();
		for(Attribute attribute : attributes){
			add(attribute);
		}
	}

	/**
	 * just add attribute if o.toString().equals("") is false
	 */
	public boolean add(Attribute o) {
		if (o != null && o.toString() != null && !"".equals(o.toString())) {
			return list.add(o);
		}
		return false;
	}

	public void add(int index, Attribute element) {
		list.add(index, element);
	}

	public boolean addAll(Collection<? extends Attribute> c) {
		return list.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends Attribute> c) {
		return list.addAll(index, c);
	}

	public void clear() {
		list.clear();
	}

	public boolean contains(Object o) {
		return list.contains(o);
	}

	public boolean containsAll(Collection<?> c) {
		return list.containsAll(c);
	}

	public boolean equals(Object o) {
		return list.equals(o);
	}

	public Attribute get(int index) {
		return list.get(index);
	}

	public int hashCode() {
		return list.hashCode();
	}

	public int indexOf(Object o) {
		return list.indexOf(o);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public Iterator<Attribute> iterator() {
		return list.iterator();
	}

	public int lastIndexOf(Object o) {
		return list.lastIndexOf(o);
	}

	public ListIterator<Attribute> listIterator() {
		return list.listIterator();
	}

	public ListIterator<Attribute> listIterator(int index) {
		return list.listIterator(index);
	}

	public Attribute remove(int index) {
		return list.remove(index);
	}

	public boolean remove(Object o) {
		return list.remove(o);
	}

	public boolean removeAll(Collection<?> c) {
		return list.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return list.retainAll(c);
	}

	public Attribute set(int index, Attribute element) {
		return list.set(index, element);
	}

	public int size() {
		return list.size();
	}

	public List<Attribute> subList(int fromIndex, int toIndex) {
		return list.subList(fromIndex, toIndex);
	}

	public Object[] toArray() {
		return list.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return list.toArray(a);
	}

}
