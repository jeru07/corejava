package com.chainsys.miniproject.ui;


	import java.util.Calendar;
	import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employee;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class DoctorUi {
	public static void addNewDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			
			   try 
			   {
		            Validator.checkNumberForParseInt(id);
		        }catch(InvalidInputDataException err) 
			   {
		            err.printStackTrace();
		        }
			   int Doc_id=Integer.parseInt(id);
			   try 
			   {
		            Validator.CheckNumberForGreaterThanZero(Doc_id);
		        }catch(InvalidInputDataException err) 
			   {
		            err.printStackTrace();
		        }
			   newdoc.setDOC_ID(Doc_id);
			System.out.println("Enter Name :");
			String name=sc.nextLine();
			 try {
		            Validator.checkStringOnly(name);
		        }catch(InvalidInputDataException err) {
		            err.printStackTrace();
		        }
			 newdoc.setDOC_NAME(name);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = new java.util.Date();
			newdoc.setDOB(newDate);
			System.out.println("Enter Speciality :");
			String spe=sc.nextLine();
			try {
	            Validator.checkStringOnly(spe);
	        }catch(InvalidInputDataException err) {
	            err.printStackTrace();
	        }
		 newdoc.setSPECIALITY(spe);
			System.out.println("Enter City :");
			String city=sc.nextLine();
			try {
	            Validator.checkStringOnly(city);
	        }catch(InvalidInputDataException err) {
	            err.printStackTrace();
	        }
		     newdoc.setCITY(city);
			System.out.println("Enter Phone_Number");
			newdoc.setPHONE_NO(sc.nextLong());
			System.out.println("Enter Standard_Fees :");
			float fees = sc.nextFloat();
			try {
				Validator.checkStringForGreaterThanZero1(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setFEES(fees);
			int result = DoctorDao.insertDoctor(newdoc);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			//newdoc.setDOC_ID(sc.nextLine());
			try {
				Validator.checkNumberForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setDOC_ID(docId);
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDOC_ID(docId);
			System.out.println("Enter Update Name :");
			String name = sc.nextLine();
			try {
				Validator.checkStringOnly(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setDOC_NAME(name);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = new java.util.Date();
			newdoc.setDOB(newDate);
			System.out.println("Enter Update Speciality :");
			String sp = sc.nextLine();
			try {
				Validator.checkStringOnly(sp);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setSPECIALITY(sp);
			// newdoc.setSpeciality(sc.nextLine());
			System.out.println("Enter Update City :");
			String cy = sc.nextLine();
			try {
				Validator.checkStringOnly(cy);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setCITY(cy);
			System.out.println("Enter Update Phone_Number");
			newdoc.setPHONE_NO(sc.nextLong());
			System.out.println("Enter Update Standard_Fees :");
			float fees = sc.nextFloat();
			try {
				Validator.checkStringForGreaterThanZero1(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setFEES(fees);
			int result = DoctorDao.updateDoctor(newdoc);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateDoctorFirstName() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkNumberForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setDOC_ID(docId);
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDOC_ID(docId);
			System.out.println("Enter Update Name :");
			String name = sc.nextLine();
			try {
				Validator.checkStringOnly(name);
				
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setDOC_NAME(name);
			int result = DoctorDao.updateDoctorFirstName(docId, name);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateDoctorFees() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkNumberForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			newdoc.setDOC_ID(docId);
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setDOC_ID(docId);
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDOC_ID(docId);
			System.out.println("Enter Update Fees :");
			float fees = sc.nextFloat();
			try {
				Validator.checkStringForGreaterThanZero1(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setFEES(fees);
			int result = DoctorDao.updateDoctorSalary(Integer.parseInt(id), fees);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void deleteDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkNumberForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setDOC_ID(docId);
			Doctor doc = DoctorDao.getDoctorById(docId);

			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDOC_ID(docId);
			int result = DoctorDao.deleteDoctor(Integer.parseInt(id));
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void getDoctorById() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkNumberForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			newdoc.setDOC_ID(docId);
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDOC_ID(docId);
			Doctor result = DoctorDao.getDoctorById(Integer.parseInt(id));
			System.out.println(result.getDOC_ID() + " " + result.getDOC_NAME() + " " + result.getDOB() + " "
					+ result.getSPECIALITY() + " " + result.getCITY() + " " + result.getPHONE_NO() + " "
					+ result.getFEES());
		} finally {
			sc.close();
		}
	}

	public static void getAllDoctorDetails() {
		List<Doctor> allDoctor = DoctorDao.getAllDoctor();
		Iterator<Doctor> drIterator = allDoctor.iterator();
		while (drIterator.hasNext()) {
			Doctor dr = drIterator.next();
			System.out.println(dr.getDOC_ID() + " " + dr.getDOC_NAME() + " " + dr.getDOB() + " " + dr.getSPECIALITY()
					+ " " + dr.getCITY() + " " + dr.getPHONE_NO() + " " + dr.getFEES());
		}
	}
}
