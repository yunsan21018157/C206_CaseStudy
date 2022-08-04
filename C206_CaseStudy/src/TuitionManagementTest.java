import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	private Tuition t1;
	private Tuition t2;
	private TuitionTimetable tt1;
	private TuitionTimetable tt2;
	
	private ArrayList<Tuition> tuitionList;
	private ArrayList<TuitionTimetable> tuitionTimetableList;
	
//	public TuitionManagementTest() {
//		super();
		
	@Before
	public void setUp() throws Exception {
		t1 = new Tuition("E01B", "Grammar Practice", "English", "Master your grammar", "1 hour", "Basic Level");
		t2 = new Tuition("E02A", "Vocabulary", "English", "Train your vocabulary", "1 hour", "Advanced Level");
	
		tt1 = new TuitionTimetable(1, 180.0, "01/01/2022", "01/03/2022", "Online");
		tt2 = new TuitionTimetable(2, 180.0, "01/04/2022", "01/07/2022", "F2F");
		
		tuitionList = new ArrayList<Tuition>();
		tuitionTimetableList = new ArrayList<TuitionTimetable>();
	
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
