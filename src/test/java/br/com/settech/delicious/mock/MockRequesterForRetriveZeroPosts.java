package br.com.settech.delicious.mock;

import java.util.Collection;

import br.com.settech.delicious.DeliciousRequester;
import br.com.settech.delicious.METHOD;
import br.com.settech.delicious.attribute.Attribute;

public class MockRequesterForRetriveZeroPosts implements DeliciousRequester {

	public String request(Collection<Attribute> attributes, METHOD method) {
		// TODO Auto-generated method stub
		StringBuffer posts  = new StringBuffer();		
		posts.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?> <posts user=\"javaapi\""
				+ " update=\"2009-07-15T07:00:00Z\" tag=\"samba barra\"> </posts>");		
		return posts.toString();
	}

}
