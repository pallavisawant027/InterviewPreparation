package corejava;

public class inheritanceEx1 {
	float salary=40000;  
	}  
	class Programmer extends inheritanceEx1{  
	 int bonus=10000;  
	 public static void main(String args[]){  
	   Programmer p=new Programmer();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	}
