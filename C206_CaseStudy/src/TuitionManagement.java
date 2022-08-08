import java.util.ArrayList;

public class TuitionManagement {

	public static void main(String[] args) {
		
		// ArrayList
		ArrayList<Registration> registrationList = new ArrayList<Registration>();
		ArrayList<managerTimetable> tuitionTimetableList = new ArrayList<managerTimetable>();
		ArrayList<Tuition> tuitionList = new ArrayList<Tuition>();
		ArrayList<ManageTeacher> teacherList = new ArrayList<ManageTeacher>();
		ArrayList<Student> studentDetailsList = new ArrayList<Student>();

		// Existing Records
		tuitionList.add(new Tuition("E01B", "Grammar Practice", "English", "Master your grammar", "1 hour", "Basic Level"));
		tuitionList.add(new Tuition("E02A", "Vocabulary", "English", "Train your vocabulary", "1 hour", "Advanced Level"));
		
		tuitionTimetableList.add(new managerTimetable("1", "180.0", "01/01/2022", "01/03/2022", "Online"));
		tuitionTimetableList.add(new managerTimetable("2", "180.0", "01/04/2022", "01/07/2022", "F2F"));
		
		registrationList.add(new Registration("1", "1", "student1@gmail.com", "01/03/2022"));
		registrationList.add(new Registration("2", "2", "student2@gmail.com", "01/03/2022"));
		
		studentDetailsList.add(new Student("John Doe", 'M', "student1@gmail.com", "10/01/2000", "Singapore", "Mathematics"));
		studentDetailsList.add(new Student("Jane Dane", 'F', "student2@gmail.com", "01/10/2000", "Singapore", "Humanities"));	
		
		teacherList.add(new ManageTeacher("Jack", "Male", "jack@email.com","Diploma","Math"));
		teacherList.add(new ManageTeacher("Erf", "Male", "erf@email.com","Diploma","Math"));

		// Main Code Body
		// Role Display
		role();
		int role = Helper.readInt("Enter role index: ");
		System.out.println("------------------------------");
		
		int studentChoice = 0;
		int managerChoice = 0;
		int adminChoice = 0;
		
		// Choices
		while (role != 4) {
			
			// Role = Student
			if (role == 1) {
				menuStudent();
				studentChoice = Helper.readInt("Enter your choice: ");
				line();
				while (studentChoice != 6) {
					if (studentChoice == 1) {                                   // > addStudent Option <
						addStudentDetails(studentDetailsList, null);
						menuStudent();
						studentChoice = Helper.readInt("Enter your choice: ");
						line();
					} else if (studentChoice == 2) {                            // > viewStudent Option <
						retrieveAllStudent(studentDetailsList);
						menuStudent();
						studentChoice = Helper.readInt("Enter your choice: ");
						line();
					} else if (studentChoice == 3) {                            // > registerForTuition Option <
						registerTuition(registrationList);
						menuStudent();
						studentChoice = Helper.readInt("Enter your choice: ");
						line();
					} else if (studentChoice == 4) {                            // > addRegisteredTuition Option <
						viewRegisterTuition(registrationList);
						menuStudent();
						studentChoice = Helper.readInt("Enter your choice: ");
						line();
					}	else if (studentChoice == 5) {                          // > deleteRegisteredTuition Option <
						deleteRegisterTuition(registrationList);
						menuStudent();
						studentChoice = Helper.readInt("Enter your choice: ");
						line();
					} else {
						managerChoice = Helper.readInt("Invalid choice, Enter your choice again: ");
					}
				} System.out.println("Account Logged Out.");                    // > Account Logging Out <
				line();
				role();
				role = Helper.readInt("Enter role index: ");
				
			// Role = Manager	
			} else if (role == 2) {
				menuManager();
				managerChoice = Helper.readInt("Enter your choice: ");
				line();
				while (managerChoice != 4) {
					if (managerChoice == 1) {                                   // > addTeacher Option <
						addTeacher(teacherList);
						menuManager();
						managerChoice = Helper.readInt("Enter your choice: ");
						line();
					} else if (managerChoice == 2) {                            // > viewTeacher Option <
						retrieveAllTeacher(teacherList);
						menuManager();
						managerChoice = Helper.readInt("Enter your choice: ");
						line();
					} else if (managerChoice == 3) {                            // > deleteTeacher Option <
						deleteTeacher(teacherList);
						menuManager();
						managerChoice = Helper.readInt("Enter your choice: ");
						line();
					} else {
						managerChoice = Helper.readInt("Invalid choice, Enter your choice again: ");
					}
				} System.out.println("Account Logged Out.");                    // > Account Logging Out <
				line();
				role();
				role = Helper.readInt("Enter role index: ");
				
			// Role = Admin
			} else if (role == 3) {                                              
				menuAdmin();
				adminChoice = Helper.readInt("Enter your choice: ");
				line();
				while (adminChoice != 9) {
					if (adminChoice == 1) {                                     // > addStudent Option <
						addStudentDetails(studentDetailsList, null);
						menuAdmin();
						adminChoice = Helper.readInt("Enter your choice: ");
						line();
					} else if (adminChoice == 2) {                              // > deleteStudent Option <
						deleteStudentDetails(studentDetailsList);
						menuAdmin();
						adminChoice = Helper.readInt("Enter your choice: ");
						line();
					} else if (adminChoice == 3) {                              // > addTuitionInformation Option <
						addTuitionInformation(tuitionList);
						menuAdmin();
						adminChoice = Helper.readInt("Enter your choice: ");
						line();
					} else if (adminChoice == 4) {                              // > viewTuition Option <
						retrieveTuition(tuitionList);
						menuAdmin();
						adminChoice = Helper.readInt("Enter your choice: ");
						line();
					} else if (adminChoice == 5) {                              // > deleteTuition Option <
						deleteTuition(tuitionList);
						menuAdmin();
						adminChoice = Helper.readInt("Enter your choice: ");
						line();
					} else if (adminChoice == 6) {                              // > addTuitionTimetable Option <
						addTuitionTimetable(tuitionTimetableList);
						menuAdmin();
						adminChoice = Helper.readInt("Enter your choice: ");
						line();
					} else if (adminChoice == 7) {                              // > viewTuitionTimetable Option <
						viewTuitionTimetable(tuitionTimetableList);
						menuAdmin();
						adminChoice = Helper.readInt("Enter your choice: ");
						line();
					} else if (adminChoice == 8) {                              // > deleteTuitionTimetable Option <
						deleteTuitionTimetable(tuitionTimetableList);
						menuAdmin();
						adminChoice = Helper.readInt("Enter your choice: ");
						line();
					} else {
						adminChoice = Helper.readInt("Invalid option, enter option again: ");
						line();
					}
				} System.out.println("Account Logged out.");                    // > Account Logging Out <
				role();
				role = Helper.readInt("Enter role index: ");
				line();
			} else {
				role = Helper.readInt("Invalid Index, enter role index again: ");
				line();
			}
		} System.out.println("Program Ended.");
		line();
	}
	
