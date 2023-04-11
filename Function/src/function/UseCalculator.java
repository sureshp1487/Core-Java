package function;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
		cal.modul();
	}

}
class Calculator{
	public void add() {
		int a=8;
		int b=2;
		int c=a+b;
		System.out.println("addition:"+c);
		}
	public void sub() {
		int a=8;
		int b=2;
		int c=a-b;
		System.out.println("substraction:"+c);	
	}
	public void mul() {
		int a=8;
		int b=2;
		int c=a*b;
		System.out.println("multi:"+c);
	}
	public void div() {
		int a=8;
		int b=2;
		int c=a/b;
		System.out.println("div:"+c);
	}
	public void modul() {
		int a=7;
		int b=2;
		int c=a%b;
		System.out.println("modul:"+c);
	}
}
