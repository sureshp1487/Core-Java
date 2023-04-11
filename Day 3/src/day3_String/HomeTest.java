package day3_String;

public class HomeTest {
	public static void main(String[] args) {
		String word = "123454";
		String[] num1 = word.split("");
		int total = 0;


		for (int i = 0; i < num1.length; i++) {
			int valu = Integer.parseInt(num1[i]);
			total = total + valu;
		}
		System.out.println(total);

	}

}
