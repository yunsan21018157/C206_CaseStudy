/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Sze Yunsan
 * Student ID: 21018157
 * Class: W64N
 * Date/Time created: Thursday 04-08-2022 10:00
 */

/**
 * @author 21018157
 *
 */
public class Tuition {
	private String code;
	private String title;
	private String name;
	private String desc;
	private String duration;
	private String preRequisite;
	
	public Tuition(String code, String title, String name, String desc, String duration, String preRequisite) {
		this.code = code;
		this.title = title;
		this.name = name;
		this.desc = desc;
		this.duration = duration;
		this.preRequisite = preRequisite;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}


	public String getTitle() {
		return title;
	}

	
	public String getName() {
		return name;
	}

	
	public String getDesc() {
		return desc;
	}

	
	public String getDuration() {
		return duration;
	}

	
	public String getPreRequisite() {
		return preRequisite;
	}
	
}
