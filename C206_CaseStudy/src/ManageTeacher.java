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

			ManageTeacher.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == OPTION_VIEW) {
				// View all items
				ManageTeacher.viewAllTeacher(teacherList);

			} else if (option == OPTION_ADD) {
				// Add a new item
				ManageTeacher.setHeader("ADD");			
				itemTypeMenu();
				
				int teacherType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					Teacher t = inputTeacher();
					ManageTeacher.addTeacher(TeacherList, cc);
					System.out.println("Camcorder added");

				} else if (itemType == 2) {
					// Add Chromebook
					Chromebook cb = inputChromebook();
					ResourceCentre.addChromebook(chromebookList, cb);
					System.out.println("Chromebook added");

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == OPTION_LOAN) {
				// Loan item
				ResourceCentre.setHeader("LOAN");			
				itemTypeMenu();
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Loan camcorder
					ResourceCentre.loanCamcorder(camcorderList);
				} else if (itemType == 2) {
					// Loan Chromebook
					ResourceCentre.loanChromebook(chromebookList);
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == OPTION_RETURN) {
				// Return item
				ResourceCentre.setHeader("RETURN");				
				itemTypeMenu();
				
				int itemType = Helper.readInt("Enter option to select item type > ");
				if (itemType == 1) {
					// Return camcorder
					ResourceCentre.returnCamcorder(camcorderList);
				} else if (itemType == 2) {
					// Return Chromebook
					ResourceCentre.returnChromebook(chromebookList);
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == OPTION_QUIT) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}

	public static void itemTypeMenu() {
		ResourceCentre.setHeader("ITEM TYPES");
		System.out.println("1. Camcorder");
		System.out.println("2. Chromebook");
	}

	public static void menu() {
		ResourceCentre.setHeader("RESOURCE CENTRE APP");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Loan item");
		System.out.println("4. Return item");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	
	
	
	public static Camcorder inputCamcorder() {
		String tag = Helper.readString("Enter asset tag > ");
		String description = Helper.readString("Enter description > ");
		int zoom = Helper.readInt("Enter optical zoom > ");

		Camcorder cc= new Camcorder(tag, description, zoom);
		return cc;
		
	}
	public static void addCamcorder(ArrayList<Camcorder> camcorderList, Camcorder cc) {
		
		camcorderList.add(cc);
		
	}
	
	public static Chromebook inputChromebook() {
		String tag = Helper.readString("Enter asset tag > ");
		String description = Helper.readString("Enter description > ");
		String os = Helper.readString("Enter operating system > ");

		Chromebook cb= new Chromebook(tag, description, os);
		return cb;
		
	}	
	public static void addChromebook(ArrayList<Chromebook> chromebookList, Chromebook cb) {

		chromebookList.add(cb);
		
	}
}
