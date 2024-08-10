
public class sumfromtwoarray {

	public static void main(String[] args) {

		int a[] = {5,6,8,9,3};
		int b[] = {3,4,5,9,2};	
		
		int c[] = new int[a.length];
		
		if(a.length==b.length)
			for(int i=0,j=0,k=0; i<a.length; i++,j++,k++)
			{
			 c[k]=a[i]+b[j];		
				System.out.println(c[k]);
	
				
			}
	}

}
