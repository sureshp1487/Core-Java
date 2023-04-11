package function;

public class UseClgStudent {
	public static void main(String[] args) {
		ClgStudent cs=new ClgStudent();
		
		System.out.println("Total:"+cs.total(45, 55, 67, 89));
		System.out.println("Average:"+cs.average(45, 55, 67, 89));
	}

}
class ClgStudent{
	
	public int total(int tamil,int english,int maths,int science) {
		int total=tamil+english+science+maths;
		
		return total;
		}
	public String average(int tamil,int english,int maths,int science) {
		int average=(tamil+english+maths+science)/4;
		return "Average"+average;
	}
}