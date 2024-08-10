
public class swapString {

	public static void main(String[] args) {
		String a="pallavi";
		   String b="prasad";
		   
		  a=a+b;
		  b=a.substring(0,a.length()-b.length());
		  a=a.substring(b.length());

		   
		   
		   System.out.println(b+ " "+a);
	}

}
