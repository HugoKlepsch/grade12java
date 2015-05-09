/*
		 Title: Employee.java
		 Programmer: hugo
		 Date of creation: Apr 13, 2015
		 Description: 
 */

package employeeManagement;

/**
 * @author hugo
 *@Description A class to hold employee data
 */
public class Employee {

	static int minSalary = 600;
	static int maxSalary = 9000;
	double fairSalaryExponent = Math.sqrt((Math.log(minSalary)) / (Math.log(maxSalary))); // used for fair distribution
																							// of salaries. ("fair" as
																							// in most of the salaries
																							// awarded are in the low
																							// end of the bell curve)
	static int maxEmployees = 10000;
	static int employeesAdded = 0;
	String name;
	long idCode;
	private static long[] idCodeArray = new long[maxEmployees];
	String department;
	String location;
	double salary;

	/**
	 * @param name Name of employee
	 * @param idCode Input IDCode from -2 ^ 63 to 2 ^ 63. Please don't cause a hash ID collision. 
	 * @param Department Department the employee resides
	 * @param location Which store location the employee works at
	 * @param salary Salary in dollars and cents
	 */
	public Employee(String name, long idCode, String departement, String location, double salary, boolean fromSubClass) {
		this.name = name;
		this.idCode = idCode; // assume the user inputed a valid id (please)
		this.department = departement;
		this.location = location;
		this.salary = salary;
		if (!fromSubClass) {
			employeesAdded++;
		}

	}

	/**
	 * @param name Name of employee
	 * @param departement Department the employee resides
	 * @param location Which store location the employee works at
	 */
	public Employee(String name, String departement, String location, boolean fromSubClass) {
		this.name = name;
		boolean keepGoing;
		do {
			this.idCode = (long) (Math.random() * Long.MAX_VALUE);
			keepGoing = linearSearch(idCode);
		} while (keepGoing);

		addID(idCode);

		this.department = departement;
		this.location = location;
		this.salary = Math.pow(maxSalary,
				(Math.pow((Math.random() * (1 - fairSalaryExponent)) + fairSalaryExponent, 2)));// spooky magic math
																								// that theoretically
																								// has a higher chance
																								// of assigning a lower
																								// salary
		if (!fromSubClass) {

			employeesAdded++;
		}
	}

	/**
	 * @return the minSalary in dollars
	 * @Note: The current minimum salary used to calculate auto-generated salries
	 */
	public static int getMinSalary() {
		return minSalary;
	}

	/**
	 * @param minSalary the minSalary to set in dollars
	 * @Note: This does not change already assigned salaries, and only affects the low end of the bell curve used to calculate further salaries
	 */
	public static void setMinSalary(int minSalary) {
		Employee.minSalary = minSalary;
	}

	/**
	 * @return the maxSalary
	 */
	public static int getMaxSalary() {
		return maxSalary;
	}

	/**
	 * @param maxSalary the maxSalary to set
	 */
	public static void setMaxSalary(int maxSalary) {
		Employee.maxSalary = maxSalary;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
		 * @author hugo
		 * @Date Apr 10, 2015 
		 * @param: the idCode to search for 
		 * @return: boolean true false whether the idCOde is in the array
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */
	private boolean linearSearch(long idCode) {

		for (int i = 0; i < idCodeArray.length; i++) {
			if (idCodeArray[i] == idCode) {
				return true;
			}
		}
		return false;
	}

	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: IDCode to add
		 * @return: none
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */
	private void addID(long idCode) {
		// long[] idCodeArrayTemp = new long[(idCodeArray.length) + 1];
		// for (int i = 0; i < idCodeArray.length; i++) {
		// idCodeArrayTemp[i] = idCodeArray[i];
		// }
		// idCodeArray = idCodeArrayTemp;
		// idCodeArray[idCodeArray.length - 1] = idCode;
		idCodeArray[employeesAdded] = idCode;

//		bubbleSortIDList();
	}

//	/**
//		 * @author hugo
//		 * Date of creation: Apr 10, 2015 
//		 * @param: None
//		 * @return: None
//		 * @Description: ( ͡° ͜ʖ ͡°)
//		 */
//	private void bubbleSortIDList() {
//		boolean keepGoing = false; // by default assume it's sorted
//		int arrayLen = idCodeArray.length; // if we store the length here, it doesn't need to be accessed every time the
//											// for loop runs
//		do {
//			keepGoing = false; // default it to think it's sorted
//			for (int i = 1; i < arrayLen; i++) { // start at one so that you don't access index (zero - one)
//				long a = idCodeArray[i]; // values to compare against each other. index i vs the index previous
//				long b = idCodeArray[i - 1];
//				if (a > b) { // if it's not sorted (should be descending order
//					long temp = b; // swap the variables
//					idCodeArray[i - 1] = a;
//					idCodeArray[i] = temp;
//					keepGoing = true; // make it run it again
//				}
//			}
//		} while (keepGoing);
//
//	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the idCode
	 */
	public long getIdCode() {
		return idCode;
	}

	/**
	 * @param idCode the idCode to set
	 */
	public void setIdCode(long idCode) {
		this.idCode = idCode;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the employeesAdded
	 */
	public static int getEmployeesAdded() {
		return employeesAdded;
	}

	/**
	 * @param employeesAdded the employeesAdded to set
	 */
	public static void setEmployeesAdded(int employeesAdded) {
		Employee.employeesAdded = employeesAdded;
	}

	/**
	 * @return the idCodeArray
	 */
	public static long[] getIdCodeArray() {
		return idCodeArray;
	}

	@Override
	public String toString() {
		return "\nEmployee: \n" + (name != null ? "name: " + name + "\n" : "") + "idCode: " + idCode + "\n"
				+ (department != null ? "departement: " + department + "\n" : "")
				+ (location != null ? "location: " + location + "\n" : "") + "salary: $" + String.valueOf(salary)
				+ " / month \n \n ";
	}

}
