package recursion;

public class ExpRecursionFact {
	
	public static int factorial(int num) {
		if(num!=0) {
			return num*factorial(num-1);
		}else {
			return 1;
		}
	}
	public static void main(String[]args) {
	 int result=factorial(5) ;
	 System.out.println(result);
	}

}
