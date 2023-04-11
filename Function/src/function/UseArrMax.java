package function;

public class UseArrMax {
	public static void main(String[] args) {
		ArrMax am=new ArrMax();
		System.out.println(am.total());
		System.out.println(am.maxLen());
	}

}
class ArrMax{
	int num[]= {2,4,5,5};
	String name[]= {"suresh","sangeetha","mani"};
	
	public String total() {
		int total=0;
		for(int i=0;i<num.length;i++) {
			total=total+num[i];
		}
		return "total:"+total;
	}
	
	public String maxLen() {
		String name1=name[2];
		for(int i=0;i<name.length;i++) {
			if(name[i].length()>name1.length()) {
				name1=name[i];
			}
		}
		return "Big String:"+name1;
		
	}
	
	}
