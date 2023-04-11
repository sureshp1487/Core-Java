package day6_Condition;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		
		laptop.brand="lenovo";
		laptop.price=20000;
		laptop.isWarranty=true;
		
		Laptop laptop1=new Laptop();
		laptop1.brand="Samsung";
		laptop1.price=15890;
		laptop1.isWarranty=true;
		
		Laptop laptop2 =new Laptop();
		laptop2.brand="dell";
		laptop2.price=20001;
		laptop2.isWarranty=true;
		
		if(laptop.price>laptop1.price && laptop.price>laptop2.price) 
		{
			System.out.println("First letter of the brand : "+laptop.brand.charAt(0)+" Last letter of the brand : "+laptop.brand.charAt(laptop.brand.length()-1));
		}
		
		else if(laptop1.price> laptop.price && laptop1.price > laptop2.price) 
		{
			System.out.println("First letter of the Brand : "+laptop1.brand.charAt(0)+" Last letter of the brand : "+laptop1.brand.charAt(laptop1.brand.length()-1));
		}
		
		else if(laptop2.price > laptop.price && laptop2.price > laptop1.price) 
		{
			System.out.println("First letter of the brand : "+laptop2.brand.charAt(0)+" Last letter of the brand : "+laptop2.brand.charAt(laptop2.brand.length()-1));
		}
		
		else
		{
			System.out.println("Invalid Input");
		}
	}

}
class Laptop{
	String brand;
	int price;
	boolean isWarranty;
	
}