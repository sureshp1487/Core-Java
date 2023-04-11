package function;

public class UseCollege {
	public static void main(String[] args) {
		College cl=new College();
		cl.name="QMC";
		cl.fees=3000;
		cl.grad="C grad";
		cl.code=101;
		
		College cl1=new College();
		cl.name="Guru";
		cl1.fees=6000;
		cl1.grad="A grad";
		cl1.code=102;
		
		College cl2=new College();
		cl.name="vit";
		cl2.fees=4000;
		cl2.grad="B grad";
		cl2.code=103;
		
		College []arr= {cl,cl1,cl2};
		
		System.out.println(cl2.minFees(arr));
	}

}

class College {
	String name;
	int fees;
	String grad;
	int code;

	public String minFees(College[] c) {

		int min = c[1].fees;

		for (int i = 0; i < c.length; i++) {
			if (c[i].fees < min) {
				min = i;
			}
		}
		return "grad:" + c[min].grad+"\nCollege name:"+c[min].name;
	}
	

}
	
	
