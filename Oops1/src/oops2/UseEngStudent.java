package oops2;

public class UseEngStudent {
	public static void main(String[] args) {
		EngStudent eg=new EngStudent(true,23,"suresh",101,"State board","Bsc(c/s)");
		System.out.println("is Male:"+eg.isMale+"\nAge :"+eg.age+"\nName :"+eg.name+"\nRollNo :"+eg.rollNo+"\nBoard :"+eg.board+"\nCourse :"+eg.course);
	
//		
		System.out.println("\nfullDetails"+eg);	
	}

}
