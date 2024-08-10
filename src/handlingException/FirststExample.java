package handlingException;

public class FirststExample {

	public static void main(String[] args) {
		
		try {
             String s=null;
             
             System.out.println(s.length());}
		
		catch(NullPointerException e)
		{
		System.out.println("null string cant given length");	
		}
	}

}
