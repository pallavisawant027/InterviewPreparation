package corejava;


class add {
	
	void show () {
		System.out.println("addition");
	}
	
}

class addition extends add {
	
	void show () {
		System.out.println("addition super");
	}
	
}
public class overridingEx1 {
	public static void main (String args[]) {
		add ab = new add();
		addition ac = new addition();
        ab.show();
        ac.show();
	}

}
