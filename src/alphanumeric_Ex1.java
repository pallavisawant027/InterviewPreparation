
public class alphanumeric_Ex1 {

	public static void main(String[] args) {
		
		String s ="pallavi&124$ man788saw&*";
		

		String s1= s.replaceAll("[^A-Za-z]", "");
		String s2= s.replaceAll("[^0-9]", "");
		String s3= s.replaceAll(" ", ""); 
		String s4= s.replaceAll("[^A-Za-z0-9]", ""); 
	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

}
}