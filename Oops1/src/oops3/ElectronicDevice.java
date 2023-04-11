package oops3;

public interface ElectronicDevice {

	public String battery(String capacity);
	public String cemera(String megaplex);
	
	default int netPrice(int amount,int tax) {
		return amount*tax/100;
		
	}
}
