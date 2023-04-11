package day3_String;

public class UseTestQue2 {
	public static void main(String[] args) {
		TestQue2 test= new TestQue2();
		test.brand="reynolds";
		test.price=5;
		test.color="blue";
		
		TestQue2 test2=new TestQue2();
		test2.brand="parker";
		test2.price=25;
		test2.color="black";
		
		String pen=((test.brand+","+test2.brand).toUpperCase());
		boolean pen1=(test.brand+","+test2.brand).contains("r");
		boolean isBlue=test.color.equals("blue");
		boolean isBlack=test2.color.equalsIgnoreCase("BLACK");
		String char1=(test2.color.charAt(4)+","+test.color.charAt(2));
		String []Split=test.brand.split("n");
		System.out.println(pen);
		System.out.println(pen1);
		System.out.println(isBlue);
		System.out.println(isBlack);
		System.out.println(char1);
		System.out.println(Split[0]+" - "+Split[1]);
		
		
		
		
	}

}
