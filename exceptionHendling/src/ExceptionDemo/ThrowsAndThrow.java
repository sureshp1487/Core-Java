package ExceptionDemo;

import java.io.IOException;

public class ThrowsAndThrow {
	void emailCheck(String email) throws Raized {
		if(email.endsWith("@gmail.com")) {
			throw new Raized("\n"+"The Mail Id Valid");
		}else {
			//throw new ClassNotFoundException("Class Not Found Exception");
			System.out.println("\n"+"Invalid Mail Id");
		}
		System.out.println("H");
		
	}
	public static void main(String[] args) {
		ThrowsAndThrow bot=new ThrowsAndThrow();
		try {
		bot.emailCheck("sureshkk4620@gmail.co");
		}
		catch(Exception e){
			System.out.println("A proble occured :"+e);
		}
	}

}
