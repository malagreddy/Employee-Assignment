package employee;

public class Employee {
	// instance members
	private final int id = 420;
	private String name;
	private double monthlyBasic;
	double MonthlyGrossSalary;
	double MonthlyDeduction;
	double MonthlyTakeHome;
	static double pf;

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	// set monthly basic
	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}

	// calculate AnnualBasic
	public double getAnnualBasic() {
		double annualBasic = monthlyBasic * 12;
		return annualBasic;
	}

	// calculate MonthlyGrossSalary
	public double getMonthlyGrossSalary() {
		double hra = monthlyBasic * 0.5;
		double medical = 1250, conveyance = 800;
		MonthlyGrossSalary = monthlyBasic + medical + conveyance + hra;
		return MonthlyGrossSalary;
	}

	// calculate AnnualGrossSalary
	public double getAnnualGrossSalary() {
		double AnnualGrossSalary = MonthlyGrossSalary * 12;
		return AnnualGrossSalary;
	}

	// calculate MonthlyDeduction
	public double getMonthlyDeduction() {
		double pf, esic, proftax;
		if (monthlyBasic > 6500) {
			pf = monthlyBasic * .1;
		} else {
			pf = 6500;
		}
		if (monthlyBasic <= 5000) {
			esic = 4.75 * monthlyBasic;
		} else {
			esic = 0;
		}
		if (monthlyBasic <= 10000) {
			proftax = 50;
		} else {
			proftax = 100;
		}
		MonthlyDeduction = pf + esic + proftax;
		return MonthlyDeduction;
	}

	// calculate MonthlyTakeHome
	public double getMonthlyTakeHome() {
		MonthlyTakeHome = MonthlyGrossSalary - MonthlyDeduction;
		return MonthlyTakeHome;
	}

	// calculate AnnualTakeHome
	public double getAnnualTakeHome() {
		double AnnualTakeHome = MonthlyTakeHome * 12;
		return AnnualTakeHome;
	}

	public static double getPf() {
		return pf;
	}

	public static void setPf(double pf) {
		Employee.pf = pf;
	}
}
