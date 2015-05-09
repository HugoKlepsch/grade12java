/*
		 Title: EMS.java
		 Programmer: hugo
		 Date of creation: Apr 13, 2015
		 Description: Employee management Software
 */

package employeeManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hugo
 * @Name Employee management Software
 *
 */
public class EMS {
	static Employee[] emDatabase = new Employee[Employee.maxEmployees];
	static Worker[] wDatabase = new Worker[Employee.maxEmployees];
	static BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));

	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
	 * @throws IOException 
		 * @Description: dongers
		 */
	public static void main(String[] args) throws IOException {
		boolean keepGoing = true;

		while (keepGoing) {
			String userIn;
			System.out.println("Do you want to add a employee / worker or tools? (e / w / t / exit) ");
			userIn = inStream.readLine();
			if (userIn.equalsIgnoreCase("w")) {
				addWorker();
			} else if (userIn.equalsIgnoreCase("e")) {
				addEmp();
			} else if (userIn.equalsIgnoreCase("exit")) {
				System.out.println("\n");
				keepGoing = false;
			} else if (userIn.equalsIgnoreCase("t")) {
				toolMode();
			} else {
				System.out.println("invalid, exiting... (crashing on purpose LOL");
				keepGoing = false;
				String dank = null;
				Integer.parseInt(dank);
			}
		}
		for (int i = 0; i < Employee.employeesAdded; i++) {
			System.out.println(emDatabase[i].toString());
		}
		for (int i = 0; i < Worker.workersAdded; i++) {
			System.out.println(wDatabase[i].toString());
		}

	}

	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
	 * @throws IOException 
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */
	private static void addEmp() throws IOException {
		String luserIn;
		long idCode;
		String name;
		String departement;
		String location;
		double salary;

		System.out.println("Enter name: ");
		name = inStream.readLine();
		System.out.println("Enter location: ");
		location = inStream.readLine();
		System.out.println("Enter department: ");
		departement = inStream.readLine();
		System.out.println("Enter IDCode? (y if yes/n if auto-generate) ");
		luserIn = inStream.readLine();
		if (luserIn.equalsIgnoreCase("y")) {
			System.out.println("Enter IDCode: ");
			idCode = Long.parseLong(inStream.readLine());
			System.out.println("Enter monthly salary: (dollars) ");
			salary = Double.parseDouble(inStream.readLine());
			emDatabase[Employee.employeesAdded] = new Employee(name, idCode, departement, location, salary, false);
		} else {
			emDatabase[Employee.employeesAdded] = new Employee(name, departement, location, false);
		}
	}

	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */
	private static void addWorker() throws IOException {
		String luserIn;
		long idCode;
		String name;
		String departement;
		String location;
		double salary;

		double wage;
		double hoursWorked;

		System.out.println("Enter name: ");
		name = inStream.readLine();
		System.out.println("Enter location: ");
		location = inStream.readLine();
		System.out.println("Enter department: ");
		departement = inStream.readLine();

		System.out.println("Enter hourly wage: (dollars) ");
		wage = Double.parseDouble(inStream.readLine());
		System.out.println("Enter hours worked: ");
		hoursWorked = Double.parseDouble(inStream.readLine());

		System.out.println("Enter IDCode? (y if yes/n if auto-generate) ");
		luserIn = inStream.readLine();
		if (luserIn.equalsIgnoreCase("y")) {
			System.out.println("Enter IDCode: ");
			idCode = Long.parseLong(inStream.readLine());
			System.out.println("Enter monthly salary: (dollars) ");
			salary = Double.parseDouble(inStream.readLine());
			wDatabase[Worker.workersAdded] = new Worker(name, idCode, departement, location, salary, hoursWorked, wage);
		} else {
			wDatabase[Worker.workersAdded] = new Worker(name, departement, location, hoursWorked, wage);
		}
	}

	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
	 * @throws IOException 
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */

	private static void toolMode() throws IOException {
		boolean keepGoing = true;
		while (keepGoing) {
			String userIn;
			System.out.println("In tools mode. ");
			System.out.println("Search workers or employees? or exit?(w/e/exit) ");
			userIn = inStream.readLine();
			if (userIn.equalsIgnoreCase("exit")) {
				return;
			}
			boolean searchWorkers;
			if (userIn.equalsIgnoreCase("w")) {
				searchWorkers = true;
			} else {
				searchWorkers = false;
			}
			System.out.println("search by name or idcode? (n / i)");
			userIn = inStream.readLine();
			if (userIn.equalsIgnoreCase("n")) {
				System.out.println("Enter name to search for");
				String searchTerm = inStream.readLine();
				int index = searchName(searchTerm, searchWorkers);
				
				if (index == -1) {
					System.out.println("Not found! ");
				} else if (searchWorkers) {
					editMode(wDatabase[index]);
				} else {
					editMode(emDatabase[index]);
				}
				
				
			} else if (userIn.equalsIgnoreCase("i")) {
				System.out.println("Enter the idcode to search for");
				long searchTerm = Long.parseLong(inStream.readLine());
				int index = searchID(searchTerm, searchWorkers);
				if (index == -1) {
					System.out.println("Not found!");
				} else if (searchWorkers) {
					editMode(wDatabase[index]);
				} else {
					editMode(emDatabase[index]);
				}
				
				
				
			} else {
				System.out.println("invalid. Exiting.... (crashing on purpose)");
				String dank = null;
				Integer.parseInt(dank);
			}

		}
	}

	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
	 * @throws IOException when who knows
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */
	private static void editMode(Worker worker) throws IOException {
		System.out.println("Set department, hours worked, idCode, location, name, salary, wage, print info(d, h, i, l, n, s, w, p) ");
		String userIn = inStream.readLine();
		if (userIn.equalsIgnoreCase("d")) {
			
			System.out.println("Enter new departement: ");
			worker.setDepartment(inStream.readLine());
		} else if (userIn.equalsIgnoreCase("h")) {
			System.out.println("Enter Hours worked");
			worker.setHoursWorked(Double.parseDouble(inStream.readLine()));
		} else if (userIn.equalsIgnoreCase("i")) {
			System.out.println("Enter new ID code: (valid numbers only) ");
			worker.setIdCode(Long.parseLong(inStream.readLine()));
		} else if (userIn.equalsIgnoreCase("l")) {
			System.out.println("Enter new location: ");
			worker.setLocation(inStream.readLine());
		} else if (userIn.equalsIgnoreCase("n")) {
			System.out.println("Enter new name: ");
			worker.setName(inStream.readLine());
		} else if (userIn.equalsIgnoreCase("s")) {
			System.out.println("Enter new monthly salary: ");
			worker.setSalary(Double.parseDouble(inStream.readLine()));
		} else if (userIn.equalsIgnoreCase("w")) {
			System.out.println("Enter new wage: ");
			worker.setWage(Double.parseDouble(inStream.readLine()));
		} else if (userIn.equalsIgnoreCase("p")) {
			System.out.println(worker.toString());
			editMode(worker);
		} 
		else {
			System.out.println("Invalid, exiting. ");
		}
	}
	
	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: None
		 * @return: None
	 * @throws IOException 
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */
	private static void editMode(Employee emp) throws IOException {
		System.out.println("Set department, idCode, location, name, salary, print info(d, i, l, n, s, p) ");
		String userIn = inStream.readLine();
		if (userIn.equalsIgnoreCase("d")) {
			System.out.println("Enter new departement: ");
			emp.setDepartment(inStream.readLine());
		} else if (userIn.equalsIgnoreCase("i")) {
			System.out.println("Enter new ID code: (valid numbers only) ");
			emp.setIdCode(Long.parseLong(inStream.readLine()));
		} else if (userIn.equalsIgnoreCase("l")) {
			System.out.println("Enter new location: ");
			emp.setLocation(inStream.readLine());
		} else if (userIn.equalsIgnoreCase("n")) {
			System.out.println("Enter new name: ");
			emp.setName(inStream.readLine());
		} else if (userIn.equalsIgnoreCase("s")) {
			System.out.println("Enter new monthly salary: ");
			emp.setSalary(Double.parseDouble(inStream.readLine()));
		} else if (userIn.equalsIgnoreCase("p")) {
			System.out.println(emp.toString());
			editMode(emp);
			System.out.println("");
		} 
		else {
			System.out.println("Invalid, exiting. ");
		}

	}
	
	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: name to search
		 * @return: the index of the worked with the given name, -1 if not found
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */
	private static int searchName(String name, boolean searchWorkers) {
		if (searchWorkers) {
			for (int i = 0; i < Worker.workersAdded; i++) {
				if (wDatabase[i].getName().equalsIgnoreCase(name)) {
					return i;
				}
			}
			return -1;
		} else {
			for (int i = 0; i < Employee.employeesAdded; i++) {
				if (emDatabase[i].getName().equalsIgnoreCase(name)) {
					return i;
				}
			}
			return -1;
		}

	}

	/**
		 * @author hugo
		 * Date of creation: Apr 10, 2015 
		 * @param: id to search
		 * @return: the ind of the file with the igven id code, -1 if not ofund
		 * @Description: ( ͡° ͜ʖ ͡°)
		 */
	private static int searchID(long iD, boolean searchWorkers) {
		if (searchWorkers) {
			for (int i = 0; i < Worker.workersAdded; i++) {
				if ((wDatabase[i].getIdCode()) == iD) {
					return i;
				}
			}
			return -1;
		} else {
			for (int i = 0; i < Employee.employeesAdded; i++) {
				if ((emDatabase[i].getIdCode()) == iD) {
					return i;
				}
			}
			return -1;
		}

	}
}
