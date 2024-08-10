import java.util.Arrays;

public class AscendingFirstWord {

	public static void main(String[] args) {
		
		String s="Pallavi Sawant";
		String a[]=s.split(" ");
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		
		String s1= a[0];
		String s2= a[1];		
		
		char b[] = s1.toCharArray();
		String temp="";
		
	
	
		for(int j=0; j<b.length; j++) 	
		
		{			
			for(int k=j+1; k<b.length; k++) {
				
				if(b[j]>b[k]) {
					temp=a[j];
				    a[j]=a[k];
				    a[k]=temp;
			}
			}
			System.out.println(Arrays.toString(b));
			
			}
			
		}
}
}