	// Added title
	public static void role() {
		System.out.println("------------------------------");
		System.out.println("Tuition Management System");
		System.out.println("------------------------------");
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
		System.out.println("1 - Add Teacher");
		System.out.println("2 - View Teacher");
		System.out.println("3 - Delete Teacher");
		System.out.println("4 - Log Out");
		System.out.println("------------------------------");
	}
	
	public static void menuAdmin() {
		System.out.println("1 - Register Student Account");
		System.out.println("2 - Delete Student Account");
		System.out.println("3 - Add Tuition Information");
		System.out.println("4 - View Tuition Information");
		System.out.println("5 - Delete Tuition Information");
		System.out.println("6 - Add Tuition Timetable");
		System.out.println("7 - View Tuition Timetable");
		System.out.println("8 - Delete Tuition Timetable");
		System.out.println("9 - Log Out");
		System.out.println("------------------------------");
	}
	
	public static void line() {
		Helper.line(30, "-");
	}
	
	public static void setHeader(String header) {
		Helper.line(30, "-");
		System.out.println(header);
		Helper.line(30, "-");
	}

	// ============================== Option 1 Add student for menuStudent() AHMAD ==============================
	
	public static Student addStudentDetails() {
		String sName = Helper.readString("Enter Student Name > ");
		char sGender = Helper.readChar("Enter Gender (M/F) > ");
		String sEmail = Helper.readString("Enter Email > ");
		String sDOB = Helper.readString("Enter date of birth > ");
		String sCountry = Helper.readString("Enter which country you live in > ");
		String sInterest = Helper.readString("Enter the subject you are interested in > ");
	
		Student student = new Student(sName, sGender, sEmail, sDOB, sCountry, sInterest);
		return student;
	}
	public static void addStudentDetails(ArrayList<Student> studentDetailsList, Student student) {
		
		studentDetailsList.add(student);
	}

	
	// ============================== Option 2 View student for menuStudent() AHMAD ==============================
	
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
	
