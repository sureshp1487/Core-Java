package exception;

public class CheckAge {

	public static void main(String[] args) throws AgeException {
	try {
		int age=17;
		if(age<18) {
			throw new AgeException("not eligible");
		}else {
			System.out.println("eligible");
		}
	}
		//System.out.println("election closed");
	catch(AgeException ag) {
		ag.printStackTrace();
	}
	}
}
