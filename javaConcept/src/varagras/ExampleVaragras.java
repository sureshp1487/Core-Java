package varagras;

public class ExampleVaragras {
	static void fun(int num,int num1,String... values) {
		for (String i : values) {
			System.out.println(i + " ");
		}
		System.out.println("num is"+num1);
		System.out.println("num is"+num);
		
		
		
		
	}

	public static void main(String[] args) {
		fun(40,23,"suresh"," mani"," snageetha");
		fun(79,32,"mani", "sangeetha", "yokesh", "Dviyashree");
	}

}
