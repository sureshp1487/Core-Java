package oops2;

public class Landline {
	private String brand;
	private int price;
	
	public void setBrand(String Brand) {
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
	public Landline(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	public String toString() {
		return brand+price;
	}

}
