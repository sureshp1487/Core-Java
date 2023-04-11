package mothodOverrinding;

public class AxisBank extends Bank {
	public String toFindInterest(int price) {
		return "Interest :"+(price*15/100);
	}

}
