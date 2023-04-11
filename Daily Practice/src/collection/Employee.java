package collection;

public class Employee {
	private int id;
	private String name;
	private int age;
	private int exprience;
	private String roles;
	private String gender;
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setExprience(int exprience) {
		this.exprience = exprience;
	}

	public int getExprience() {
		return exprience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(int id, String name, int age, int exprience, String roles, String gender, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.exprience = exprience;
		this.roles = roles;
		this.gender = gender;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", Name=" + name + ", Age=" + age + ", Exprience=" + exprience + ", Roles=" + roles
				+ ", Gender=" + gender+", Salary="+salary;
	}

}
