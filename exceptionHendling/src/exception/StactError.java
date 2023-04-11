package exception;

public class StactError {
	
		public static void funa() {
			funb();
		}
		public static void funb() {
			funa();
		}
		public static void main(String[] args) {
		
		funa();
	}

}
