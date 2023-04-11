package polymorphism;

public class Overrinding11 {
	void add(int a,int b) {
		System.out.println("addition :"+(a+b));
	}
}
class Sub1 extends Overrinding11{
void add(int a,int b) {
	System.out.println("Substraction :"+(a-b));
}	
}
