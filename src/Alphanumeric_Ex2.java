
public class Alphanumeric_Ex2 {

	public static void main(String[] args) {
        String s ="12Pall34 89visawANT";
        
        String str1="";
        String str2="";
        
        
        
        
        for(int i=0; i<s.length(); i++) 
         {
        	char a= s.charAt(i);
        	
        	if('0'<=a && a<='9')
        		str1=str1+a;
        	
        	if(('a'<=a && a<='z') ||('A'<=a && a<='Z'))
        		str2=str2+a;
        	
        	
        }
        System.out.println(str1);
        System.out.println(str2);

	}

}
