package handlingException;

public class ExceptionCustom {
	
	
	private static void ValidateAge(int age) throws AgelimitException {
		
		if(age<0) {
			
			throw new AgelimitException("Invalid age");	 
		
		
		}
		
		
	}

	public static void main(String[] args) throws AgelimitException {
		ValidateAge(-2);
	}

}
