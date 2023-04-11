package oops2;

public class UseSportsCar {
	public static void main(String[] args) {
		SportsCar sc=new SportsCar();
		
		sc.twoWheel="bike";
		sc.fourWheel="Car";
		sc.brand="BMW";
		sc.price=1300000;
		sc.tax=5000;
		sc.climbingSpeed=700;
		String netPrice=sc.netPrice(sc.price, sc.tax);
	
		System.out.println("Four :"+sc.fourWheel+"\nBrand :"+sc.brand+"\nPrice :"+sc.price+"\nClimbing Speed:"+sc.climbingSpeed+"\n"+netPrice);
	}

}
