package exception;

public class Example {
	public static void main(String[] args) {
		try{
			int num1=15;
			int num2=0;
			int num=num1/num2;
		
		System.out.println(num);}
		catch(ArithmeticException ae){
		ae.printStackTrace();
		}
		System.out.println("program end");
	}

}
