package oops2;

public class UseMountainBike {
	public static void main(String[] args) {
		MountainBike mb=new MountainBike();
		mb.brand="BMW";
		mb.price=500000;
		mb.color="black";
		mb.climbingSpeed=150;
		
		System.out.println(mb.netPrice(10000,mb.price));
	}

}
