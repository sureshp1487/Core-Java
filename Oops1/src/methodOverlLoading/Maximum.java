package methodOverlLoading;

public class Maximum {
	public String findMaximum(int num1,int num2) {
		if(num1>num2) {
			return num1+": is geater";
		}else {
			return num2+" num 2 is geater";
		}
	}
	public String findMaximum(int num1,int num2,int num3) {
		if(num1>num2 &&num1>num3) {
			return "num1 is geater ";
		}else if(num2>num1 && num2>num3){
			return "num2 is geater";
		}else {
			return "num3 is geater";
		}
	}
	public String findMaximum(String name1,String name2) {
		String maxStr="";
		if(name1.length()>name2.length()) {
			return maxStr=name1;
		}else {
			return maxStr=name2;
		}
	}

}