	// ============================== Option 2 Delete student for menuAdmin() AHMAD ==============================
	
	public static String deleteStudentDetails(ArrayList<Student> studentDetailsList) {
		TuitionManagement.retrieveAllStudent(studentDetailsList);
		
		String delStudent = Helper.readString("Enter the student name you want to delete: ");
		String delName = "";
		for (int i = 0; i < studentDetailsList.size(); i++) {
			delName += studentDetailsList.get(i).getName();
			if (delStudent == delName) {
				studentDetailsList.remove(i);
				System.out.println("Student removed.");
				System.out.println("------------------------------");
			} else {
				System.out.println("Invalid tuition code");
			}
		}
		return delStudent;
	}
	public static void deleteStudentDetails(ArrayList<Tuition> studentDetailsList, Student delName) {
		
		studentDetailsList.remove(delName);
	
	}
	
	// ============================== Option 3 Register tuition for menuStudent() YIXUN ==============================
	
	public static void registerTuition(ArrayList<Registration> registrationList) {
		
		String regId = Helper.readString("Enter registration ID > ");
		String ttId = Helper.readString("Enter tuition timetable ID > ");
		String sEmail = Helper.readString("Enter student email > ");
		String date = Helper.readString("Enter date > ");
		
		registrationList.add(new Registration(regId, ttId, sEmail, date));
		
		System.out.println("You have registered for this timetable.");
		System.out.println("------------------------------");
		
	}
	
	// ============================== Option 4 View tuition registration for menuStudent() YIXUN ==============================
	
	public static void viewRegisterTuition(ArrayList<Registration> registrationList){
		String output = "";
		String regId = "";
		String ttId = "";
		String sEmail = "";
		String status = "";
		String date = "";
		
		
		//title will be set once
		output = String.format("%-10s %-20s %-15s %-25s %-20s %-10s\n", "REGISTRATION ID", "TUITION ID",
				"STUDENT EMAIL", "STATUS", "DATE"); 
		
		for (int i = 0; i < registrationList.size(); i++) {
			regId = registrationList.get(i).getRegId();
			ttId = registrationList.get(i).getTTId();
			sEmail = registrationList.get(i).getSEmail();
			status = registrationList.get(i).getStatus();
			date = registrationList.get(i).getDate();
		
			
			output += String.format("%-10s %-20s %-15s %-25s %-20s %-10s\n", regId, ttId, sEmail, status, date);
		}
		System.out.println(output);
	}
	
	// ============================== Option 5 Delete tuition registration for menuStudent() YIXUN ==============================
	
	public static void deleteRegisterTuition(ArrayList<Registration> registrationList){
		
		int del_ttID = Helper.readInt("Enter the tuition timetable ID you want to delete: ");
		
		for (int i = 0; i < registrationList.size(); i++) {
			String ttID = registrationList.get(i).getRegId();
			if (ttID.equals(del_ttID)) {
				registrationList.remove(i);
				System.out.println("Registration removed.");
				System.out.println("------------------------------");
			} else {
				continue;
			}
		}
	}
	
    // ============================== Option 6 Add tuition timetable for menuAdmin() JOSEPH ==============================
	
