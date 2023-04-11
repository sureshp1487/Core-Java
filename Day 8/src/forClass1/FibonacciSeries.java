package forClass1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num1=0; 
		int num2=1;
		int range=10;
		
		for(int i=1;i<=range;i++) {
			System.out.println("reange "+i+" is "+num1);
			
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			
		}
	}

}
