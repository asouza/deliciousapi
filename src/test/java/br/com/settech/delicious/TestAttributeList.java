package br.com.settech.delicious;

import org.junit.Test;

import br.com.settech.delicious.attribute.Attribute;
import br.com.settech.delicious.attribute.Tag;
import br.com.settech.delicious.list.AttributeList;

import junit.framework.Assert;


public class TestAttributeList {
	
	@Test
	public void testDoNotAddIfNull(){
		AttributeList list = new AttributeList();
		Assert.assertEquals(false,list.add(null));
		
	}
	
	@Test
	public void testDoNotAddIfToStringIsNull(){
		AttributeList list = new AttributeList();
		Assert.assertEquals(false,list.add(new Attribute(){

			public String name() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return null;
			}
			
			
			
		}));
		
	}
	
	@Test
	public void testDoNotAddIfToStringIsEmpty(){
		AttributeList list = new AttributeList();
		Assert.assertEquals(false,list.add(new Attribute(){

			public String name() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "";
			}
			
			
			
		}));
		
	}	
	
	@Test
	public void testNewWithBadAttributesArguments(){
		AttributeList attributeList = new AttributeList(new Tag(""),new Tag(""),null);
		Assert.assertEquals(0,attributeList.size());
	}
	
	@Test
	public void testNewWithGoodAttributesArguments(){
		AttributeList attributeList = new AttributeList(new Tag("google"),new Tag("search"));
		Assert.assertEquals(2,attributeList.size());
	}	
}
