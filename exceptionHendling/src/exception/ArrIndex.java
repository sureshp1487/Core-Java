package exception;

public class ArrIndex {
	public static void main(String[] args) {
		int a=10,b=0;
		try {
		String [] name= {"suresh","main","aravind"};
		//System.exit(0);
		System.out.println(name[1].charAt(6));
		}
	
		
		catch(ArrayIndexOutOfBoundsException arr) {
			arr.printStackTrace();
			System.out.println("ArrayIndex out found Exception");
		}

		catch(IndexOutOfBoundsException brr) {
//			brr.printStackTrace();
			System.out.println("index out of bounds exception");
		}

		catch(ArithmeticException e) {
			System.out.println("arrrrr");
		}
		
		
		finally {
			
			System.out.println("hi");
		}
		
		System.out.println("main mehtod");
		
		
		
	}


	
}
