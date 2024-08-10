
public class missingNumber {

	public static void main(String[] args) {

		int total_num=100;
		
		int num_sum=0;
		 int a [] = {2,5,45,67,99};	
		 
	int	Exp_totalNum = total_num * ((total_num + 1) / 2);
		 
		 for (int i=0; i<total_num; i++) {
			 num_sum += i; 
			 
			 
		 }
		 System.out.print(Exp_totalNum - num_sum);

	        // Print a newline character to end the line.
	        System.out.print("\n");
		
		
	}

}
