package br.com.settech.delicious.attribute;

public class Results implements Attribute {
	
	private Integer results;
	
	

	public Results(Integer results) {
		super();
		this.results = results;
	}
	
	



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return results==null?"":results.toString();
	}





	public String name() {
		// TODO Auto-generated method stub
		return "results";
	}

}
