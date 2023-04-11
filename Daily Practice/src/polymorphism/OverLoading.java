package polymorphism;

public class OverLoading {
	
	public void add(int num,int num1) {
		System.out.println(num+num1) ;
	}
	public float add(int num,float num1) {
		return num+num1;
	}
	
	public String add(String name,float height,int weight) {
		return "name :"+name+"\nheight :"+height+"\nweight :"+weight;
		
	}

}
