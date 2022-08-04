/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Sze Yunsan
 * Student ID: 21018157
 * Class: W64N
 * Date/Time created: Thursday 04-08-2022 14:06
 */

/**
 * @author 21018947
 *
 */
//
public class TuitionTimetable {
		
		private int ttId;
		private double price;
		private String start_date;
		private String end_date;
		private String mode;
		
		public TuitionTimetable(int ttId, double price, String start_date, String end_date, String mode) {
			this.ttId = ttId;
			this.price = price;
			this.start_date = start_date;
			this.end_date = end_date;
			this.mode = mode;
		}

		public int getTtId() {
			return ttId;
		}

		public void setTtId(int ttId) {
			this.ttId = ttId;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getStart_date() {
			return start_date;
		}

		public void setStart_date(String start_date) {
			this.start_date = start_date;
		}

		public String getEnd_date() {
			return end_date;
		}

		public void setEnd_date(String end_date) {
			this.end_date = end_date;
		}

		public String getMode() {
			return mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

	}


