
public class Student extends Users{
	private String sEmail;
	private String sDOB;
	private String sCountry;
	private String sInterest;
	
	public Student(String name, char gender, String sEmail, String sDOB, String sCountry, String sInterest) {
		super(name, gender);
		this.sEmail = sEmail;
		this.sDOB = sDOB;
		this.sCountry = sCountry;
		this.sInterest = sInterest;
	}
	
	public String getsEmail() {
		return sEmail;
	}
	
	public void setsEmail() {
		this.sEmail = sEmail;
	}
	
	public String getsDOB() {
		return sDOB;
	}
	
	public void setsDOB() {
		this.sDOB = sDOB;
	}
	
	public String getsCountry() {
		return sCountry;
	}
	
	public void setsCountry() {
		this.sCountry = sCountry;
	}

	public String getsInterest() {
		return sInterest;
	}
	
	public void setsInterest() {
		this.sInterest = sInterest;
	}
	
	public String toString() {
		String output = super.toString();
		output = String.format("%-63s %-20s %-20s %-20s %-20s", output, sEmail, sDOB, sCountry, sInterest);
		return output;
	}
}
