package br.com.settech.delicious.attribute;

public class Extended implements Attribute{

	private String extended;

	public Extended(String extended) {
		this.extended = extended;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return extended==null?"":extended;
	}

	public String name() {
		// TODO Auto-generated method stub
		return "extended";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((extended == null) ? 0 : extended.hashCode());
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
		Extended other = (Extended) obj;
		if (extended == null) {
			if (other.extended != null)
				return false;
		} else if (!extended.equals(other.extended))
			return false;
		return true;
	}
	
	
	
}
