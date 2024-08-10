package handlingException;

public class ThirdExample {

	public static void main(String[] args) throws ArithmeticException{
      int age = 15 ;
		
		if(age<18) {
			throw new ArithmeticException("below 18 voting not allowed");
			
		}
	}

}
