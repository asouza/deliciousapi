package br.com.settech.delicious;

import java.util.Collection;

import br.com.settech.delicious.attribute.Attribute;

public interface DeliciousRequester {

	/**
	 * execute a request to delicious
	 * @param attributes
	 * @return
	 */	
	String request(Collection<Attribute> attributes,METHOD method);
	
}
