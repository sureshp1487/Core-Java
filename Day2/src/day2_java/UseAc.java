package day2_java;

public class UseAc {
	public static void main(String[] args) {
	
	Ac AcSpc =new Ac();
	AcSpc.name="Samsung";
	AcSpc.price=28000;
	AcSpc.taxPercentage=30;
//	find the tax amount ==== AcSpc.netPrice=(AcSpc.price*AcSpc.taxPercentage)/100;
	AcSpc.netPrice=(AcSpc.price+(AcSpc.price*AcSpc.taxPercentage)/100);

	
	System.out.println("NetPrice = "+AcSpc.netPrice);
	
	}
}
