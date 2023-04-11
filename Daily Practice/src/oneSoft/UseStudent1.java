package oneSoft;

public class UseStudent1 {
	public static void main(String[] args) {
		Student1 studentDel=new Student1();
		
		studentDel.name="Rajesh.P";
		studentDel.id=101;
		studentDel.age=23;
		studentDel.class1="12th";
		studentDel.attendancePercentage=78;
		
		//school working days  =240
		
		studentDel.numberOfPresentinSchool=(240*studentDel.attendancePercentage)/100;
		System.out.println("No of Days Present in school :"+studentDel.numberOfPresentinSchool);
		
		Student1 studentDel1=new Student1();
		
		studentDel1.name="nisha";
		studentDel1.id=102;
		studentDel1.age=28;
		studentDel1.class1="11th";
		studentDel.attendancePercentage=95;
		
//		school working days =365
		
		studentDel.numberOfPresentinSchool=(365*studentDel.attendancePercentage)/100;
		System.out.println("No of Days Present in school :"+studentDel.numberOfPresentinSchool);
		
		Student1 studentDel3=new Student1();
		studentDel3.name="pravin";
		studentDel3.id=103;
		studentDel3.age=28;
		studentDel3.class1="10th";
		studentDel3.attendancePercentage=100;
		
		studentDel3.numberOfPresentinSchool=(365*studentDel3.attendancePercentage)/100;
		
		System.out.println(studentDel3.numberOfPresentinSchool); 
	}

}
