
public class Department {
	
	private String depName;
	private int indexEmployee = 0;
	Employee[] emps = new Employee[10];

	public Department(String depName) {
		super();
		this.depName = depName;
	}
	
	public String getDepName() {
		return depName;
	}
	
	public void setDepName(String depName) {
		this.depName = depName;
	}
	
	public void addEmployee(Employee emp) {
		if (indexEmployee < emps.length) {
			System.out.println(indexEmployee);
			emps[indexEmployee] = emp;
			indexEmployee++;
		} else {
			System.out.println("Department is at full capacity, cannot add more employees.");
		}
	}
	
    public void getEmployees() {        
        for(Employee emp : emps) {
            if(emp!=null) {
                System.out.println(emp);
            }
        }
    }
    
    public int empCounter() {
    	return indexEmployee;
    }
    
    public Employee getEmployeeById(int empId) {
    	for (Employee emp : emps) 
    		if (emp != null && emp.getId() == empId) {
    			return emp;
    		}
    	return null;
    	}
    
    
    public double totalSalary() {
    	double totalSalary = 0;
    	
    	for(Employee emp : emps) {
            if(emp!=null) {
                totalSalary += emp.getSalary();
            }
        }
    	
    	return totalSalary;
    }
    
    public double averageSalary() {
    	double averageSalary = 0;
    	
    	if (indexEmployee > 0) {
    		averageSalary = totalSalary() / indexEmployee;
    		return averageSalary;
    	} else {
    		return averageSalary;
    	}
    }
    
    @Override
    public String toString() {
    	return "Department name: " + getDepName();
    }
	
}
