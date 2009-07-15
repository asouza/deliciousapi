package br.com.settech.delicious.attribute;

import br.com.settech.delicious.InvalidPostException;

public class Description implements Attribute{

	private String description;

	public Description(String description) {		
		this.description = description;
		if(description==null || description.trim().equals("")){
			throw new InvalidPostException("Description can't be null or empty");
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return description==null?"":description;
	}

	public String name() {
		// TODO Auto-generated method stub
		return "description";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
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
		Description other = (Description) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}
	
	
}
