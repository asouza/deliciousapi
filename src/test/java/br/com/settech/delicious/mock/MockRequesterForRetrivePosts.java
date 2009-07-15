package br.com.settech.delicious.mock;

import java.util.Collection;

import br.com.settech.delicious.DeliciousRequester;
import br.com.settech.delicious.METHOD;
import br.com.settech.delicious.attribute.Attribute;

public class MockRequesterForRetrivePosts implements DeliciousRequester {

	public String request(Collection<Attribute> attributes, METHOD method) {
		// TODO Auto-generated method stub
		StringBuffer posts  = new StringBuffer();		
		posts.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?> <posts user=\"javaapi\""
				+ " update=\"2009-07-15T07:00:00Z\" tag=\"\"> <post" 
				+ " href=\"http://www.google.com.br/\""
				+ " hash=\"8c1b3d0d9aa953d047cb4e271feea67e\""
				+ " description=\"best search engine\" tag=\"google search\""
				+ " time=\"2009-07-15T09:28:15Z\" extended=\"\" meta=\"aa5c6b92dc506b99ed8921d999d66e55\"/>");
		posts.append(" <post"
				+ " href=\"http://www.google.com.br/\""
				+ " hash=\"8c1b3d0d9aa953d047cb4e271feea67e\""
				+ " description=\"best search engine\" tag=\"google search\""
				+ " time=\"2009-07-15T09:28:15Z\" extended=\"\" meta=\"aa5c6b92dc506b99ed8921d999d66e5544\"/> </posts>");		
		return posts.toString();
	}

}
