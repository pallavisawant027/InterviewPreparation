package handlingException;

public class SecondExample {

	public static void main(String[] args) {
     try{
    	 
    	 int num = Integer.parseInt("pallavi");
    	 
    	// int num = 10;
     
     System.out.println(num);
	}
     
     
     
     
     catch(ArithmeticException e)
 	{
 		System.out.println(e.getMessage());
 	
 	}
     catch(NullPointerException e)
 	{
 		System.out.println(e.getMessage());
 	
 	}
	catch(NumberFormatException e)
	{
		System.out.println(e.getMessage());
	
	}
     finally{
 		
 		System.out.println("pallavi");
 	}

}
}