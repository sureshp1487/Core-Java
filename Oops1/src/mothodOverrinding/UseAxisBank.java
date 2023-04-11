package mothodOverrinding;

public class UseAxisBank {
	public static void main(String[] args) {
	AxisBank ab=new AxisBank();
	ab.name="suresh";
	ab.location="chennai";
	ab.branch="velachery";
	
	System.out.println(ab.toFindInterest(100000));
	}

}

