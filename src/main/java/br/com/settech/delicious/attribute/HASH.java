package br.com.settech.delicious.attribute;

public class HASH implements Attribute{

	private String hash;

	public HASH(String hash) {
		super();
		this.hash = hash;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hash;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hash == null) ? 0 : hash.hashCode());
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
		HASH other = (HASH) obj;
		if (hash == null) {
			if (other.hash != null)
				return false;
		} else if (!hash.equals(other.hash))
			return false;
		return true;
	}

	public String name() {
		// TODO Auto-generated method stub
		return "hashes";
	}
	
	
	
	
}
