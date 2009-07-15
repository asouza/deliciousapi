package br.com.settech.delicious;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpClientParams;

import br.com.settech.delicious.attribute.Attribute;

public class DefaultDeliciousRequester implements DeliciousRequester {

	private User user;
	private static final String API_URL = "https://api.del.icio.us/v1/";
	private HttpClient client;
	private UserAgent userAgent;

	public DefaultDeliciousRequester(User user, UserAgent userAgent) {
		this.user = user;
		client = new HttpClient();
		this.userAgent = userAgent;
		unknowCodeToConfigureClientToAccessDelicious();
		
	}

	public String request(Collection<Attribute> attributes, METHOD apiMethod) {
		// TODO Auto-generated method stub
		GetMethod get = new GetMethod(API_URL + apiMethod);						
		get.setDoAuthentication(true);
		Collection<NameValuePair> params = new ArrayList<NameValuePair>();
		for (Attribute attribute : attributes) {
			params
					.add(new NameValuePair(attribute.name(), attribute
							.toString()));
		}		
		StringBuffer input = new StringBuffer();
		get.setQueryString(params.toArray(new NameValuePair[] {}));		
		try {
			int status = client.executeMethod(get);			
			if (status == HttpStatus.SC_OK) {
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(get.getResponseBodyAsStream(),
								"UTF-8"));
				int c = 0;
				while ((c = bufferedReader.read()) != -1) {
					input.append((char)c);
				}
				return input.toString();
			} else {
				throw new DeliciousComunicationFailedException(
						"It was not possible send your request to delicious :(, the status code was "
								+ status);
			}
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			throw new DeliciousComunicationFailedException(e.getMessage(), e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new DeliciousComunicationFailedException(e.getMessage(), e);
		} finally {			
			get.releaseConnection();
		}		
	}

	/**
	 * Thanks for David A. Czarnecki. I have to find out what is that for
	 * 
	 * @param client
	 */
	private void unknowCodeToConfigureClientToAccessDelicious() {
		HttpClientParams clientParams = new HttpClientParams();
		DefaultHttpMethodRetryHandler defaultHttpMethodRetryHandler = new DefaultHttpMethodRetryHandler(
				0, false);
		clientParams.setParameter("User-Agent",userAgent);		
		clientParams.setParameter(HttpClientParams.RETRY_HANDLER,
				defaultHttpMethodRetryHandler);
		client.setParams(clientParams);
		client.getState().setCredentials(
				AuthScope.ANY,
				new UsernamePasswordCredentials(user.getLogin(), user
						.getPassword()));
	}

}
