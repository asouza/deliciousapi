package br.com.settech.delicious.attribute;

public class Replace implements Attribute{

	private boolean replace;

	public Replace(boolean replace) {
		super();
		this.replace = replace;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return replace?"yes":"no";
	}


	public String name() {
		// TODO Auto-generated method stub
		return "replace";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (replace ? 1231 : 1237);
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
		Replace other = (Replace) obj;
		if (replace != other.replace)
			return false;
		return true;
	}
	
	
	
	
	
}
