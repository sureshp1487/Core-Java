package function;

public class UseSquareclub {
	public static void main(String[] args) {
		Squareclub sc=new Squareclub();
		System.out.println("Square :"+sc.Square());
		System.out.println("cube :"+sc.cube());
	}

}
class Squareclub {
	public int Square() {
		int num=4;
		return num*num;
	}
	public int cube() {
		int number=2;
		return number*number*number;
	}
}