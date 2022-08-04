import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Sze Yunsan
 * Student ID: 21018157
 * Class: W64N
 * Date/Time created: Thursday 04-08-2022 13:47
 */

/**
 * @author 21018157

 *
 */
public class TuitionManagementTest {
	private Registration r1;
	private Registration r2;
	private Tuition t1;
	private Tuition t2;
	private TuitionTimetable tt1;
	private TuitionTimetable tt2;
	
	private ArrayList<Registration> registrationList; 
	private ArrayList<Tuition> tuitionList;
	private ArrayList<TuitionTimetable> tuitionTimetableList;
	
//	public TuitionManagementTest() {
///		super();
		
	@Before
	public void setUp() throws Exception {
		t1 = new Tuition("E01B", "Grammar Practice", "English", "Master your grammar", "1 hour", "Basic Level");
		t2 = new Tuition("E02A", "Vocabulary", "English", "Train your vocabulary", "1 hour", "Advanced Level");
	
		tt1 = new TuitionTimetable(1, 180.0, "01/01/2022", "01/03/2022", "Online");
		tt2 = new TuitionTimetable(2, 180.0, "01/04/2022", "01/07/2022", "F2F");
		
		r1 = new Registration(1, 1, "student1@gmail.com", "01/03/2022");
		r2 = new Registration(2, 2, "student2@gmail.com", "01/03/2022");
		
		tuitionList = new ArrayList<Tuition>();
		tuitionTimetableList = new ArrayList<TuitionTimetable>();
		registrationList = new ArrayList<Registration>(); 
		
	
	}
	
	@Test
	public void testAddRegistration() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Registration  arraylist to add to", registrationList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		TuitionManagement.registerTuition(registrationList);
		assertEquals("Check that Registration arraylist size is 1", 1, registrationList.size());
		assertSame("Check that Registration is added", r1, registrationList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		TuitionManagement.registerTuition(registrationList);
		assertEquals("Check that Registration arraylist size is 2", 2, registrationList.size());
		assertSame("Check that Registration is added", r2, registrationList.get(1));
	}
	
	@Test
	public void testViewRegisterTuiton() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Registration arraylist to retrieve item", registrationList);
		
		//test if the list of camcorders retrieved from the SourceCentre is empty - boundary
		String allCamcorder= TuitionManagement.retrieveAllCamcorder(registrationList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allCamcorder);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		TuitionManagement.addCamcorder(registrationList, cc1);
		TuitionManagement.addCamcorder(registrationList, cc2);
		assertEquals("Test that Camcorder arraylist size is 2", 2, camcorderList.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre	
		allCamcorder= ResourceCentre.retrieveAllCamcorder(camcorderList);
		testOutput = String.format("%-10s %-30s %-10s %-10s %-20s\n","CC0011", "Nikon HDSLR", "Yes", "", "40");
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20s\n","CC0012", "Sony DSC-RX100M7", "Yes", "", "20" );
	
		assertEquals("Test that ViewAllCamcorderlist", testOutput, allCamcorder);
		
	}
	
	@Test
	public void testDoDeleteRegistration() {
		    Assert.assertNotNull(registrationList.getRegistration(r1));
		    //add a rigorous compare method to make sure contents are the same, i.e. nothing is lost or transmuted incorrectly, ignoring ID if that is autogen
		    //alternatively, you can create a unit test just for Person
		    Assert.assertEquals(person, r1); 

		    //remove the Person
		    personService.deleteFromPerson(person);
		    Assert.assertNull(personService.getPerson(person));

		    //test for exception handling when you try to remove a non-existent person;
		    personService.deleteFromRegistration(person);

		    //test for exception handling when you try to remove null
		    personService.deleteFromPerson(null);
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
