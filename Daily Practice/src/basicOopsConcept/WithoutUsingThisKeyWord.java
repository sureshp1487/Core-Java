package basicOopsConcept;


	
class TestThis1{
	String name;
	String departments;
	int fees;

	public TestThis1(String name, String departments, int fees) {
		name = name;
		departments = departments;
		fees = fees;
	}

	void display() {
		System.out.println(name+" "+departments+" "+fees);
	}

}
public class WithoutUsingThisKeyWord {
	
	public static void main(String[] args) {
	TestThis1 withoutThis=new TestThis1("suresh", "pravin", 12000);
		withoutThis.display();
	}
	}