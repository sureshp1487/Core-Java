package exception;

public class AgeException extends Exception {
	public AgeException(String exe) {
		super(exe);
	}
	public void printStackTrace() {
		System.err.println("not qualified");/*err throw the error inthe cout*/
	}

}
