package day6_Condition;

public class ArithmeticOperationS {
	public static void main(String[] args) {
		String operation="div";
		int num=7;
		int num1=2;
		int num2=5;
		switch(operation) {
		case "add":
			System.out.println(num+num1);
			break;
			
		case "sub":
			System.out.println(num-num1);
			break;
			
		case "mul":
			System.out.println(num*num1);
			break;
			
		case "div":
			System.out.println(num/num1);
			break;
			
		case "module":
			System.out.println(num%num1);
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}
