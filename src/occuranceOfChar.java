
public class occuranceOfChar {

	public static void main(String[] args) {
		
		String s="palllavi";
		int i,j;
		char a[]= s.toCharArray();
		int count[]= new int [a.length];
		
		for(i=0; i<a.length; i++) {
			count[i]=1;
			for(j=i+1; j<a.length; j++ ) {
				
				if(a[i]==a[j]) {
					count[i]++;
					a[j]=0;
				}
				
					}
		}
				

			
	for(i=0; i<a.length; i++) {
		
		if(a[i]!=0) {
			System.out.println(a[i] +" : "+ count[i]);
			
		}

	} 
		}
}