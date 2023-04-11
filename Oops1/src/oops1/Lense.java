package oops1;

public class Lense {
	private String brand;
	private int price;
	private String  focasLength;
	boolean isMadeInIndia;
	
	public void setBrand(String lbrand) {
		brand=lbrand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int lprice) {
		price=lprice;
	}
	public int getPrice() {
		return price;
	}
	public void setFocasLength(String lfocas) {
		focasLength=lfocas;
	}
	public String getFocasLength() {
		return focasLength;
	}
	public void setIsMadeInIndia(boolean lIsMade) {
		isMadeInIndia=lIsMade;
	}
	public Lense(String lbrand,int lprice,String lfocas,boolean lIsMade) {
		brand=lbrand;
		price=lprice;
		focasLength=lfocas;
		isMadeInIndia=lIsMade;
	}
	public String toString() {
		return "\n\nlense brand :"+brand+"\nlense price :"+price+"\nlense focas :"+focasLength+"\nLens Made In India :"+isMadeInIndia+"Lense Details:";
	}
	

}
