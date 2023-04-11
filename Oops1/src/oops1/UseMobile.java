package oops1;

public class UseMobile {
	public static void main(String[] args) {
		Battery bt=new Battery();
		bt.setBrand("oppo");
		bt.setPrice(2500);
		
		Mobile mb=new Mobile();
		mb.setBrand("oppo f17");
		mb.setPrice(17000);
		mb.setBattery(bt);
		
		System.out.println("Mobile Brand:"+mb.getBrand()+"\nMobile Price:"+mb.getPrice()+"\n"+"\nBattery Brand:"+mb.getBattery().getBrand()+"\nBattery Price:"+mb.getBattery().getPrice());
	}

}
