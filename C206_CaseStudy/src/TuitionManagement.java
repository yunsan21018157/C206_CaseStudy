import java.util.ArrayList;

public class TuitionManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<TuitionTimetable> tuitionTimetableList = new ArrayList<TuitionTimetable>();
		ArrayList<Tuition> tuitionList = new ArrayList<Tuition>();

		//dummy records
		tuitionList.add(new Tuition("E01B", "Grammar Practice", "English", "Master your grammar", "1 hour", "Basic Level"));
		tuitionList.add(new Tuition("E02A", "Vocabulary", "English", "Train your vocabulary", "1 hour", "Advanced Level"));
		
		tuitionTimetableList.add(new TuitionTimetable(1, 180.0, "01/01/2022", "01/03/2022", "Online"));
		tuitionTimetableList.add(new TuitionTimetable(2, 180.0, "01/04/2022", "01/07/2022", "F2F"));
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
		System.out.println("6 - Quit program");
		System.out.println("------------------------------");
	}
	
	public static void menuManager() {
		System.out.println("1 - Add Tuition Timetable");
		System.out.println("2 - View Tuition Timetable");
		System.out.println("3 - Delete Tuition Timetable");
		System.out.println("4 - Add Teacher");
		System.out.println("5 - View Teacher");
		System.out.println("6 - Delete Teacher");
		System.out.println("7 - Quit program");
		System.out.println("------------------------------");
	}
	
	public static void menuAdmin() {
		System.out.println("1 - Register Student Account");
		System.out.println("2 - Delete Student Account");
		System.out.println("3 - Add Tuition Information");
		System.out.println("4 - View Tuition Information");
		System.out.println("5 - Delete Tuition Information");
		System.out.println("6 - Quit program");
		System.out.println("------------------------------");
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	
	//================================= Option 1 Add student (menuStudent()) AHMAD ====================================
	
	
	//================================= Option 2 View student (menuStudent()) AHMAD ====================================
	
	
	//================================= Option 3 Delete student (menuAdmin()) AHMAD ==================================
	
	
	//================================= Option 4 Register tuition (menuStudent()) YIXUN ==================================
	
	public static TuitionTimetable registerTuiton() {
		
		String regId = Helper.readString("Enter registration ID > ");
		String ttId = Helper.readString("Enter tuition timetable ID > ");
		String email = Helper.readString("Enter student email > ");
		String date = Helper.readString("Enter date > ");
		
		TuitionTimetable tuitionTT = new Tuition(regId, ttId, email, date);
		return tuitionTT;
	}
	
	public static void addTuitionTimeTable(ArrayList<TuitionTimetable> tuitionList, Tuition tuition) {
			
		tuitionList.add(tuition);
			
	}
}
	
	//================================= Option 5 View tuition registration (menuStudent()) YIXUN ==================================
	
	
	//================================= Option 6 Delete tuition registration (menuStudent()) YIXUN ==================================
	
	
	//================================= Option 1 Add tuition timetable (menuManager()) JOSEPH =================================
	public static ArrayList<managerTimetable> addTimetable() {
		setTtId(Helper.readInt"");
		private double price;
		private String start_date;
		private String end_date;
		private String mode;
	}
		
	
	//================================= Option 2 View tuition timetable (menuManager()) JOSEPH =================================
	
	
	//================================= Option 3 Delete tuition timetable (menuManager()) JOSEPH =================================
	
	
	//================================= Option 4 Add teacher (menuManager()) JAYDEN =================================
	
	
	//================================= Option 5 View teacher (menuManager()) JAYDEN  =================================
	
	
	//================================= Option 6 Delete teacher (menuManager()) JAYDEN =================================
	
	
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
		
		//for (int i = 0; i < tuitionList.size(); i++) {
			
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

		
	//================================= Option 5 QUIT  =================================
}