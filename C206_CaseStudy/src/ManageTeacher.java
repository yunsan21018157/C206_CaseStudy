import java.util.ArrayList;

public class ManageTeacher {
	 private String name;
	 private String gender;
	 private String email;
	 private String qualification;
	 private String subjectGroup;
	 
	 public ManageTeacher(String name,String gender, String email,String qualification,String subjectGroup) {
	  this.name = name;
	  this.gender = gender;
	  this.email = email;
	  this.qualification = qualification;
	  this.subjectGroup = subjectGroup;
	  
	 }

	 public String getSubjectGroup() {
	  return subjectGroup;
	 }

	 public void setSubjectGroup(String subjectGroup) {
	  this.subjectGroup = subjectGroup;
	 }

	 public String getName() {
	  return name;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public String getGender() {
	  return gender;
	 }

	 public void setGender(String gender) {
	  this.gender = gender;
	 }

	 public String getEmail() {
	  return email;
	 }

	 public void setEmail(String email) {
	  this.email = email;
	 }

	 public String getQualification() {
	  return qualification;
	 }

	 public void setQualification(String qualification) {
	  this.qualification = qualification;
	 }
	 
	}
	
	
