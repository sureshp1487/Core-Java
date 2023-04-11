package interview;

public class No7 {
	public static void main(String[] args) {
		String a="a1b2c3";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='a' && a.charAt(i)<='z') {
				System.out.println(a.charAt(i));
			}
			else {
				int s=a.charAt(i)-48;
			for(int j=1;j<s;j++) {
					System.out.println(a.charAt(i));
				}
			}
		}
	}

}
