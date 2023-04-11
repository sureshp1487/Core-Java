package day2_java;

public class UseStudentAverage {
	public static void main(String[] args) {
		StudentAverage average1= new StudentAverage();
		 
		average1.name="mani.P";
		average1.tamil=100;
		average1.english=100;
		average1.maths=100;
		average1.social=100;
		average1.science=100;
		
		average1.average=(average1.tamil+average1.english+average1.maths+average1.science+average1.social)/5;
		
		System.out.println("Student Average :"+average1.average);
		
		StudentAverage average2 =new StudentAverage();
		
		average2.name="Suresh";
		average2.tamil=87;
		average2.english=58;
		average2.maths=98;
		average2.social=87;
		average2.science=45;
		
		average2.average=(average2.tamil+average2.english+average2.maths+average2.social+average2.science)/5;
		
		System.out.println("Student Average :"+average2.average);
	}

}
