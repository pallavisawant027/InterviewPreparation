
public class countCharacters {

	public static void main(String[] args) {

		
		String name = "testing is my hobby";
		
		int length = name.length();
		
		
		int removeChar = name.replace("i", "").length();
		
		
		
	int	count=length -removeChar;
		
		System.out.println(count);
	}

}
