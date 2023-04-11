package ExceptionDemo;

public class UsingThrowKey {
	void voter(int age) {
		if(age<18) {
			throw new ArithmeticException("You are Not Eliglible for voter");
		}else {
			System.out.println("You are Eliglible");
		}
		System.out.println("hiiii");
	}
	
	public static void main(String[] args) {
		UsingThrowKey thro=new UsingThrowKey();
		try {
		thro.voter(1);
		}
		catch(Exception e) {
			System.out.println("Sy:::: "+e);
		}
		
	}

}
