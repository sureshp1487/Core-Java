package mothodOverrinding;

public class Bank {
	String name;
	String location;
	String branch;
	
	public String toFindInterest(int price) {
	return "Interest :"+(price*10/100);
	}
}
