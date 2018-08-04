package employee;

// program to calculate the salary details and print the salary information of the employee
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		String Name;
		double monthlyBasics;
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		// input name of employee
		System.out.println("Enter employee name");
		Name = sc.nextLine();
		employee.setName(Name);

		// input monthly basic of an employee
		System.out.println("Enter employee's monthly Basic");
		monthlyBasics = sc.nextDouble();
		employee.setMonthlyBasic(monthlyBasics);

		// print the salary details of an employee
		System.out.println("Salary details of an employee are:");
		System.out.println("Empolyee ID:" + employee.getId());
		System.out.println("Employee Name:" + employee.getName());
		System.out.println("Monthly Basic:" + employee.getMonthlyBasic());
		System.out.println("Annual BAsic:" + employee.getAnnualBasic());
		System.out.println("monthlyGross Salary:" + employee.getMonthlyGrossSalary());
		System.out.println("Annual Gross Salary:" + employee.getAnnualGrossSalary());
		System.out.println("Monthly Deduction:" + employee.getMonthlyDeduction());
		System.out.println("Monthly TAke Home:" + employee.getMonthlyTakeHome());
		System.out.println("Annual Take Home:" + employee.getAnnualTakeHome());
		System.out.println("pf:" + employee.getPf());
	}
}
