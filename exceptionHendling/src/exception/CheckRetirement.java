package exception;

public class CheckRetirement {
	public static void main(String[] args) {
		try {
		int age=60;
		if(age<70) {
			throw new AgeException("not retirement suresh hai");
		}else {
			System.out.println("retirement");
		}}
		
	catch(AgeException ae) {
		ae.printStackTrace();	
	}
		System.out.println("scheme closed");
		
		
	

	}}
