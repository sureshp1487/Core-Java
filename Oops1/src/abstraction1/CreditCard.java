package abstraction1;

public  class CreditCard extends Loan{
	public int rateOfInterest(int amount) {
		return amount*10/100;
	}

}
