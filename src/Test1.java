
public class Test1 {

	public static void main(String[] args) {
		
		 String s1 = "pallavi";

	        String s2 = "sawant";

	        int x, y;

	        x = s1.length();

	        y = s2.length();

	        int count = 0; 

	        for (int i = 0; i < x; i++) {

	            count = 0;

	            for (int j = 0; j < y; j++) {

	                if (s1.charAt(i) == s2.charAt(j)) {

	                    count++;

	                }

	            }

	            if (count > 1) { 

	                System.out.println("Count of '" + s1.charAt(i) + "' is " + count);

	            }

	        }


	}

}
