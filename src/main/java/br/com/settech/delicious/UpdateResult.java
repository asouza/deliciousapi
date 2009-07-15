package br.com.settech.delicious;

public class UpdateResult {

	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void isOk() {
		if (!"done".equals(code)) {
			throw new WasNotPossibleUpdateBookMarkException(code);
		}
	}
}
