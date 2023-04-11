package for2Class;

public class Exam {
	public static void main(String[] args) {
		int []marks= {25,56,78,63,54};
		for(int i=marks.length-1;i>=marks.length/2;i--) {
			System.out.println(marks[i]);
		}
	}

}
