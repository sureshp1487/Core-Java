package for5_Class;
/*
 * find maximum and minimum bike objenct 
 * */
public class UseBike1 {
	public static void main(String[] args) {
		Bike1 bike=new Bike1();
		bike.brand="pulsar";
		bike.price=150000;
		bike.model="ns200";
		bike.isGear=true;
		
		Bike1 bike1=new Bike1();
		bike1.brand="duke";
		bike1.price=200000;
		bike1.model="ktm 200";
		bike1.isGear=true;
		
		Bike1 bike2=new Bike1();
		bike2.brand="honda";
		bike2.price=70000;
		bike2.model="ray";
		bike2.isGear=false;
		
		
		Bike1[] arr= {bike,bike1,bike2};
		Bike1 max=new Bike1();
		Bike1 mini=new Bike1();
		mini.price=bike1.price;
		
		for(Bike1 var:arr) {
			if(var.price>max.price) {
				max=var;
				max.netPrice=var.price+(var.price*18/100);
			}
			if(var.price<mini.price) {
				mini=var;
				mini.netPrice=var.price-(var.price*5/100);
			}	
		}	
		System.out.println("Brand:"+max.brand.toUpperCase()+"\nPrice:"+max.price+"\nModel:"+max.model.toUpperCase()+"\nIs Gear:"+max.isGear+"\nNetPrice:"+max.netPrice+"\n");
		System.out.println("Brand:"+mini.brand.toLowerCase()+"\nPrice:"+mini.price+"\nModel:"+mini.model.toLowerCase()+"\nIs Gear:"+mini.isGear+"\nNetPrice:"+mini.netPrice);
	}
}
class Bike1 {
	String brand;
	int price;
	String model;
	boolean isGear;
	int netPrice;
}
