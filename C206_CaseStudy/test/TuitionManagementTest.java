import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * @author 21018157

 *
 */
public class TuitionManagementTest {
	private Registration r1;
	private Registration r2;
	private Tuition t1;
	private Tuition t2;
	private managerTimetable tt1;
	private managerTimetable tt2;
	
	private ArrayList<Registration> registrationList; 
	private ArrayList<Tuition> tuitionList;
	private ArrayList<managerTimetable> tuitionTimetableList;
	
//	public TuitionManagementTest() {
///		super();
		
	@Before
	public void setUp() throws Exception {
		t1 = new Tuition("E01B", "Grammar Practice", "English", "Master your grammar", "1 hour", "Basic Level");
		t2 = new Tuition("E02A", "Vocabulary", "English", "Train your vocabulary", "1 hour", "Advanced Level");
	
		tt1 = new managerTimetable(1, 180.0, "01/01/2022", "01/03/2022", "Online");
		tt2 = new managerTimetable(2, 180.0, "01/04/2022", "01/07/2022", "F2F");
		
		r1 = new Registration(1, 1, "student1@gmail.com", "01/03/2022");
		r2 = new Registration(2, 2, "student2@gmail.com", "01/03/2022");
		
		tuitionList = new ArrayList<Tuition>();
		tuitionTimetableList = new ArrayList<managerTimetable>();
		registrationList = new ArrayList<Registration>(); 
		
	}
	
	@Test
	public void testAddTuitionTimetable() {
		assertNotNull("Make sure there is no empty tuition timetable list", tuitionTimetableList);
		
		TuitionManagement.addTuitionTimetable(tuitionTimetableList);
		assertEquals("Check that tuition timetable arrayList size is 2", 2, tuitionTimetableList.size());
		assertSame("Check that a tuition timetable has been aded.", tt1, tuitionTimetableList.get(0));
		
		TuitionManagement.addTuitionTimetable(tuitionTimetableList);
		assertEquals("Check that Registration arraylist size is 2", 2, registrationList.size());
		assertSame("Check that Registration is added", r2, registrationList.get(1));
	}
	
	@Test
	public void testViewTuitionTimetable() {
		assertNotNull("Make sure there is no empty tuition timetable list", tuitionTimetableList);
		
		allTuitionTimetable = TuitionManagement.viewTuitionTimetable(tuitionTimetableList);
		String testOutput = String.format("%-10d %-10s %-10s %-10s %-10s\n", 1, 10.00, "20/2/2022", "31/5/2022", "Online");
		testOutput += String.format("%-10d %-10s %-10s %-10s %-10s\n", 1, 10.00, "20/2/2022", "31/5/2022", "Online");
		
		assertEquals("Check that output and allTuitionTimetable displays the same items.", testOutput, allTuitionTimetable);
	}
	
	@Test public void testDeleteTuitionTimetable() {
		assertNotNull("Make sure there is no empty tuition timetable list", tuitionTimetableList);
		
		allTuitionTimetable = TuitionManagement.viewTuitionTimetable(tuitionTimetableList);
		deleteOneTuitionTimetable = TuitionManagement.viewTuitionTimetable(tuitionTimetableList - 1);
		
		assertEquals("Check that allTuitionTimetable and deleteOneTuitionTimetable displays the same number of items.", allTuitionTimetable, deleteOneTuitionTimetable);
	}
	
	@Test
	public void testAddRegistration() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Registration  arraylist to add to", registrationList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		TuitionManagement.addRegistration(registrationList);
		assertEquals("Check that Registration arraylist size is 1", 1, registrationList.size());
		assertSame("Check that Registration is added", r1, registrationList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		TuitionManagement.addRegistration(registrationList);
		assertEquals("Check that Registration arraylist size is 2", 2, registrationList.size());
		assertSame("Check that Registration is added", r2, registrationList.get(1));
	}
	
	@Test
	public void viewRegisterTuiton() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Registration arraylist to retrieve item", registrationList);
		
		//test if the expected output string same as the list of registrations retrieved from the SourceCentre	
		allRegistration= TuitionManagement.viewRegisterTuiton(registrationList);
		testOutput = String.format("%-10d %-30s %-10s %-10s %-20s\n",1, 1, "student1@gmail.com", "01/03/2022");
		testOutput += String.format("%-10d %-30s %-10s %-10s %-20s\n",2, 2, "student2@gmail.com", "01/03/2022");
	
	
		assertEquals("Test that ViewAllCamcorderlist", testOutput, allRegistrations);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
