package day2_java;

public class UseStudent {
	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="suresh";
		student1.dateOfBirth="07/02/1997";
		student1.rollNo=03;
		student1.age=25;
		student1.number=9876543676l;
		student1.address="No:05 Bhavani Street";
		
		System.out.println("student name = "+student1.name+"\nstudent dateofbirth = "+student1.dateOfBirth+"\nstudent rollno = "+student1.rollNo+"\nstudent age = "+student1.age+"\nstudent number = "+student1.number+"\nstudent address = "+student1.address);
		
	}

}
