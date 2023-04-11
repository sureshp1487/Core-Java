package forClass1;

public class FactorialPrint {
	public static void main(String[] args) {
		int fact1=1;
		int num=10;
		
		for(int i=1;i<=num;i++) {
			
			fact1=fact1*i;
			
			System.out.println("Factorial of "+i+" is "+fact1);
			
		}
	}		 
}
