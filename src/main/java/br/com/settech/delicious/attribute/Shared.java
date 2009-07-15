package br.com.settech.delicious.attribute;

public class Shared implements Attribute{

	private boolean shared;

	public Shared(boolean shared) {
		super();
		this.shared = shared;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return shared?"yes":"no";
	}


	public String name() {
		// TODO Auto-generated method stub
		return "shared";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (shared ? 1231 : 1237);
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
		Shared other = (Shared) obj;
		if (shared != other.shared)
			return false;
		return true;
	}
	
	
}
