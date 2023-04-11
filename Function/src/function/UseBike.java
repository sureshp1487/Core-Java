package function;

public class UseBike {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.brand="duke";
		bike.price=150000;
		bike.taxAmount=5500;
		bike.speed=130;
		
		Bike bike1=new Bike();
		bike1.brand="pulsar";
		bike1.price=120000;
		bike1.taxAmount=5000;
		bike1.speed=100;
		
		Bike bike2=new Bike();
		bike2.brand="bmw";
		bike2.price=180000;
		bike2.taxAmount=11000;
		bike2.speed=160;
		
		
		bike2.netPrice(bike1.price, bike1.taxAmount);
		bike1.netPrice1(bike.price,bike.taxAmount);
	}
	
}
class Bike{
	String brand;
	int price;
	int taxAmount;
	int speed;
	
	public void netPrice(int price,int tax) {
		System.out.println("Second bike netPrice:"+(price+tax));
	}
	public void netPrice1(int price,int tax) {
		System.out.println("NetPrice :"+(price+tax));
	}

}