package oops3;

public abstract class Phone implements ElectronicDevice {
	
	public int findNetPrice(int amount,int tax) {
		return amount+amount*10/100;
	}
	
     public String battery(String capacity) {
    	 return capacity;
     }
     public String cemera(String megaplex) {
    	 return megaplex;
     }

}
