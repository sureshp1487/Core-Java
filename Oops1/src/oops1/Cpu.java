package oops1;

public class Cpu {
	private String brand;
	private int price;
	private String ram;
	private String rom;
	
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
	public void setRam(String ram) {
		this.ram=ram;
	}
	public String getRam() {
		return ram;
	}
	public void setRom(String rom) {
		this.rom=rom;
	}
	public String getRom() {
		return rom;
	}
	
	public Cpu(String brand,int price,String ram,String rom) {
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		this.rom=rom;
	}
	public String toString() {
		return "\n\nCpu brand :"+brand+"\nCpu Price :"+price+"\nCpu Ram :"+ram+"\nCpu Rom :"+rom;
	}

}
