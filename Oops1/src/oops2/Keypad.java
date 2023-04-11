package oops2;

public class Keypad extends Landline {
	private String batteryType;
	public void setBatteryType(String batteyType) {
	}
	public String getBatteryType() {
		return batteryType;
	}
	
	public Keypad(String brand,int price,String batteryType) {
	super(brand,price);
		this.batteryType=batteryType;
		
	}
	public String toString() {
		return "Brand :"+getBrand()+"\nPrice :"+getPrice()+"\nBatteryType"+getBatteryType();
	}

}
