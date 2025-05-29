package city.dto;

public class Patient {

	private int pid ;
	private String name;
	private String gender;
	private int age;
	private String disease;
	private String bloodGroup;
	private String mobile;
	
	public Patient() {
		
	}
	
	public Patient(String name, String gender, int age, String disease, String bloodGroup, String mobile) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.disease = disease;
		this.bloodGroup = bloodGroup;
		this.mobile = mobile;
	}



	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}	
	
}
