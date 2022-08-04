import java.util.ArrayList;

public class TuitionManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Registration> registrationList = new ArrayList<Registration>();
		ArrayList<TuitionTimetable> tuitionTimetableList = new ArrayList<TuitionTimetable>();
		ArrayList<Tuition> tuitionList = new ArrayList<Tuition>();

		//dummy records
		tuitionList.add(new Tuition("E01B", "Grammar Practice", "English", "Master your grammar", "1 hour", "Basic Level"));
		tuitionList.add(new Tuition("E02A", "Vocabulary", "English", "Train your vocabulary", "1 hour", "Advanced Level"));
		
		tuitionTimetableList.add(new TuitionTimetable(1, 180.0, "01/01/2022", "01/03/2022", "Online"));
		tuitionTimetableList.add(new TuitionTimetable(2, 180.0, "01/04/2022", "01/07/2022", "F2F"));
		
		registrationList.add(new Registration(1, 1, "student1@gmail.com", "01/03/2022"));
		registrationList.add(new Registration(2, 2, "student2@gmail.com", "01/03/2022"));
		
		//code
		role();
		int role = Helper.readInt("Enter role index: ");
		System.out.println("------------------------------");
		
		int studentChoice = 0;
		int managerChoice = 0;
		int adminChoice = 0;
		
		while (role != 4) {
			if (role == 1) {
				menuStudent();
				studentChoice = Helper.readInt("Enter your choice: ");
				System.out.println("------------------------------");
				while (studentChoice != 6) {
					if () { 
						
					}
					else if studentChoice == 4) {
						registerTuiton(registrationList);
						menuStudent();
						studentChoice = Helper.readInt("Enter your choice: ");
						System.out.println("------------------------------");
					} else if (studentChoice == 5) {
						viewRegisterTuiton(registrationList);
						menuStudent();
						studentChoice = Helper.readInt("Enter your choice: ");
						System.out.println("------------------------------");
					}	else if (studentChoice == 6) {
						deleteRegisterTuiton(registrationList);
						menuStudent();
						studentChoice = Helper.readInt("Enter your choice: ");
						System.out.println("------------------------------");
					}
				}
			} else if (role == 2) {
				menuManager();
				managerChoice = Helper.readInt("Enter your choice: ");
				System.out.println("------------------------------");
				while (managerChoice != 7) {
					if (managerChoice == 1) {
						addTuitionTimetable(tuitionTimetableList);
						
						menuManager();
						managerChoice = Helper.readInt("Enter your choice: ");
						System.out.println("------------------------------");
					} else if (managerChoice == 2) {
						viewTuitionTimetable(tuitionTimetableList);
						menuManager();
						managerChoice = Helper.readInt("Enter your choice: ");
						System.out.println("------------------------------");
					} else if (managerChoice == 3) {
						deleteTuitionTimetable(tuitionTimetableList);
						menuManager();
						managerChoice = Helper.readInt("Enter your choice: ");
						System.out.println("------------------------------");
					} else if (managerChoice == 4) {
						
					} else if (managerChoice == 5) {
						
					} else if (managerChoice == 6) {
						
					} else {
						managerChoice = Helper.readInt("Invalid choice, Enter your choice again: ");
					}
				} System.out.println("Account Logged out.");
				System.out.println("------------------------------");
				role();
				role = Helper.readInt("Enter role index: ");
			} else if (role == 3) {
				menuAdmin();
				adminChoice = Helper.readInt("Enter your choice: ");
			} else if (role == 4) {
				System.out.println("Program Ended.");
			} else {
				role = Helper.readInt("Invalid Index, enter role index again: ");
			}
		}
	}
	
	public static void role() {
		System.out.println("1 - Student");
		System.out.println("2 - Manager");
		System.out.println("3 - Admin");
		System.out.println("4 - Quit program");
		System.out.println("------------------------------");
	}
	
	public static void menuStudent() {
		System.out.println("1 - Register Student Account");
		System.out.println("2 - View Student Account");
		System.out.println("3 - Register for Tuition");
		System.out.println("4 - View Tuition Registration");
		System.out.println("5 - Delete Tuition registration");
		System.out.println("6 - Log Out");
		System.out.println("------------------------------");
	}
	
	public static void menuManager() {
		System.out.println("1 - Add Tuition Timetable");
		System.out.println("2 - View Tuition Timetable");
		System.out.println("3 - Delete Tuition Timetable");
		System.out.println("4 - Add Teacher");
		System.out.println("5 - View Teacher");
		System.out.println("6 - Delete Teacher");
		System.out.println("7 - Log Out");
		System.out.println("------------------------------");
	}
	
	public static void menuAdmin() {
		System.out.println("1 - Register Student Account");
		System.out.println("2 - Delete Student Account");
		System.out.println("3 - Add Tuition Information");
		System.out.println("4 - View Tuition Information");
		System.out.println("5 - Delete Tuition Information");
		System.out.println("6 - Log Out");
		System.out.println("------------------------------");
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}


	//================================= Option 1 Add student (menuStudent()) AHMAD ====================================
	public static Student inputStudentDetails() {
		String sName = Helper.readString("Enter Student Name > ");
		char sGender = Helper.readChar("Enter Gender (M/F) > ");
		String sEmail = Helper.readString("Enter Email > ");
		String sDOB = Helper.readString("Enter date of birth > ");
		String sCountry = Helper.readString("Enter which country you live in > ");
		String sInterest = Helper.readString("Enter the subject you are interested in > ");
	
		Student student = new Student(sName, sGender, sEmail, sDOB, sCountry, sInterest);
		return student;
		//test1
	}
	public static void addStudentDetails(ArrayList<Student> studentDetailsList, Student student) {
		studentDetailsList.add(student);
	}
	
	//================================= Option 2 View student (menuStudent()) AHMAD ====================================
	public static String retrieveAllStudent(ArrayList<Student> studentDetailsList) {
		String output = "";
		
		for (int i = 0; i < studentDetailsList.size(); i++) {
			output += String.format("$-84s\n", studentDetailsList.get(i).toString());
		}
		return output;
	}
	
	public static void viewAllStudentDetails(ArrayList<Student> studentDetailsList) {
		TuitionManagement.setHeader("STUDENT DETAILS LIST");
		String output = String.format("%-30s %-10S %-10s %-30s %-10s %-10s", "STUDENT NAME", "GENDER", "EMAIL", "DATE OF BIRTH", "COUNTRY", "SUBJECT");
		output += retrieveAllStudent(studentDetailsList);
		System.out.println(output);
	}
	//================================= Option 3 Delete student (menuAdmin()) AHMAD ==================================
	public static void deleteStudentDetails(ArrayList<Student> studentDetailsList) {
		
		String delStudent = Helper.readString("Enter the student name you want to delete: ");
		
		for (int i = 0; i < studentDetailsList.size(); i++) {
			String delName = studentDetailsList.get(i).getName();
			if (delStudent == delName) {
				studentDetailsList.remove(i);
				System.out.println("Student removed.");
				System.out.println("------------------------------");
			} else {
				continue;
			}
		}
	}
	
	//================================= Option 4 Register tuition (menuStudent()) YIXUN ==================================
	
	public static void registerTuiton(ArrayList<Registration> registrationList) {
		
		int regId = Helper.readInt("Enter registration ID > ");
		int ttId = Helper.readInt("Enter tuition timetable ID > ");
		String sEmail = Helper.readString("Enter student email > ");
		String date = Helper.readString("Enter date > ");
		
		registrationList.add(new Registration(regId, ttId, sEmail, date));
		
		System.out.println("You have registered for this timetable.");
		System.out.println("------------------------------");
		
	}
	
	
	//================================= Option 5 View tuition registration (menuStudent()) YIXUN ==================================
	
	public static void viewRegisterTuiton(ArrayList<Registration> registrationList){
		
		for (int i = 0; i < registrationList.size(); i++) {
			System.out.println("Registration ID: " + registrationList.get(i).getRegId());
			System.out.println("Tuition Timetable ID: " + registrationList.get(i).getTTId());
			System.out.println("Student Email: " + registrationList.get(i).getSEmail());
			System.out.println("Registration Status: " + registrationList.get(i).getStatus());
			System.out.println("Registration Date: " + registrationList.get(i).getDate());
			System.out.println("--------------------------------------------------");
		}
	}
	
	//================================= Option 6 Delete tuition registration (menuStudent()) YIXUN ==================================
	
	public static void deleteRegisterTuiton(ArrayList<Registration> registrationList){
		
		int del_ttID = Helper.readInt("Enter the tuition timetable ID you want to delete: ");
		
		for (int i = 0; i < registrationList.size(); i++) {
			int ttID = registrationList.get(i).getRegId();
			if (ttID == del_ttID) {
				registrationList.remove(i);
				System.out.println("Registration removed.");
				System.out.println("------------------------------");
			} else {
				continue;
			}
		}
	}
	
	
    //================================= Option 1 Add tuition timetable (menuManager()) JOSEPH =================================
	public static void addTuitionTimetable(ArrayList<TuitionTimetable> tuitionTimetableList) {
		
		int ttID = Helper.readInt("Enter tuition timetable ID: ");
		double price = Helper.readDouble("Enter tuition price: ");
		String start_date = Helper.readString("Enter tuition starting date: ");
		String end_date = Helper.readString("Enter tuition ending date: ");
		String mode = Helper.readString("Enter tuition mode (Online/Mixed/FTF): ");
		
		tuitionTimetableList.add(new TuitionTimetable(ttID, price, start_date, end_date, mode));
		
		System.out.println("Timetable has been added.");
		System.out.println("------------------------------");
	}
	
	//================================= Option 2 View tuition timetable (menuManager()) JOSEPH =================================
	public static void viewTuitionTimetable(ArrayList<TuitionTimetable> tuitionTimetableList) {
			
		for (int i = 0; i < tuitionTimetableList.size(); i++) {
			System.out.println("Tuition Timetable ID: " + tuitionTimetableList.get(i).getTtId());
			System.out.println("Tuition Timetable Price: " + tuitionTimetableList.get(i).getPrice());
			System.out.println("Tuition Timetable Starting Date: " + tuitionTimetableList.get(i).getStart_date());
			System.out.println("Tuition Timetable Ending Date: " + tuitionTimetableList.get(i).getEnd_date());
			System.out.println("Tuition Timetable Mode: " + tuitionTimetableList.get(i).getMode());
			System.out.println("--------------------------------------------------");
		}
	}
	
	//================================= Option 3 Delete tuition timetable (menuManager()) JOSEPH =================================
	public static void deleteTuitionTimetable(ArrayList<TuitionTimetable> tuitionTimetableList) {
		
		int del_ttID = Helper.readInt("Enter the tuition timetable ID you want to delete: ");
		
		for (int i = 0; i < tuitionTimetableList.size(); i++) {
			int ttID = tuitionTimetableList.get(i).getTtId();
			if (ttID == del_ttID) {
				tuitionTimetableList.remove(i);
				System.out.println("Timetable removed.");
				System.out.println("------------------------------");
			} else {
				continue;
			}
		}
	}
	
	//================================= Option 4 Add teacher (menuManager()) JAYDEN =================================
	public static Teacher addTeacher() {
		String name = Helper.readString("Enter name > ");
		String gender = Helper.readString("Enter gender > ");
		String email = Helper.readString("Enter email > ");
		String qualification = Helper.readString("Enter teacher qualification > ");
		String subjectGroup = Helper.readString("Enter teacher subject group >");
	
		Teacher teacher = new Teacher(name, gender, email, qualification, subjectGroup);
		return teacher;
	}
	
	public static void addTeacher(ArrayList<Teacher> teacherList, Teacher teacher) {
		teacherList.add(teacher);
	}

	//================================= Option 5 View teacher (menuManager()) JAYDEN  =================================
	public static String retrieveAllTeacher(ArrayList<Teacher> teacherList) {
		String output = "";

		for (int i = 0; i < teacherList.size(); i++) {

			output += String.format("%-84s\n", teacherList.get(i).toString());
		}
		return output;
	}
	public static void viewAllTeachers(ArrayList<Teacher> teacherList) {
		String teacherInfo = String.format("%-10s %-10s %-10s %-10s %-10s","name","gender","email","qualification","subjectGroup");
		 String output = retrieveAllTeacher(teacherList);	
		System.out.println(output);
	}
		
	//================================= Option 6 Delete teacher (menuManager()) JAYDEN =================================
	public static void deleteTeacher(ArrayList<Teacher> teacherList) {
		
		String delTeacher = Helper.readString("Enter the teacher name you want to delete: ");
		
		for (int i = 0; i < teacherList.size(); i++) {
			String delName = teacherList.get(i).getName();
			if (delTeacher == delName) {
				teacherList.remove(i);
				System.out.println("Teacher removed.");
				System.out.println("------------------------------");
			} else {
				continue;
			}
		}
	}
	
	
	//================================= Option 1 Register student acc (menuAdmin()) //same as student =================================
	
	
	//================================= Option 2 Add tuition info (menuAdmin()) YUNSAN =================================
	public static Tuition inputTuition() {
		String code = Helper.readString("Enter tuition code > ");
		String title = Helper.readString("Enter tuition title > ");
		String name = Helper.readString("Enter subject group name > ");
		String desc = Helper.readString("Enter tuition description > ");
		String duration = Helper.readString("Enter tuition duration > ");
		String preRequisite = Helper.readString("Enter pre-requisite (Basic/ Advanced) > ");
		
		
		
		Tuition tuition = new Tuition(code, title, name, desc, duration, preRequisite);
		
		
			
		return tuition;
	}
	
	public static void addTuition(ArrayList<Tuition> tuitionList, Tuition tuition) {
			
		tuitionList.add(tuition);
			
	}

	//================================= Option 3 View tuition info (menuAdmin()) YUNSAN =================================
	public static String retrieveTuition(ArrayList<Tuition> tuitionList) {
		String output = "";
	
		for (int i = 0; i < tuitionList.size(); i++) {
	
			output += String.format("%-84s\n", tuitionList.get(i).toString());
		}
		return output;
	}
	
	public static void viewTuition(ArrayList<Tuition> tuitionList) {
		TuitionManagement.setHeader("TUITION LIST");
		String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "CODE", "TITLE",
				"NAME", "DESCRIPTION","DURATION", "PRE-REQUISITE");
		 output += retrieveTuition(tuitionList);	
		System.out.println(output);
	}

	//================================= Option 4 Delete tuition info (menuAdmin()) YUNSAN =================================
	public static boolean doDeleteTuition(ArrayList<Tuition> tuitionList, String tag) {
		boolean isDeleted = false;

		for (int i = 0; i < tuitionList.size(); i++) {
			String code = tuitionList.get(i).getCode();
//			if (code == ) {
//				tuitionList.get(i).setIsAvailable(false);
//				camcorderList.get(i).setDueDate("");
				isDeleted = true;
				
			}
		return isDeleted;
		
	}

	public static void deleteTuition(ArrayList<Tuition> tuitionList) {
		TuitionManagement.viewTuition(tuitionList);
		String code = Helper.readString("Enter tuition code > ");
		Boolean isDeleted = doDeleteTuition(tuitionList, code);
		
		if (isDeleted == false) {
			System.out.println("Invalid asset tag");
		} else {
			System.out.println("Tuition " + code + " deleted");
		}
	}

		
	//================================= Option 5 QUIT  ==================================
}