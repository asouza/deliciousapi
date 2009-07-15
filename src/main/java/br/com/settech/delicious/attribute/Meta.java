package br.com.settech.delicious.attribute;

public class Meta implements Attribute{

	private String meta;

	public Meta(String meta) {
		super();
		this.meta = meta;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return meta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((meta == null) ? 0 : meta.hashCode());
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
		Meta other = (Meta) obj;
		if (meta == null) {
			if (other.meta != null)
				return false;
		} else if (!meta.equals(other.meta))
			return false;
		return true;
	}

	public String name() {
		// TODO Auto-generated method stub
		return "meta";
	}
	
	
}
