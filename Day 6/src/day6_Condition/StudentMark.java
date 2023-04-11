package day6_Condition;

public class StudentMark {
	public static void main(String[] args) {
	int tamil=78;
	int english=56;
	int science=98;
	
	if(tamil>english&&tamil>science)
	{
		System.out.println(tamil+": Tamil mark is greater");
	}
	
	else if(english>tamil&&english>science) 
	{
		System.out.println(english+": English mark is greater");
		
	}
	
	else if(science>tamil&&science>english) 
	{
		System.out.println(science+": Science mark is greater");
	}
	
	else
		
	{
		System.out.println("Invalid Data");
	}
	
	
}
}