package oops2;

public class Student extends Human {
	int rollNo;
	String board;
	
	public Student(boolean isMale,int age,String name,int rollNo,String board) {
		super(isMale,age,name);
		this.rollNo=rollNo;
		this.board=board;
		
	}
	

}
