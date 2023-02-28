package empapp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		String name;
		
		 EmployeeInterface employeeInterface=new EmployeeImpl();
		
		System.out.println("Welcome to Employee management System ");
		System.out.println("**************************************");
		
		do {
			System.out.println("\n1.Add employee\n"
					+ "2.Show all employees\n"
					+ "3.Show all employees based on id\n"
					+ "4.Update employee\n"
					+ "5.Delete employee\n"
					+ "6.Exit\n");
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your choice:");
			int ch=scanner.nextInt();
			
			switch(ch){
				
			case 1:
				Employee emp=new Employee();
				
				System.out.println("Enter id:");
				 id=scanner.nextInt();
				System.out.println("Enter name:");
				 name=scanner.next();
				System.out.println("Enter salary:");
				double salary=scanner.nextDouble();
				System.out.println("Enter age:");
				int age=scanner.nextInt();
				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				emp.setAge(age);
				employeeInterface.createEmployee(emp);
				break; 
				
			case 2:
				employeeInterface.showAllEmployee();
				break;
				
			case 3:
				System.out.println("Enter id to show employee details:");
				int empid=scanner.nextInt();
				employeeInterface.showEmployeeBasedOnId(empid);//eid is column in employee table
				break;
				
			case 4:
				System.out.println("Enter id to update employee details:");
				int empid1=scanner.nextInt();
				System.out.println("Enter the new name");
				name=scanner.next();
				employeeInterface.updateEmployee(empid1, name);
				break;
				
			case 5:
				System.out.println("Enter id to delete employee details:");
				id=scanner.nextInt();
				employeeInterface.deleteEmployee(id);
				break;
				
			case 6:
				System.out.println("Thank you");
				System.exit(0);
				
				default:System.out.println("Please enter valid choice !");
				break;
			
			}
			
		}while(true);
		
	}

}
