package oops1;

public class Computer {
	private String brand;
	private int price;
	private boolean isWriedLess;
	private Cpu cpu;
	
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
	public void setIsWried(boolean isWriedLess) {
		this.isWriedLess=isWriedLess;
	}
	public boolean getIsWried() {
		return isWriedLess;
	}
	
	public Computer(String brand,int price,boolean isWriedLess,Cpu cpu) {
		this.brand=brand;
		this.price=price;
		this.isWriedLess=isWriedLess;
		this.cpu=cpu;
	}
	public String toString() {
		return "Brand name :"+brand+"\nPrice :"+price+"\nisWriedLess :"+isWriedLess+"\nCpu details :"+cpu;
	}

}
