package day3_String;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop laptop1=new Laptop();
		laptop1.brand="dell";
		laptop1.prince=10000;
		laptop1.color="black";
		laptop1.isWarranty=true;
		
		String brandName1=laptop1.brand.toUpperCase()+","+laptop1.color.toUpperCase();
		int length1=laptop1.brand.length();
		boolean isStartsWith=laptop1.brand.startsWith("D");
		char lastChar=laptop1.brand.charAt(laptop1.brand.length()-1);
		
		String lowerCase=brandName1.toLowerCase();
		
		System.out.println(brandName1);
		System.out.println(length1);
		System.out.println(isStartsWith);
		System.out.println(lastChar);
		System.out.println(lowerCase);
		
		
	}

}
