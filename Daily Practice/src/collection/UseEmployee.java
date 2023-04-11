package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;


public class UseEmployee {
	public static void main(String []args) {
		Employee ep1=new Employee(1,"suresh",23,2,"back End developer","male",18000);
		Employee ep2=new Employee(2,"suriya",25,5,"back End developer","male",45000);
		Employee ep3=new Employee(3,"nisha",23,2,"front End developer","Female",15000);
		Employee ep4=new Employee(4,"kaviya",23,3,"back End developer","Female",22000);
		Employee ep5=new Employee(5,"suresh",23,6,"frond End developer","male",50000);
		Employee ep6=new Employee(6,"priya",23,5,"frond End developer","Female",57000);
		Employee ep7=new Employee(7,"priyadharsini",23,7,"frond End developer","Female",55000);
		Employee ep8=new Employee(8,"rajesh",23,8,"frond End developer","male",60000);
		
		HashMap<Integer, Employee> employeeDetails=new HashMap<>();
		 
		
		employeeDetails.put(ep1.getId(), ep1);
		employeeDetails.put(ep2.getId(), ep2);
		employeeDetails.put(ep3.getId(), ep3);
		employeeDetails.put(ep4.getId(), ep4);
		employeeDetails.put(ep5.getId(), ep5);
		employeeDetails.put(ep6.getId(), ep6);
		employeeDetails.put(ep7.getId(), ep7);
		employeeDetails.put(ep8.getId(), ep8);
		
//		int max=0;
//		for(Employee emp1:employeeDetails.values()) 	
//		{
//			if(emp1.getExprience()<=5) {
//				if(emp1.getSalary()>max) {
//					max=emp1.getSalary();
//				}
//			}
//		}
//		System.out.println("maximum :"+max);
//		
//		
		
		
//		Iterator <Employee> det=employeeDetails.values().iterator();
//		while(det.hasNext()) {
//			if(det.next().getExprience()>5) {
//				det.remove();
//			}																																																																													
//		}
//		 
//		//
//		
//		employeeDetails.keySet().forEach(y ->System.out.println(employeeDetails.get(y)));
	
		Optional<Employee>max1=employeeDetails.values().stream().max((x,y)->x.getSalary()-y.getSalary());	
		System.out.println(max1);
		
		Optional MAX2=employeeDetails.values().stream().map(x-> x.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findAny();
		System.out.println("third value :"+MAX2);
		
		
	
//		ArrayList<Employee> employeeDel=new ArrayList<>();
//		employeeDel.add(ep1);
//		employeeDel.add(ep2);
//		employeeDel.add(ep3);
//		employeeDel.add(ep4);
//		employeeDel.add(ep5);
//		employeeDel.add(ep6);
//		employeeDel.add(ep7);
//		employeeDel.add(ep8);
//		
//		ArrayList<Employee> femaleDel=new ArrayList<>();
//		for(Employee var:employeeDel) {
//			if(var.getGender().equalsIgnoreCase("female")) {
//				femaleDel.add(var);
//			}
//		}
//		for(Employee female:femaleDel) {
//			System.out.println(female);
//		}
	}

}
