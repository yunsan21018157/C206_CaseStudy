
public class Registration {
	private String regId;
	private String ttId;
	private String sEmail;
	private String status; 
	private String date;
	
	public Registration(String regId ,String ttId,String sEmail,String date ) {
		this.regId = regId;
		this.ttId = ttId;
		this.sEmail = sEmail;
		this.status = "";
		this.date = date;
		
	}
	
	public String toString() {
		
		// Write your codes here
		String itemInfo = String.format("%-10d %-30d %-10s %-10s %-10s"),
				regId, 
				ttId,
				status,
				sEmail, 
				date;
		return itemInfo;
	}
	
	public String getRegId() { 
		return regId;
	}
	
	public String getTTId() { 
		return ttId; 
	}
	
	public String getSEmail() { 
		return sEmail;
	}
	public String getStatus() { 
		return status;
	}
	public String getDate() {
		return date;
	}
}
