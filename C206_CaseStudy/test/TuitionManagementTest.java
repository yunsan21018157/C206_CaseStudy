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
	private Registration r1; //yixun
	private Registration r2;
	private Tuition t1; //yunsan
	private Tuition t2; //yunsan
	private managerTimetable mt1; //joseph
	private managerTimetable mt2;
	private ManageTeacher tc1; //jayden
	private ManageTeacher tc2;
	private Student s1; //ahmad
	private Student s2;
	
	private ArrayList<Registration> registrationList; //yixun
	private ArrayList<Tuition> tuitionList; //yunsan
	private ArrayList<managerTimetable> tuitionTimetableList; //joseph
	private ArrayList<ManageTeacher> teacherList; //jayden
	private ArrayList<Student> studentDetailsList; //ahmad


	@Before
	public void setUp() throws Exception {
		t1 = new Tuition("E01B", "Grammar Practice", "English", "Master your grammar", "1 hour", "Basic Level");
		t2 = new Tuition("E02A", "Vocabulary", "English", "Train your vocabulary", "1 hour", "Advanced Level");
	
		mt1 = new managerTimetable("1", "180.0", "01/01/2022", "01/03/2022", "Online");
		mt2 = new managerTimetable("2", "180.0", "01/04/2022", "01/07/2022", "F2F");
		
		r1 = new Registration("1", "1", "student1@gmail.com", "01/03/2022");
		r2 = new Registration("2", "2", "student2@gmail.com", "01/03/2022");
		
		s1 = new Student("John Doe", "M", "student1@gmail.com", "10/01/2000", "Singapore", "Mathematics");
		s2 = new Student("Jane Dane", "F", "student2@gmail.com", "01/10/2000", "Singapore", "Humanities");
		
		tc1 = new ManageTeacher("Jack", "Male", "jack@email.com","Diploma","Math");
		tc2 = new ManageTeacher("Erf", "Male", "erf@email.com","Diploma","Math");
		
		tuitionList = new ArrayList<Tuition>();
		tuitionTimetableList = new ArrayList<managerTimetable>();
		registrationList = new ArrayList<Registration>(); 
		studentDetailsList = new ArrayList<Student>();
		teacherList = new ArrayList<ManageTeacher>();
		
	}
	
	
	//ahmad
	@Test
	public void testAddStudentDetails() { 
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid student details arraylist to add to", studentDetailsList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		TuitionManagement.addStudentDetails(studentDetailsList);
		assertEquals("Check that Student details arraylist size is 1", 1, studentDetailsList.size());
		assertSame("Check that Student is added", s1, studentDetailsList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		TuitionManagement.addStudentDetails(studentDetailsList);
		assertEquals("Check that Camcorder arraylist size is 2", 2, studentDetailsList.size());
		assertSame("Check that Camcorder is added", s2, studentDetailsList.get(1));
	}
	
	@Test
	public void testViewAllStudentDetails() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Students arraylist to retrieve item", studentDetailsList);
		
		//test if the list of Student Details retrieved from the SourceCentre is empty - boundary
		String allStudentDetails = TuitionManagement.viewStudentDetails(studentDetailsList);
		String testOutput = "";
		
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		TuitionManagement.addStudentDetails(studentDetailsList);
		TuitionManagement.addStudentDetails(studentDetailsList);
		assertEquals("Test that Student Details arraylist size is 2", 2, studentDetailsList.size());
		
		//test if the expected output string same as the list of Student Details retrieved from the SourceCentre	
		allStudentDetails= TuitionManagement.viewStudentDetails(studentDetailsList);
		testOutput = String.format("%-15s %-10s %-25s %-15s %-20s\n","John Doe", "M", "student1@gmail.com", "10/01/2000", "Singapore", "Mathematics");
		testOutput += String.format("%-15s %-10s %-25s %-15s %-20s\n","Jane Dane", "F", "student2@gmail.com", "01/10/2000", "Singapore", "Humanities");
	
		assertEquals("Test that ViewAllStudentDetailsList", testOutput, allStudentDetails);
		
	}

	@Test
	public void testDeleteStudentDetails() {
		// Test if tuition list is not null but empty -boundary
		assertNotNull("Test if there is valid Student Details arraylist to retrieve item", studentDetailsList);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 0 - normal
		TuitionManagement.addStudentDetails(studentDetailsList);
		TuitionManagement.addStudentDetails(studentDetailsList);
		
		TuitionManagement.deleteStudentDetails(studentDetailsList);
		TuitionManagement.deleteStudentDetails(studentDetailsList);
		
		assertEquals("Check that Student Details arraylist size is 0", 0, studentDetailsList.size());
		
	}
	
	
	//yixun
	@Test
	public void testAddRegistration() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Registration  arraylist to add to", registrationList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		TuitionManagement.registerTuition(registrationList, "1", "1", "student1@gmail.com", "01/03/2022");
		assertEquals("Check that Registration arraylist size is 1", 1, registrationList.size());
		assertSame("Check that Registration is added", r1, registrationList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		TuitionManagement.registerTuition(registrationList, "2", "2", "student2@gmail.com", "02/03/2022");
		assertEquals("Check that Registration arraylist size is 2", 2, registrationList.size());
		assertSame("Check that Registration is added", r2, registrationList.get(1));
	}
	
	@Test
	public void testViewRegisterTuiton() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Registration arraylist to retrieve item", registrationList);
		String allRegistration = TuitionManagement.viewRegisterTuition(registrationList);
		String testOutput = "";
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		TuitionManagement.registerTuition(registrationList, "1", "1", "student1@gmail.com", "01/03/2022");
		TuitionManagement.registerTuition(registrationList, "2", "2", "student2@gmail.com", "01/03/2022");
		assertEquals("Test that registration arraylist size is 2", 2, registrationList.size());
		
		//test if the expected output string same as the list of registrations retrieved from the SourceCentre	
		allRegistration= TuitionManagement.viewRegisterTuition(registrationList);
		testOutput = String.format("%-20s %-20s %-25s %-20s %-20s\n", "1", "1", "student1@gmail.com", "", "01/03/2022");
		testOutput += String.format("%-20s %-20s %-25s %-20s %-20s\n", "2", "2", "student2@gmail.com", "", "01/03/2022");
	
	
		assertEquals("Test that testViewRegisterTuiton", testOutput, allRegistration);
		
			
	}
	
	@Test
	public void testdeleteRegisterTuition() {
		// Test if tuition list is not null but empty -boundary
		assertNotNull("Test if there is valid Tuition arraylist to retrieve item", tuitionList);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 0 - normal
		TuitionManagement.registerTuition(registrationList, "1", "1", "student1@gmail.com", "01/03/2022");
		TuitionManagement.registerTuition(registrationList, "2", "2", "student2@gmail.com", "02/03/2022");
		
		TuitionManagement.deleteRegisterTuition(registrationList);
		TuitionManagement.deleteRegisterTuition(registrationList);
		
		assertEquals("Check that Tuition arraylist size is 0", 0, tuitionList.size());
		
	}

	//joseph
		@Test
		 public void testAddTuitionTimetable() {
		  assertNotNull("Make sure there is no empty tuition timetable list", tuitionTimetableList);
		  
		  TuitionManagement.addTuitionTimetable(tuitionTimetableList);
		  assertEquals("Check that tuition timetable arrayList size is 2", 2, tuitionTimetableList.size());
		  assertSame("Check that a tuition timetable has been aded.", mt1, tuitionTimetableList.get(0));
		  
		  TuitionManagement.addTuitionTimetable(tuitionTimetableList);
		  assertEquals("Check that Registration arraylist size is 2", 2, registrationList.size());
		  assertSame("Check that Registration is added", r2, registrationList.get(1));
		 }
		 
		 
	  @Test
	  public void testViewTuitionTimetable() {
			// Test if Item list is not null but empty -boundary
		assertNotNull("Make sure there is no empty tuition timetable list", tuitionTimetableList);
		String allTuitionTimetable = TuitionManagement.viewTuitionTimetable(tuitionTimetableList);
		String testOutput = "";
			
		TuitionManagement.addTuitionTimetable(tuitionTimetableList);
		TuitionManagement.addTuitionTimetable(tuitionTimetableList);
		assertEquals("Test that registration arraylist size is 2", 2, registrationList.size());
			
		//test if the expected output string same as the list of registrations retrieved from the SourceCentre	
		allTuitionTimetable= TuitionManagement.viewRegisterTuition(registrationList);
		testOutput = String.format("%-15s %-10s %-15s %-15s %-20s\n", "1", "180.0", "01/01/2022", "01/03/2022", "Online");
		testOutput += String.format("%-15s %-10s %-15s %-15s %-20s\n", "2", "180.0", "01/04/2022", "01/07/2022", "F2F");
		
		assertEquals("Test that testViewRegisterTuiton", testOutput, allTuitionTimetable);
	 }
		 
		 @Test
		public void testDeleteTuitionTimetable() {
			assertNotNull("Test if there is valid Tuition arraylist to retrieve item", tuitionList);
				
			TuitionManagement.addTuitionTimetable(tuitionTimetableList);
			TuitionManagement.addTuitionTimetable(tuitionTimetableList);
				
			TuitionManagement.deleteTuitionTimetable(tuitionTimetableList);
			TuitionManagement.deleteTuitionTimetable(tuitionTimetableList);
				
			assertEquals("Check that Tuition arraylist size is 0", 0, tuitionList.size());
		 }
		 
	
	//yunsan
	@Test
	public void testAddTuitionInformation() {
		// Tuition list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Tuition arraylist to add to", tuitionList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		TuitionManagement.addTuitionInformation(tuitionList);
		assertEquals("Check that Tuition arraylist size is 1", 1, tuitionList.size());
		assertSame("Check that Tuition is added", t1, tuitionList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		TuitionManagement.addTuitionInformation(tuitionList);
		assertEquals("Check that Tuition arraylist size is 2", 2, tuitionList.size());
		assertSame("Check that Tuition is added", t2, tuitionList.get(1));
	}
	
	@Test
	public void testRetrieveTuitionInformation() {
		// Test if tuition list is not null but empty -boundary
		assertNotNull("Test if there is valid Tuition arraylist to retrieve item", tuitionList);
		
		//test if the list of tuitions retrieved from the SourceCentre is empty - boundary
		String allTuition= TuitionManagement.retrieveTuition(tuitionList);
		String testOutput = "";
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		TuitionManagement.addTuitionInformation(tuitionList);
		TuitionManagement.addTuitionInformation(tuitionList);
		assertEquals("Test that tuition arraylist size is 2", 2, tuitionList.size());
		
		//test if the expected output string same as the list of tuition retrieved from the SourceCentre	
		allTuition= TuitionManagement.retrieveTuition(tuitionList);
		testOutput = String.format("%-10s %-20s %-15s %-25s %-20s %-10s\n", "CODE", "TITLE", "NAME", "DESCRIPTION", "DURATION", "PRE-REQUISITE");
		testOutput += String.format("%-10s %-20s %-15s %-25s %-20s %-10s\n", "CODE", "TITLE", "NAME", "DESCRIPTION", "DURATION", "PRE-REQUISITE");
	
		assertEquals("Test that ViewAllTuitionlist", testOutput, allTuition);
	}
	
	@Test
	public void testDeleteTuition() {
		// Test if tuition list is not null but empty -boundary
		assertNotNull("Test if there is valid Tuition arraylist to retrieve item", tuitionList);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 0 - normal
		TuitionManagement.addTuitionInformation(tuitionList);
		TuitionManagement.addTuitionInformation(tuitionList);
		
		TuitionManagement.deleteTuition(tuitionList); 
		TuitionManagement.deleteTuition(tuitionList);
		
		assertEquals("Check that Tuition arraylist size is 0", 0, tuitionList.size());
		
	}

	//jayden
	@Test
	 public void testAddTeacher() {
	  assertNotNull("Test if there is valid Teacher arraylist to add to", teacherList);
	  
	  //Given an empty list, after adding 1 item, the size of the list is 1
	  TuitionManagement.addTeacher(teacherList);  
	  assertEquals("Test if that Teacher arrayList size is 1?", 1, teacherList.size());
	  
	  //The item just added is as same as the first item of the list
	  assertSame("Test that Teacher is added same as 1st item of the list?", t1, teacherList.get(0));
	  
	  //Add another item. test The size of the list is 2?
	  TuitionManagement.addTeacher(teacherList);
	  TuitionManagement.addTeacher(teacherList);
	  assertEquals("Test that Teacher arraylist size is 3?", 3, teacherList.size());
	  assertSame("Test that teacher is added same as 3rd item of the list?", t2, teacherList.get(1));
	 }

	
	 @Test
	 public void testRetrieveAllTeachers() {
	  // Test if Item list is not null but empty, so that can add a new item
	  assertNotNull("Test if there is valid Teacher arraylist to add to", teacherList);
	  
	  //test if the list of teachers retrieved from the TuitionManager is empty
	  String allTeachers = TuitionManagement.retrieveAllTeacher(teacherList);
	  String testOutput = "";
	    
	  //Given an empty list, after adding 2 items, test if the size of the list is 2
	  TuitionManagement.addTeacher(teacherList);
	  TuitionManagement.addTeacher(teacherList);
	  assertEquals("Test if that Teacher arraylist size is 2?", 2, teacherList.size());
	  
	  //test if the expected output string same as the list of camcorders retrieved from the SourceCentre
	  allTeachers = TuitionManagement.retrieveAllTeacher(teacherList);

	  testOutput = String.format("%-10s %-10s %-10s %-10s %-10s\n","Jack", "Male", "jack@email.com","Diploma","Math");
	  testOutput += String.format("%-10s %-10s %-10s %-10s %-10s\n","Erf", "Male", "erf@email.com","Diploma","Math");
	 
	  assertEquals("Check that ViewAllTeacherlist", testOutput, allTeachers);
	  
	 }
	 
	 @Test
	 public void testDeleteTeacher() {
	 // Test if teacher list is not null but empty -boundary
	 assertNotNull("Test if there is valid Tuition arraylist to retrieve item", tuitionList);
	   
	 //Given an empty list, after adding 2 items, test if the size of the list is 0 - normal
	 TuitionManagement.addTeacher(teacherList);
	 TuitionManagement.addTeacher(teacherList);
	 
	 TuitionManagement.deleteTeacher(teacherList);
	 TuitionManagement.deleteTeacher(teacherList);
	   
	 assertEquals("Check that Teacher arraylist size is 0", 0, teacherList.size());
	   
	 }


	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
