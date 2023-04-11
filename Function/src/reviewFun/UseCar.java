package reviewFun;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="bmw";
		car1.price=800000;
		car1.color="black";
		
		Car car2=new Car();
		car2.brand="honda city";
		car2.price=700000;
		car2.color="white";
		
		Car car3=new Car();
		car3.brand="swift";
		car3.price=900000;
		car3.color="brown";
		
		Car[] arr= {car1,car2,car3};
		System.out.println(car1.findMaxPrice(arr));
	}

}
class Car {
	String brand;
	int price;
	String color;
	
	public String findMaxPrice(Car[] val) {
		if(val[0].price>val[1].price && val[0].price>val[2].price) {
			return""+ val[0].price;
		}else if(val[1].price>val[0].price && val[1].price>val[2].price) {
			return ""+val[1].price;
		}else if(val[2].price>val[0].price && val[2].price>val[1].price) {
			return ""+val[2].price;
		}
		return  "";
		
	}
	
}