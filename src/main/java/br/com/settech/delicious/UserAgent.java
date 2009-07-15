package br.com.settech.delicious;

/**
 * User-Agent that should be use for communicate with delicious
 * @author asouza
 *
 */
public class UserAgent {

	private String userAgent;

	public UserAgent(String userAgent) {
		super();
		this.userAgent = userAgent;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return userAgent.toString();
	}

	public static UserAgent newDefault() {
		// TODO Auto-generated method stub
		return new UserAgent("del.icio.us Java/1.14");
	}
	
	
}
