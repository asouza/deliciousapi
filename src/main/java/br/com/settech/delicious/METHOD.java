package br.com.settech.delicious;

public enum METHOD {
	SAVE{

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "posts/add";
		}
		
	},
	ALL{

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "posts/all";
		}
		
	},

	GET{

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "posts/get";
		}
		
	}
}
