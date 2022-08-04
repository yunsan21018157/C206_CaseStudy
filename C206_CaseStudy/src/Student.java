
public class Student extends Users{
	private String sEmail;
	private String sDOB;
	private String sCountry;
	private String sInterest;
	
	public Student(String name, String gender, String sEmail, String sDOB, String sCountry, String sInterest) {
		super(name, gender);
		this.sEmail = sEmail;
		this.sDOB = sDOB;
		this.sCountry = sCountry;
		this.sInterest = sInterest;
	}
	
	public String getsEmail() {
		return sEmail;
	}
	
	public String getsDOB() {
		return sDOB;
	}
	
	public String sCountry() {
		return sCountry;
	}

	public String sInterest() {
		return sInterest;
	}
	
	public String toString() {
		String output = super.toString();
		output = String.format("%-63s %-20s %-20s %-20s %-20s", output, sEmail, sDOB, sCountry, sInterest);
		return output;
	}
}
