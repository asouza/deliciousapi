package br.com.settech.delicious.attribute;

import br.com.settech.delicious.InvalidPostException;

public class HREF implements Attribute{

	private String href;

	public HREF(String href) {
		super();
		this.href = href;
		if(href==null || href.trim().equals("")){
			throw new InvalidPostException("HREF can't be null or empty");
		}		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return href;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((href == null) ? 0 : href.hashCode());
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
		HREF other = (HREF) obj;
		if (href == null) {
			if (other.href != null)
				return false;
		} else if (!href.equals(other.href))
			return false;
		return true;
	}

	public String name() {
		// TODO Auto-generated method stub
		return "url";
	}
	
	
	
}
