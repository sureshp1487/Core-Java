package ExceptionDemo;

public class ArithmeticExc {
	public static void main(String[] args) {
		int num=10,num1=0;
		
		String name="suresh";
		
		String name1=null;
		
		try{int num3=num/num1;
		System.out.println(num3);
		}
		
		catch(ArithmeticException s) {
	System.out.println("num cannot divided by zero");
	num1=2;
	int num3=num/num1;
	System.out.println(num3);
		}
		
		
		try {
		System.out.println(name.charAt(6));
		}
		
		catch(ArithmeticException e){
			System.out.println("hiiiii");
			
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String out of bound");
		}
		try {
		System.out.println(name1.toUpperCase());
		}
		catch(NullPointerException null1) {
			System.out.println("here handle null point exception");
			name1="suresh";
		}
		
		
		
	}

}
