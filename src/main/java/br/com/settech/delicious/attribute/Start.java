package br.com.settech.delicious.attribute;

public class Start implements Attribute {
	
	private Integer start;
	
	

	public Start(Integer start) {
		super();
		this.start = start;
	}
	
	



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return start==null?"":start.toString();
	}





	public String name() {
		// TODO Auto-generated method stub
		return "start";
	}

}
