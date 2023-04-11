package interview;

public class OverrideStaticMethod {

//	public static void display() {
//		System.out.println("static method from base");
//	}

	public void print() {
		System.out.println("Non static method from the base");
	}

}

class Child extends OverrideStaticMethod {
//	public static void display() {
//		System.out.println("static method from child class");
//	}

	public void print() {
		System.out.println("Non static method from the child class");
	}
}

class UseChild {
	public static void main(String[] args) {

		Child d = new Child();
		//d.display();
		d.print();
	}

}