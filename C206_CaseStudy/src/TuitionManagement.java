import java.util.ArrayList;

public class TuitionManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<TuitionTimeTable> tuitonList = new ArrayList<TuitionTimeTable>();
		
		
	}
	
	public static void role() {
		System.out.println("1 - Student");
		System.out.println("2 - Manager");
		System.out.println("3 - Admin");
		System.out.println("q - Quit program");
		System.out.println("------------------------------");
	}
	
	public static void menuStudent() {
		System.out.println("1 - Register Student Account");
		System.out.println("2 - View Student Account");
		System.out.println("3 - Delete Student Account");
		System.out.println("4 - Register for Tuition");
		System.out.println("5 - View Registered Tuitions");
		System.out.println("6 - Delete Registered Tuitions");
		System.out.println("q - Quit program");
		System.out.println("------------------------------");
	}
	
	public static void menuManager() {
		System.out.println("1 - Add Tuition Timetable");
		System.out.println("2 - View Tuition Timetable");
		System.out.println("3 - Delete Tuition Timetable");
		System.out.println("4 - Add Teacher");
		System.out.println("5 - View Teacher");
		System.out.println("6 - Delete Teacher");
		System.out.println("q - Quit program");
		System.out.println("------------------------------");
	}
	
	public static void menuAdmin() {
		System.out.println("1 - Register Student Account");
		System.out.println("2 - Add Tuition Information");
		System.out.println("3 - View Tuition Information");
		System.out.println("4 - Delete Tuition Information");
		System.out.println("q - Quit program");
		System.out.println("------------------------------");
	}
	
}