package lms;

public class UseCar {
	public static void main(String[] args) {
		String[] carSplit  = args[0].split("_");
		String[] carSplit1 = args[1].split("_");
		String[] carSplit2 = args[2].split("_");

		Car brand1 = new Car();
		brand1.brand = carSplit[0];
		brand1.price = Integer.parseInt(carSplit[1]);
		brand1.color = carSplit[2];
		brand1.disCount = ((brand1.price * 5) / 100);
		brand1.tax = ((brand1.price * 10) / 100);
		brand1.netPrice = (brand1.price + brand1.tax - brand1.disCount);

		System.out.println("Net Price :" + brand1.netPrice);

		Car brand2 = new Car();
		brand2.brand = carSplit1[0];
		brand2.price = Integer.parseInt(carSplit1[1]);
		brand2.color = carSplit1[2];
		
//		find the discount amount
		brand2.disCount = ((brand2.price * 5) / 100);
//		find the tax amount
		brand2.tax = ((brand2.price * 10) / 100);
//		find the netprice
		brand2.netPrice = (brand2.price + brand2.tax + brand2.disCount);

		System.out.println("Net Price :" + brand2.netPrice);
		
		Car brand3=new Car();
		brand3.brand=carSplit2[0];
		brand3.price=Integer.parseInt(carSplit2[1]);
		brand3.color=carSplit2[2];
		
//		find the discount amount
		brand3.disCount=(brand3.price*5)/100;
		brand3.tax=(brand3.price*10)/100;
		
		brand3.netPrice =(brand3.price + brand3.tax - brand3.disCount);
				
		System.out.println("Net Price :"+brand3.netPrice);
		

	}

}

class Car {
	String brand;
	int price;
	String color;
	int disCount;
	int tax;
	int netPrice;

}
