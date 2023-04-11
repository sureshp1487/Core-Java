package for5_Class;

public class UseBike {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.brand="pulsar";
		bike.model="ns200";
		bike.price=150000;
		bike.isWarranty=false;
		
		Bike bike1=new Bike();
		bike1.brand="duke";
		bike1.model="200";
		bike1.price=200000;
		bike1.isWarranty=true;
		
		Bike bike2=new Bike();
		bike2.brand="yemaha";
		bike2.model="R15";
		bike2.price=180000;
		bike2.isWarranty=true;
		
		Bike []bikes= {bike,bike1,bike2};
		Bike max=new Bike();
		max.price=bike2.price;
		
		for(int i=0;i<bikes.length;i++) {
			if(bikes[i].price>max.price) {
				
				max=bikes[i];
				max.price=bikes[i].price+(bikes[i].price*18/100);
			}
		}
		System.out.println("Brand name :"+max.brand+"\nModel :"+max.model+"\nNetPrice :"+max.price+"\nIs Warranty :"+max.isWarranty);
	}

}
