package oops1;

public class Mobile {
	private String brand;
	private int price;
	Battery battery;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;	
	}
	public void setBattery(Battery battery) {
		this.battery=battery;
	} 
	public Battery getBattery() {
		return battery;
	}

}
class Battery{
	private String brand;
	private int price;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	
}
