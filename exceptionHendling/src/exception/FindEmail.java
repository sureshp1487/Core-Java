package exception;

public class FindEmail {
	public static void main(String[] args) throws EmailException {
		String verify="Suresh345@gmail.com";
		if(verify.endsWith("@gmail.com")) {
			throw new EmailException("eligible");
		}else {
			System.out.println("not eligible");
		}
	}

}
