
public class AscendingOrder {

	public static void main(String[] args) {

		int temp=0;
		int a[]= {5,8,4,2,9,7};
		
		for(int i=0; i<a.length; i++) {
			
			for (int j=i+1; j<a.length; j++)
			{
				
				if(a[i]>a[j]) {
                 temp=a[i];
			     a[i]=a[j];
			     a[j]=temp;
				}}
			  
				System.out.println(a[i]);
		}
		
	}

		
}
