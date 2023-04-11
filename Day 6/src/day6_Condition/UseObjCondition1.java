package day6_Condition;

public class UseObjCondition1 {
	public static void main(String[] args) {
		ObjCondition1 pen=new ObjCondition1();
		pen.brand="cello";
		pen.price=20;
		pen.color="blue";
		
		ObjCondition1 pen1=new ObjCondition1();
		
		pen1.brand="camlin";
		pen1.price=15;
		pen1.color="black";
		
		if(pen.price>pen1.price) {
			
			System.out.println(pen.price+" pen1 is greater");
		}else {
		System.out.println(pen1.price+" pen2 is greater");
		}
		
	}

}
