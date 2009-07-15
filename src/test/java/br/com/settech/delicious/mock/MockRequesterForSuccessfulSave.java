package br.com.settech.delicious.mock;

import java.util.Collection;

import br.com.settech.delicious.DeliciousRequester;
import br.com.settech.delicious.METHOD;
import br.com.settech.delicious.attribute.Attribute;

public class MockRequesterForSuccessfulSave implements DeliciousRequester{

	public String request(Collection<Attribute> attributes, METHOD method) {
		// TODO Auto-generated method stub
		return "<result code=\"done\"/>";
	}

}
