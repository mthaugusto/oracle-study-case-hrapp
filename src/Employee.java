
public class Employee {
	private int id;
	private String name;
	private double salary;
		
	public Employee(int number, String name, double salary) {
		super();
		this.id = number;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	
	public void setNumber(int id) {
		this.id = id;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee - " +
				"id: " + getId() +
				", name: " + getName() +
				", salary: " + getSalary();
	}
}
