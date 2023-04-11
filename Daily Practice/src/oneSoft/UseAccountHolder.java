package oneSoft;

public class UseAccountHolder {
	public static void main(String[] args) {
		AccountHolder bankDetails=new AccountHolder();
		bankDetails.name="ravi";
		bankDetails.age=34;
		bankDetails.gender="Male";
		bankDetails.accountNumber=98765431212l;
		bankDetails.monthlyIncome=29000;
		bankDetails.savingsPercentage=18;
		
		System.out.println("Saving Amount : "+(bankDetails.monthlyIncome*bankDetails.savingsPercentage)/100);
		
	}

}
