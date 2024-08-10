
public class javacomparison {

	public static void main(String[] args) {

		
		String s1="pallavi";
		String s2="Pallavi";
		
		String s3  = new String("Pallavi");
		
		System.out.println(s1==s2); // == memory 
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s3));  // content
		System.out.println(s2.equals(s3));
		
	}

}
