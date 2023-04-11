package oops1;

public class Fan {
	private String brand;
	private int price;
	private Coil coil;
	
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
	public void setCoil(Coil coil) {
		this.coil=coil;
	}
	public Coil getCoil() {
		return coil;
	}
	
	public Fan(String brand,int price,Coil coil) {
		this.brand=brand;
		this.price=price;
		this.coil=coil;
	}
	public String toString() {
		return "brand name:"+brand+"\nPrice:"+price+"\n\nCoil Details:"+coil+"\n";
	}
	

}
