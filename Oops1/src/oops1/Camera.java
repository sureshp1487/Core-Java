package oops1;

public class Camera {
	private String brand;
	private int price ;
	private boolean hasUsbConnection;
	private Lense lense;
	
	public void setBrand(String brand1){
		brand=brand1;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price1) {
		price=price1;
	}
	public int getPrice() {
		return price;
	}
	public void sethasUsbConnection(boolean isConnection) {
		hasUsbConnection=isConnection;
	}
	public boolean gethasUsbConnection() {
		return hasUsbConnection;
	}
	public void setLense(Lense lense1) {
		lense=lense1;
	}
	public Lense getLense() {
		return lense;
	}
	public Camera(String brand1,int price1,boolean isConnection,Lense lense1) {
		brand=brand1;
		price=price1;
		hasUsbConnection=isConnection;
		lense=lense1;
		
	}
	public String toString() {
		return "brand name :"+brand+"\nbrand price :"+price+"\nisConnection :"+hasUsbConnection+"\n\nLense Details:"+lense;
	}

}
