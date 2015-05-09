/*
		 Title: Worker.java
		 Programmer: hugo
		 Date of creation: Apr 13, 2015
		 Description: 
 */

package employeeManagement;

/**
 * @author hugo
 *
 */
public class Worker extends Employee {
	double hoursWorked = 0;
	double wage;
	public static int workersAdded;

	/**
	 * @param name
	 * @param idCode
	 * @param departement
	 * @param location
	 * @param salary
	 */
	public Worker(String name, long idCode, String departement, String location, double salary, double hoursWorked,
			double wage) {
		super(name, idCode, departement, location, salary, true);
		this.hoursWorked = hoursWorked;
		this.wage = wage;
		workersAdded++;
	}

	/**
	 * @param name
	 * @param departement
	 * @param location
	 */
	public Worker(String name, String departement, String location, double hoursWorked, double wage) {
		super(name, departement, location, true);
		this.hoursWorked = hoursWorked;
		this.wage = wage;
		workersAdded++;
	}

	/**
	 * @return the hoursWorked
	 */
	public double getHoursWorked() {
		return hoursWorked;
	}

	/**
	 * @param hoursWorked the hoursWorked to set
	 */
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	/**
	 * @return the wage
	 */
	public double getWage() {
		return wage;
	}

	/**
	 * @param wage the wage to set
	 */
	public void setWage(double wage) {
		this.wage = wage;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return wage * hoursWorked;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nWorker: \n" + (name != null ? "Name: " + name + "\n" : "") + "idCode: " + idCode + "\n"
				+ (department != null ? "Department: " + department + "\n" : "")
				+ (location != null ? "Location: " + location + "\n" : "") + "Hourly wage: " + wage + "\n"
				+ "Hours Worked: " + hoursWorked + "\n" + "Salary: $" + getSalary() + "\n";
	}

}
