package day3_String;

public class TestsStringMe {
	public static void main(String[] args) {

		String[] name1 = args[0].split(",");
		String[] name2 = name1[1].split("/");
		String firstname = name2[0];
		String secondName = name2[0];
		String thirdName = name2[1];

		System.out.println(firstname + ", " + secondName.toUpperCase() + ", " + thirdName + ", " + args.length);
	}

}
