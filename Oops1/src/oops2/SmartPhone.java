package oops2;

public class SmartPhone extends Keypad {
	private boolean isFeatherTouch;
	
	public void setIsFeatherTouch(boolean isFeatherTouch) {
		this.isFeatherTouch=isFeatherTouch;
	}
	public boolean getIsFeatherTouch() {
		return isFeatherTouch;
	}
	
	public SmartPhone(String brand,int price,String batteryType,boolean isFeatherTouch) {
		super(brand,price,batteryType);
		this.isFeatherTouch=isFeatherTouch;
	}
	
	
	public String toString() {
		return "Brand :"+getBrand()+"\nPrice :"+getPrice()+"\nBatteryType :"+getBatteryType()+"\nFeatherTouch :"+isFeatherTouch;
	}

}
