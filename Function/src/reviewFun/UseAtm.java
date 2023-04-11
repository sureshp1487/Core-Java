package reviewFun;

public class UseAtm {
	public static void main(String[] args) {
		Atm atm=new Atm();
		atm.sum(45, 23);
	}

}
class Atm {
	public void sum(int a, int b) {
		int c=a+b;
		System.out.println("addition:"+c);
	}
}
