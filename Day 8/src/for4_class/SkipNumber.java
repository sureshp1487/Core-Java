package for4_class;

public class SkipNumber {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				continue;
			}else if(i==96) {
				continue;
			}
			System.out.println(i);
		}
	}

}
