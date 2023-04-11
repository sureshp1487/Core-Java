package exception;

public class ExpStrA {
	public static void main(String[] args) {
		try {
	String name="suresh";
	System.out.println(name.charAt(7));
		}
		catch(Exception ae) {
			ae.printStackTrace();
		}
		System.out.println("String out of bound");
}
	}
