package oops1;

public class AirConditioner {
	private String brand;
	private int price;
	private String type;
	private Compressor compressor;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int Price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setType(String type) {
		this.type=type;
	}
	public void setCompressor(Compressor compressor) {
		this.compressor=compressor;
	}
	public Compressor getCompressor() {
		return compressor;
	}
}
