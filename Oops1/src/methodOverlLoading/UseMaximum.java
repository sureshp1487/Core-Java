package methodOverlLoading;

public class UseMaximum {
	public static void main(String[] args) {
		Maximum ma=new Maximum();
		System.out.println(ma.findMaximum("sureshkumar","manikan"));
		System.out.println(ma.findMaximum(45,67));
		System.out.println(ma.findMaximum(12,98,506));
	}

}
