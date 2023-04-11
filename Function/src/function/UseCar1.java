package function;

public class UseCar1 {
	public static void main(String[] args) {
		Car1 car = new Car1();
		car.brand = "honda city";
		car.price = 70000;
		car.tax = 15000;
		car.color = "white";

		Car1 car1 = new Car1();
		car1.brand = "Swift";
		car1.price = 80000;
		car1.tax = 11000;
		car1.color = "black";

		// System.out.println(car.findMaxBrand(car,car1));

		Car1[] cars = { car, car1 };
	
		System.out.println(car1.findMaxPrice(cars));

	}

}

class Car1 {
	String brand;
	int price;
	int tax;
	String color; 

	public String findMaxPrice(Car1[] c) {
		int max = c[1].price;
		for (int i = 0; i < c.length; i++) {
			if (c[i].price < max) {
				max = i;

			}
		}
		return "Brand Name: " + c[max].price;
	}
}
