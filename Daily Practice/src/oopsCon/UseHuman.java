package oopsCon;

public class UseHuman {
	public static void main(String[] args) {
		Address add=new Address() ;
		add.setAddressDel("no:05 Bhavani street, bharathi nagar");	
		
		Human h=new Human("suresh", 24, add);
		
		System.out.println("Name"+h.getName()+"\nAge"+h.getAge()+"\nAddresss"+add.getAddressDel());
	}

}
