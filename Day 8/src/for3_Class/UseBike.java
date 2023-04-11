package for3_Class;

public class UseBike {
	public static void main(String [] args) {
		Bike bikeinfo=new Bike();
		bikeinfo.brand="pulsar";
		bikeinfo.price=100000;
		bikeinfo.color="black";
		bikeinfo.discountAmount=bikeinfo.price*40/100;
		
		Bike bikeinfo1=new Bike();
		bikeinfo1.brand="duke";
		bikeinfo1.price=200000;
		bikeinfo1.color="black";
		bikeinfo1.discountAmount=bikeinfo.price*45/100;
		
		Bike bikeinfo2=new Bike();
		bikeinfo2.brand="yemaha";
		bikeinfo2.price=180000;
		bikeinfo2.color="black";
		bikeinfo2.discountAmount=bikeinfo.price*35/100;
		
		Bike []arr= {bikeinfo,bikeinfo1,bikeinfo2};
		
		//Enhanced for loop
		
		for(Bike var:arr) {
			System.out.println(var.discountAmount);
		}
		
	}

}
