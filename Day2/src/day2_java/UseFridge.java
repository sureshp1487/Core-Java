package day2_java;

public class UseFridge {
	public static void main(String[] args) {
		Fridge fridgeDetail= new Fridge();
		fridgeDetail.brand="LG";
		fridgeDetail.price=17000;	
		fridgeDetail.taxPercentage=15;
		fridgeDetail.disCountPercentage=10;
		
//		fridgeDetail.netPrice=(fridgeDetail.price+(fridgeDetail.price*fridgeDetail.taxPercentage)/100)-((fridgeDetail.price*fridgeDetail.disCountPercentage)/100);
		fridgeDetail.netPrice=(fridgeDetail.price+(fridgeDetail.price*fridgeDetail.taxPercentage)/100)-(fridgeDetail.price*fridgeDetail.disCountPercentage)/100;
		System.out.println("Net Price = "+fridgeDetail.netPrice);

	}
	
	
}
