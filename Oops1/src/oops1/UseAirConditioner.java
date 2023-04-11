package oops1;

public class UseAirConditioner {
	public static void main(String[] args) {
	Compressor cp=new Compressor();	
	cp.setBrand("atless");
	cp.setCapacity("25 L");
	cp.setPrice(2500);
	
	AirConditioner ac=new AirConditioner();
	ac.setBrand("Samsung");
	ac.setPrice(15000);
	ac.setType("window");
	ac.setCompressor(cp);
	
	
	System.out.println("AirConditioner Brand:"+ac.getBrand()+"\nAirConditioner Price:"+ac.getPrice()+"\n"+"\nCompressor Brand:"+ac.getCompressor().getBrand()+"\nCompressor Price:"+ac.getCompressor().getPrice());
	}

}
