package basicOopsConcept;

class A{
	
	A(){
		this(5);
		///this(5,10);
		System.out.println("hello");
	}
	A(int a){
		System.out.println("hiiiii");
		System.out.println(a);
	}
	A(int a,int b){
		System.out.println(a+b);
	}
}
public class ConstructorUsingThis {
	public static void main(String[] args) {
		A aa=new A();
	}

	

}
