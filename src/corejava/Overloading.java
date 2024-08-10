package corejava;
                                 
public class Overloading {

	public static void main(String[] args) {
		
		addition(20, 30);
		addition(20, 30, 60);
		
	}
	
	public static void addition(int a,int b) {
		
		
		System.out.println(a+b);
		
	}
	public static void addition(int a,int b, int c) {
		
		
		System.out.println(a+b+c);
		
	}

	}
                               

