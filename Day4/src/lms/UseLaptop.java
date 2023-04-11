package lms;


public class UseLaptop {
	public static void main(String[] args) {
	String []value=args[0].split(",");
	String []value1=args[1].split(",");
	String []value2=args[2].split(",");
	
	Laptop laptop=new Laptop();
	laptop.brand=value[0]; 
	laptop.price=Integer.parseInt(value[1]);
	laptop.color=value[2];
	
	Laptop laptop1=new Laptop();
	laptop1.brand=value1[0];
	laptop1.price=Integer.parseInt(value1[1]);
	laptop.color=value1[2];
	
	Laptop laptop2 =new Laptop();
	laptop2.brand=value2[0];
	laptop2.price=Integer.parseInt(value2[1]);
	laptop2.color=value2[2];
	
	
	System.out.println("Brand Name :"+laptop.brand+" Laptop Price :"+laptop.price+" Laptop Color :"+laptop.color);
	
	System.out.println("Brand Name :"+laptop1.brand+" Laptop Price :"+laptop.price+" laptop Color :"+laptop.color);
	
	System.out.println("Brand Name :"+laptop2.brand+" Laptop Price :"+laptop2.price+" Laptop Color :"+laptop2.color);
	
	}

}
class Laptop{
	String brand;
	int price;
	String color;
	
}
