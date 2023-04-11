package function;

public class UseCar {
	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "honda city";
		car.price = 70000;
		car.tax = 15000;
		car.color = "white";

		Car car1 = new Car();
		car1.brand = "Swift";
		car1.price = 80000;
		car1.tax = 11000;
		car1.color = "black";

		System.out.println(car.findMaxBrand(car, car1));

	}

}

class Car {
	String brand;
	int price;
	int tax;
	String color;

	public String findMax(Car value) {
		if (value.price > 80000) {
			return "max 80000;";
		} else {
			return "min 80000";
		}
	}

	public String findMaxBrand(Car v1, Car v2) {
		if (v1.price > v2.price) {
			return "brand Name:" + v1.brand;
		} else {
			return "brand Name:" + v2.brand;
		}
	}

}
