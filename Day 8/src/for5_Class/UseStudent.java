package for5_Class;

public class UseStudent {
	public static void main(String[] args) {
		Student st=new Student();
		st.name="suresh";
		st.age=17;
		st.rollNo=5;
		
		Student st1=new Student();
		st1.name="ravi";
		st1.age=15;
		st1.rollNo=12;
		
		Student st2=new Student();
		st2.name="suresh";
		st2.age=20;
		st2.rollNo=23;
		
		Student []sts= {st,st1,st2};
		
		for(Student var:sts) {
			if(var.rollNo>=1 &&var.rollNo<=10 ) {
				var.section="A section";
			}else if(var.rollNo>=11 && var.rollNo<=20) {
				var.section="B section";
			}else if(var.rollNo>=21 && var.rollNo<=30) {
				var.section="C section";
			}
			System.out.println(var.name+"\nAge :"+var.age+"\nRoll No"+var.rollNo+"\nSection :"+var.section+"\n");
		}
	}

}
class Student{
	String name;
	int age;
	int rollNo;
	String section;
}
