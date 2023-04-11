package for3_Class;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop lap=new Laptop();
		lap.brand="lenovo";
		lap.color="black";
		lap.price=20000;
	
		Laptop lap1=new Laptop();
		lap1.brand="dell";
		lap1.color="gray";
		lap1.price=30000;
		
		Laptop lap2=new Laptop();
		lap2.brand="Mac";
		lap2.color="white";
		lap2.price=100000;
		
		Laptop[] laps= {lap,lap1,lap2};
	
		for(int i=0;i<laps.length;i++) {
		System.out.println(laps[i].brand+"="+laps[i].price);
		}
	}

}
