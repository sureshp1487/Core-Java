package mothodOverrinding;

public class UsePersonalLoan {
	public static void main(String[]args) {
		PersonalLoan pl=new PersonalLoan();
		System.out.println(pl.findEmpName(pl.name));
		System.out.println(pl.add(20,"gg"));
	}

}
