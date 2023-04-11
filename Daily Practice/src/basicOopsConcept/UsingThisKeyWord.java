package basicOopsConcept;
class testThis2{
	String name;
	String departments;
	int fees;
	public testThis2(String name, String departments, int fees) {
		super();
		this.name = name;
		this.departments = departments;
		this.fees = fees;
	}
	void display() {
		System.out.println("Name :"+name+"\ndepartments: "+departments+"\nFees :"+fees);
	}
}
public class UsingThisKeyWord {
	public static void main(String[] args) {
		testThis2 usingThis=new testThis2("suresh", "b.sc(c/s)",34000);
		usingThis.display();
	}

}
