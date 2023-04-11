package oops2;

public class Car extends Veicle{
	String brand;
	int price;
	int tax;
	String color;
	int EngineCc;
	public String netPrice(int price,int tax) {
		return "netPrice :"+(price+tax);
	}
	

}