	public static void addTuitionTimetable(ArrayList<managerTimetable> tuitionTimetableList) {
		
		TuitionManagement.viewTuitionTimetable(tuitionTimetableList);
		
		String ttId = Helper.readString("Enter tuition timetable ID: ");
		String price = Helper.readString("Enter tuition price: ");
		String start_date = Helper.readString("Enter tuition starting date: ");
		String end_date = Helper.readString("Enter tuition ending date: ");
		String mode = Helper.readString("Enter tuition mode (Online/Mixed/FTF): ");
		
		tuitionTimetableList.add(new managerTimetable(ttId, price, start_date, end_date, mode));
		
		System.out.println("------------------------------");
		System.out.println("Timetable has been added.");
		System.out.println("------------------------------");
	}
	
	// ============================== Option 7 View tuition timetable for menuAdmin() JOSEPH ==============================
	
	public static void viewTuitionTimetable(ArrayList<managerTimetable> tuitionTimetableList) {
				
		String output = "";
		String ttId = "";
		String price = "";
		String start_date = "";
		String end_date = "";
		String mode = "";
		
		
		//title will be set once
		output = String.format("%-10s %-20s %-15s %-25s %-20s %-10s\n", "TUITION ID", "PRICE",
				"START DATE", "END DATE", "MODE"); 
		
		for (int i = 0; i < tuitionTimetableList.size(); i++) {
			ttId = tuitionTimetableList.get(i).getTtId();
			price = tuitionTimetableList.get(i).getPrice();
			start_date = tuitionTimetableList.get(i).getStart_date();
			end_date = tuitionTimetableList.get(i).getEnd_date();
			mode = tuitionTimetableList.get(i).getMode();
		
			
			output += String.format("%-10s %-20s %-15s %-25s %-20s %-10s\n", ttId, price, start_date, end_date, mode);
		}
		System.out.println(output);
	}
		
	// ============================== Option 8 Delete tuition timetable for menuAdmin() JOSEPH ==============================
	
	public static void deleteTuitionTimetable(ArrayList<managerTimetable> tuitionTimetableList) {
		
		TuitionManagement.viewTuitionTimetable(tuitionTimetableList);
		
		String del_ttID = Helper.readString("Enter the tuition timetable ID you want to delete: ");
		
		for (int i = 0; i < tuitionTimetableList.size(); i++) {
			String ttID = tuitionTimetableList.get(i).getTtId();
			if (ttID == del_ttID) {
				tuitionTimetableList.remove(i);
				System.out.println("------------------------------");
				System.out.println("Timetable removed.");
				System.out.println("------------------------------");
				break;
			} else {
				continue;
			}
		}
	}
	
	// ============================== Option 1 Add teacher for menuManager() JAYDEN ==============================
	
	public static void addTeacher(ArrayList<ManageTeacher> teacherList) {
		String name = Helper.readString("Enter name > ");
		String gender = Helper.readString("Enter gender > ");
		String email = Helper.readString("Enter email > ");
		String qualification = Helper.readString("Enter teacher qualification > ");
		String subjectGroup = Helper.readString("Enter teacher subject group >");
	
		teacherList.add(new ManageTeacher(name, gender, email, qualification, subjectGroup));
	}
	
	public static void addTeacher(ArrayList<ManageTeacher> teacherList, ManageTeacher teacher) {
		teacherList.add(teacher);
		
		System.out.println("------------------------------");
		System.out.println("Teacher has been added.");
		System.out.println("------------------------------");
	}

	// ============================== Option 2 View teacher for menuManager() JAYDEN  ==============================
	
