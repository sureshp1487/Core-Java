package StringProblem;

public class Split {
	public static void main(String[] args) {
		String name="suresh/mani$pravin-sure";
		
		String name1[]=name.split("[/$-]+");
		
		
		for(int i=0;i<name1.length;i++) {
			System.out.println(name1[i]);
		}
		
	}}


