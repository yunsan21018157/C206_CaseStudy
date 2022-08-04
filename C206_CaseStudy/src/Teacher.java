
public class Teacher {
	private String name;
	private String gender;
	private String email;
	private String qualification;
	private String subjectGroup;

	public Teacher(String name, String gender, String email, String qualification, String subjectGroup) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.qualification=qualification;
		this.subjectGroup=subjectGroup;
	}
	
	public String toString() {
		
		String teacherInfo = String.format("%-10s %-10s %-10s %-10s %-10s",
				name,
				gender,
				email,
				qualification,
				subjectGroup);
		return teacherInfo;
	}
	
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public String getQualification() {
		return qualification;
	}

	public String getSubjectGrp() {
		return subjectGroup;
	
}

}
