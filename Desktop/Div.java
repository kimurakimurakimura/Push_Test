package kadai3;

public class Div {
	 
	public int div(int a) {
		
		int result;
		
		if (a != 0) {
			
			result = 3 / a;
			return result;
			
		}else {
			
		throw new IllegalArgumentException("0で割らないで");
		}
		
		
	}
}


