
public class reverseCharacter {

	public static void main(String[] args) {

		
		String str="pallavi prasad sawant";
		
		String words[] = str.split(" ");
		String reverseString="";
		
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			String reverseWord= "";
			for(int j=word.length()-1; j>=0; j--) {
				reverseWord=reverseWord+word.charAt(j);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);
		
	}

}
