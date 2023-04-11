package function;

public class UseMaintance {
	public static void main(String[] args) {
		Maintance mt=new Maintance();
		System.out.println(mt.creted());
		System.out.println(mt.depted());
	}

}
class Maintance{
	int mainbalance=1500;
	
	public String creted() {
		int creted=mainbalance+2000;
		return "creted:"+creted;
	}
	public String depted() {
	int depted=mainbalance-300;	
	return "debit amount:"+depted;
	}
	}
