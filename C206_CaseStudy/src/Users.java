
public class Users {
	private String name;
	private char gender;
	

	public Users(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public String toString() {
		String userInfo = String.format("-10s %-30s %-10s ", name, gender);
	return userInfo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;	
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
