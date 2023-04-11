package reviewFun;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println("Module value:"+cal.module(7,2));
	}

}
class Calculator{
	public int module(int num1,int num2) {
		int c=num1%num2;
		return c;
	}
}