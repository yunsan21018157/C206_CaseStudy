
public class tuitionTimetable {
	public class managerTimetable {
		
		private int ttId;
		private double price;
		private String start_date;
		private String end_date;
		private String mode;
		
		public managerTimetable(int ttId, double price, String start_date, String end_date, String mode) {
			super();
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
}
