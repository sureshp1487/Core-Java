package exception;

public class NullErroe {
	public static void main(String[] args) {
	try {
	String name=null;
	System.out.println(name.length());
	}
	catch(Exception ae) {
		ae.printStackTrace();
		
	}
	System.out.println("value cannot be assign");
	
}
}