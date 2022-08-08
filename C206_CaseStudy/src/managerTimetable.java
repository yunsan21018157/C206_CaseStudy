
public class managerTimetable {
	
	private String ttId;
	private String price;
	private String start_date;
	private String end_date;
	private String mode;
	
	public managerTimetable(String ttId, String price, String start_date, String end_date, String mode) {
		this.ttId = ttId;
		this.price = price;
		this.start_date = start_date;
		this.end_date = end_date;
		this.mode = mode;
	}

	public String getTtId() {
		return ttId;
	}

	public void setTtId(String ttId) {
		this.ttId = ttId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
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