	public static void retrieveAllTeacher(ArrayList<ManageTeacher> teacherList) {
		String output = "";
		String name = "";
		String gender = "";
		String email = "";
		String qualification = "";
		String subjectGroup = "";
		
		
		//title will be set once
		output = String.format("%-10s %-20s %-15s %-25s %-20s %-10s\n", "NAME", "GENDER",
				"EMAIL", "QUALIFICATION", "SUBJECT GROUP"); 
		
		for (int i = 0; i < teacherList.size(); i++) {
			name = teacherList.get(i).getName();
			gender = teacherList.get(i).getGender();
			email = teacherList.get(i).getEmail();
			qualification = teacherList.get(i).getEmail();
			subjectGroup = teacherList.get(i).getSubjectGroup();
		
			
			output += String.format("%-10s %-20s %-15s %-25s %-20s %-10s\n", name, gender, email, qualification, subjectGroup);
		}
		System.out.println(output);
	}
	
	// ============================== Option 3 Delete teacher for menuManager() JAYDEN ==============================
	
	public static void deleteTeacher(ArrayList<ManageTeacher> teacherList) {
		
		String delTeacher = Helper.readString("Enter the teacher name you want to delete: ");
		
		for (int i = 0; i < teacherList.size(); i++) {
			String delName = teacherList.get(i).getName();
			if (delTeacher.equals(delName)) {
				teacherList.remove(i);
				System.out.println("------------------------------");
				System.out.println("Teacher removed.");
				System.out.println("------------------------------");
			} else {
				continue;
			}
		}
	}
	
	// ============================== Option 3 Add tuition info for menuAdmin() YUNSAN ==============================
	
	public static void addTuitionInformation(ArrayList<Tuition> tuitionList) {
		
		TuitionManagement.retrieveTuition(tuitionList); //print list
		
		String code = Helper.readString("Enter tuition code > ");
		String title = Helper.readString("Enter tuition title > ");
		String name = Helper.readString("Enter subject group name > ");
		String desc = Helper.readString("Enter tuition description > ");
		String duration = Helper.readString("Enter tuition duration > ");
		String preRequisite = Helper.readString("Enter pre-requisite (Basic/ Advanced) > ");
		
		tuitionList.add(new Tuition(code, title, name, desc, duration, preRequisite));
		
		System.out.println("------------------------------");
		System.out.println("Successfully added Tuition");
		System.out.println("------------------------------");
	}

	
	// ============================== Option 4 View tuition info for menuAdmin() YUNSAN ==============================
	
		public static void retrieveTuition(ArrayList<Tuition> tuitionList) {
			String output = "";
			String code = "";
			String title = "";
			String name = "";
			String desc = "";
			String duration = "";
			String pre_req = "";
			
			//title will be set once
			output = String.format("%-10s %-20s %-15s %-25s %-20s %-10s\n", "CODE", "TITLE",
					"NAME", "DESCRIPTION", "DURATION", "PRE-REQUISITE"); 
			
			for (int i = 0; i < tuitionList.size(); i++) {
				code = tuitionList.get(i).getCode();
				title = tuitionList.get(i).getTitle();
				name = tuitionList.get(i).getName();
				desc = tuitionList.get(i).getDesc();
				duration = tuitionList.get(i).getDuration();
				pre_req = tuitionList.get(i).getPreRequisite();
			
				
				output += String.format("%-10s %-20s %-15s %-25s %-20s %-10s\n", code, title, name, desc, duration, pre_req);
			}
			System.out.println(output);
		
	}


		// ============================== Option 5 Delete tuition info for menuAdmin() YUNSAN ==============================
		
		public static String deleteTuition(ArrayList<Tuition> tuitionList) {
			
			TuitionManagement.retrieveTuition(tuitionList); //print list
			
			String delCode = Helper.readString("Enter tuition code to delete > ");
			
			String code = "";
			
			for (int i = 0; i < tuitionList.size(); i++) {
				 code = tuitionList.get(i).getCode();
				if (code.equals(delCode)) {
					tuitionList.remove(i);
					System.out.println("------------------------------");
					System.out.println("Tuition " + delCode + " deleted");
					System.out.println("------------------------------");
				
					break;
				} else {
					System.out.println("------------------------------");
					System.out.println("Invalid tuition code");
					System.out.println("------------------------------");
				}
			
			}
			return code;	
		}
			
		public static void deleteTuition(ArrayList<Tuition> tuitionList, Tuition tuition) {
			
				tuitionList.remove(tuition);
			
				}
			}



