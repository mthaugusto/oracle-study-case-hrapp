
public class HRApp {

	public static void main(String[] args) {
		
		// Starting the application.
		System.out.println("HRApp is starting.");
		
		// Creating a new department
		Department dep1 = new Department("IT Support Department");
		
		// Calling toString() to print information about the Department.
		System.out.println(dep1);
		
		// Create a few Employees and add them to the Department
		Employee empregado1 = new Employee(1, "Matheus Leite", 3600.00);
		Employee empregado2 = new Employee(2, "Ana Souza", 4500.00);
        Employee empregado3 = new Employee(3, "Pedro Oliveira", 3800.00);
        Employee empregado4 = new Employee(4, "Mariana Santos", 4200.00);
        Employee empregado5 = new Employee(5, "Lucas Pereira", 4700.00);
        Employee empregado6 = new Employee(6, "Gabriela Lima", 3900.00);
        Employee empregado7 = new Employee(7, "Carlos Rodrigues", 4100.00);
        Employee empregado8 = new Employee(8, "Juliana Costa", 4800.00);
        Employee empregado9 = new Employee(9, "Fernando Almeida", 4300.00);
        Employee empregado10 = new Employee(10, "Isabela Oliveira", 4600.00);
        Employee empregado11 = new Employee(11, "Rafael Martins", 5000.00);
		
		// Adding and testing if I can only add 10 Employees.
        dep1.addEmployee(empregado1);
        dep1.addEmployee(empregado2);
        dep1.addEmployee(empregado3);
        dep1.addEmployee(empregado4);
        dep1.addEmployee(empregado5);
        dep1.addEmployee(empregado6);
        dep1.addEmployee(empregado7);
        dep1.addEmployee(empregado8);
        dep1.addEmployee(empregado9);
        dep1.addEmployee(empregado10);
        dep1.addEmployee(empregado11);

        // Counting the employee in the department
        System.out.println("Total employee in this department = " + dep1.empCounter());
        
        // Locate an employee by their ID Number and call toString() to print the information about this Employee
        System.out.println(dep1.getEmployeeById(3));
        
        // Print every employee information
        dep1.getEmployees();
        
        // Print the total salary of the Department
        System.out.println("Total salary: " + dep1.totalSalary());
        
        // Print the average salary of the Department
        System.out.println("Average Salary: " + dep1.averageSalary());

	}

}
