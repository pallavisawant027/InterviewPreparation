import java.util.Scanner;

public class PracticeEx1 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = input.nextLine();
		
		System.out.println("value of string:" +s);
		
		for (int i =0; i>s.length(); i++)
		{
			
			System.out.println(i);
			
		}
		
		
	}

}
