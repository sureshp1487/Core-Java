package InhertanceIN;

public class Vehicle {
	String brandName="pulser";
	private int salary;
	

}
class VehicleModel extends Vehicle{
	String model1="pulser 150Cc";
	String model2="pulser 180Cc";
	String model3="pulser 220Cc";
	
	
}
class SuperBike extends VehicleModel{
	String superbike="dominar 400Cc";
}