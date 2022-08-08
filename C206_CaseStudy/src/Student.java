
public class Student{
	private String sName;
	private char sGender;
	private String sEmail;
	private String sDOB;
	private String sCountry;
	private String sInterest;
	
	public Student(String sName, char sGender, String sEmail, String sDOB, String sCountry, String sInterest) {
		this.sName = sName;
		this.sGender = sGender;
		this.sEmail = sEmail;
		this.sDOB = sDOB;
		this.sCountry = sCountry;
		this.sInterest = sInterest;
	}
	
	public String getsName() {
		return sName;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public char getsGender() {
		return sGender;	
	}
	
	public void setsGender(char sGender) {
		this.sGender = sGender;
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
		String userInfo = String.format("%-63s %-20s %-20s %-20s %-20s", sName, sGender, sEmail, sDOB, sCountry, sInterest);
		return userInfo;
	}
}
