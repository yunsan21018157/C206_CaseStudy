import java.util.ArrayList;

public class ManageTeacher {
	
	
	private static final int OPTION_ADD = 4;
	private static final int OPTION_VIEW = 5;
	private static final int OPTION_DELETE =6;
	private static final int OPTION_QUIT = 7;
	public static void main(String[] args) {

		ArrayList<Teacher> teacherList = new ArrayList<Teacher>();

		teacherList.add(new Teacher("Jack", "Male", "jack@email.com","Diploma","Math"));

		int option = 0;

		while (option != OPTION_QUIT) {

			ManageTeacher.menuManager();
			option = Helper.readInt("Enter an option > ");

			if (option == OPTION_VIEW) {
				// View all items
				ManageTeacher.viewAllTeacher(teacherList);

			} else if (option == OPTION_ADD) {
				// Add a new item
				ManageTeacher.setHeader("ADD"); {
					Teacher t = addTeacher();
					ManageTeacher.addTeacher(TeacherList, t);
					System.out.println("Teacher");


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
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	
	
	
	public static Teacher addTeacher() {
		String name = Helper.readString("Enter name > ");
		String gender = Helper.readString("Enter gender > ");
		String email = Helper.readString("Enter email > ");
		String qualification = Helper.readString("Enter teacher qualification > ");
		String subjectGroup = Helper.readString("Enter teacher subject group >");
	
		Teacher teacher = new Teacher(name, gender, email, qualification, subjectGroup);
		return teacher;
	}

	public static void addChromebook(ArrayList<Chromebook> chromebookList, Chromebook cb) {

		chromebookList.add(cb);
		
	}
}
