package br.com.settech.delicious.attribute;

public class Tag implements Attribute{

	private String tag;

	public Tag(String tag) {
		super();
		this.tag = tag;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tag==null?"":tag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
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
		Tag other = (Tag) obj;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		return true;
	}

	public String name() {
		// TODO Auto-generated method stub
		return "tag";
	}
	
	
	
	
}
