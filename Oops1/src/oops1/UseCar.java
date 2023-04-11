package oops1;

public class UseCar {
	public static void  main(String[] args) {
		Engine engine1=new Engine();
		engine1.brand="honda";
		engine1.price=30000;
		engine1.engineCc=1500;
		
		Car car=new Car();
		car.brand="ford";
		car.price=800000;
		car.color="blue";
		car.engine=engine1;
		System.out.println("Car Engine Brand="+car.engine.brand+"\nCar Engine Price="+car.engine.price);
		
	}

}
