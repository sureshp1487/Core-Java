package function;

public class UseStudent {
	public static void main(String[] args) {
		Student std=new Student();
		std.displayMard(45, 67, 54, 89, 95);
		std.distol(45, 67, 54, 89, 95);
	
	}

}
class Student{
	public void displayMard(int tamil,int english,int maths,int science,int social) {
		System.out.println("Tamil ="+tamil+"\nEnglish ="+english+"\nMaths"+maths+"\nScience"+science+"\nSocial"+social+"\n");
	}
	
	public void distol(int tamil,int english,int maths,int science,int social) {
		int total=tamil+english+maths+science+social;
		System.out.println("Total:"+total);
	}
}
