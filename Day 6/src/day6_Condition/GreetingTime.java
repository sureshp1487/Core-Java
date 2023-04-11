package day6_Condition;

public class GreetingTime {
	public static void main(String[] args) {
		int time=24;
		
		if(time>=6 && time<=11)
		{
			System.out.println("good mor");
		}
		
		else if(time>=12 && time<=17)
		{
			System.out.println("good after");
		}
		
		else if(time>=18&& time<=20) 
		{
			System.out.println("ge");	
		}
		
		else if(time>=21&&time<=24)
		{
			System.out.println("gn");
		}
		
		else 
		{
			System.out.println("Invalid Time");
		}
	}

}
