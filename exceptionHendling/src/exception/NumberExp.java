package exception;

public class NumberExp {
	public static void main(String[] args) {
		String []num= {"23v","34"};
		try{int num1=Integer.parseInt(num[0]);
		
		System.out.println(num1);
		}
		catch(Exception nf) {
			nf.printStackTrace();
		}
		System.out.println("String cannot be convert int");
	}

}
