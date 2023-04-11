package for5_Class;

public class UseCar {
	public static void main(String[] args) {
		Car car=new Car();
		car.brand="bmw";
		car.ownerName="vicky";
		car.model="b43";
		car.registerNo="TN 07 CA 1487";
		
		Car car1=new Car();
		car1.brand="skoda";
		car1.ownerName="ravi";
		car1.model="skoda12";
		car1.registerNo="PY 03 CD 1487";
		
		Car car2=new Car();
		car2.brand="honda";
		car2.ownerName="suresh";
		car2.model="i10";
		car2.registerNo="TN 09 CQ 1487";
		
		Car []cars= {car,car1,car2};
		
		for(Car var:cars) {
			if(var.registerNo.startsWith("TN")) {
				System.out.println("brand :"+var.brand+"\nOwner Name :"+var.ownerName+"\nModel :"+var.model+"\nRegister No :"+var.registerNo+"\n");
			}
		}
		
	}

}
class Car{
	String brand;
	String ownerName;
	String model;
	String registerNo;
}
