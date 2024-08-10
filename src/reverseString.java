import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {

		String input= "Pallavi Prasad Sawant";
		
	//	char a[]= input.toCharArray();
		
		
		String a[] = input.split("");
		
		//for(int i= a.length-1; i>=0; i-- )
		for(int i= 0; i<a.length; i++ )
		{	
			System.out.print(a[i] +" ");
	}

}
}