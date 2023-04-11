package day2_java;

public class UseEmployee {
	public static void main(String[] args) {
		
//		first instance.......
		Employee employee1=new Employee();
		
		employee1.empId=01;
		employee1.empName="Suresh.P";
		employee1.empAge=35;
		employee1.empDateOFBirth="07/02/1997";
		employee1.empSalary=15000;
		employee1.empHeight=5.5f;
		employee1.empweight=78.5f;
		
		System.out.println("Id : "+employee1.empId+"\nEmployee Name :"+employee1.empName+"\nAge : "+employee1.empAge+"\nDate Of Birth : "+employee1.empDateOFBirth+"\nSalary : "+employee1.empSalary+"\nHeight : "+employee1.empHeight+"\nWeight : "+employee1.empweight);
		
		
//		second instance........
		Employee employee2 =new Employee();
		employee2.empId=12;
		employee2.empName="Mani.P";
		employee2.empAge=29;
		employee2.empDateOFBirth="20/04/1993";
		employee2.empSalary=18000;
		employee2.empHeight=6.2f;
		employee2.empweight=92.1f;
		
		System.out.println("\nId : "+employee2.empId+"\nEmployee Name : "+employee2.empName+"\nAge : "+employee2.empAge+"\nDate Of Birth : "+employee2.empDateOFBirth+"\nSalary : "+employee2.empSalary+"\nHeight : "+employee2.empHeight+"\nWeight : "+employee2.empweight);
		
//		third instance......
		Employee employee3=new Employee();
		
		employee3.empId=10;
		employee3.empName="Sangeetha.S";
		employee3.empAge=24;
		employee3.empDateOFBirth="02/10/1995";
		employee3.empSalary=220000;
		employee3.empHeight=5.4f;
		employee3.empweight=58.8f;
		
		System.out.println("\nId : "+employee3.empId+"\nEmployee Name : "+employee3.empName+"\nAge : "+employee3.empAge+"\nDate Of Birth : "+employee3.empDateOFBirth+"\nSalary : "+employee3.empSalary+"\nHeight : "+employee3.empHeight+"\nWeight :"+employee3.empHeight);
		
		
		
		
		
	}

}
