package oops2;

public class EngStudent extends Student {
	String course;
	
	
	public EngStudent(boolean isMale,int age,String name,int rollNo,String board,String course) {
	super(isMale,age,name,rollNo,board);
	this.course=course;
	}
	public String toString() {
		return "isMale:"+isMale+"\nAge :"+age+"\nName :"+name+"\nRollNo :"+rollNo+"\nBoard :"+board+"\nCourse :"+course;
	}

}
