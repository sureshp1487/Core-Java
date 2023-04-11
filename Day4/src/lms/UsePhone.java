package lms;
//tex 5% discount 10% find the netprice

public class UsePhone {
	public static void main(String[] args) {
		String []phnSplit=args[0].split("_");
//		String []phnSplit1=args[1].split("-");
		
		Phone brand1=new Phone();
		brand1.brand=phnSplit[0];
		brand1.model=phnSplit[1];
		brand1.price=Integer.parseInt(phnSplit[2]);
		brand1.color=phnSplit[3];
		brand1.texAmount=(brand1.price*5)/100;
		System.out.println("Tax Amount :"+brand1.texAmount);
		brand1.disCount=(brand1.price*10)/100;
		System.out.println("Discount Amount :"+brand1.disCount);
		brand1.netPrice=(brand1.price+brand1.disCount-brand1.texAmount);
		System.out.println("Net Price :"+brand1.netPrice);
		
	}

}

class Phone{
	String brand;
	String model;
	int price;
	String color;
	int disCount;
	int texAmount;
	int netPrice;
}