package com.chainsys.miniproject.entry;

import java.util.Scanner;

import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;
import com.chainsys.miniproject.ui.AppointmentsUi;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

public class Startup {
	public static void main(String args[]) {
		loadMenu();
	}

	private static void loadMenu() {
		System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				loadEmployeeMenu();
				break;
			case 2:
				loadDoctorMenu();
				break;
			case 3:
				loadAppointmentMenu();
				break;
			}
		} finally {
			sc.close();
		}
	}

	private static void loadEmployeeMenu() {
		System.out.println(
				"Enter Employee Method : 1=addEmployee, 2=getEmployeeById ,3=upadateEmployee ,4=updateEmployeeFirstName, 5=updateEmployeeSalary, 6=deleteEmployee, 7=getAllEmployeeDetails");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();

			switch (call) {
			case 1:
				EmployeeUi.addNewEmployee();
				break;

			//case 2:
				//EmployeeUi.getEmployeeById();
				//break;
			case 3:
				EmployeeUi.updateEmpDetails();
				break;
			case 4:
				EmployeeUi.ViewAllEmployeeDetails();
				break;
			case 5:
				EmployeeUi.viewEmployeeDetails();
				break;
			//case 6:
				//EmployeeUi.updateEmpDetails();
				//break;
			//case 7:
				//EmployeeUi.getAllEmployeesDetails();
				//break;
			}
		} finally {
			sc.close();
		}
	}

	private static void loadDoctorMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for add doctor information");
		System.out.println("press 2 for update doctor detail");
		System.out.println("press 3 for delete doctor detail");
		System.out.println("press 4 for view doctor detail by using doctor id");
		System.out.println("press 5 for view all doctor detail");
		try {
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				DoctorUi.addNewDoctor();
				break;
			case 2:
				DoctorUi.updateDoctor();
				break;
			case 3:
				DoctorUi.deleteDoctor();
				break;
			//case 4:
			//	DoctorUi.viewDoctorsDetailsById();
				//break;
			//case 5:
				//DoctorUi.viewAllDoctorsDetails();
				//break;
			default:
				System.out.println("Enter the value between 1 to 5");
			}

		} finally {
			sc.close();
		}
	}

	private static void loadAppointmentMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for add new appointment");
		System.out.println("press 2 for see the appointment details");
		System.out.println("press 3 for see all appointments detail");
		System.out.println("press 4 for update appointment details");
		System.out.println("press 5 for delete appointment detail");
		System.out.println("press 6 for update patient by appointment id");
		System.out.println("press 7 for update collected fees");
		try {
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				AppointmentsUi.addNewAppointments();
				break;
			case 2:
				AppointmentsUi.viewAppointmentDetails();
				break;
			case 3:
				AppointmentsUi.allAppointmentDetails();
				break;
			case 4:
				AppointmentsUi.updateAppDetails();
				break;
			case 5:
				AppointmentsUi.deleteAppointmentDetails();
				break;
			//case 6:
				//AppointmentsUi.updatePatientName();
				//break;
			//case 7:
			//	AppointmentsUi.updateCollectedfees();
			//	break;
			default:
				System.out.println("enter the number 7 and below");
			}
		} finally {
			sc.close();
		}
	}

}