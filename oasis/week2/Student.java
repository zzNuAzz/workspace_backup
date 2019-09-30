public class Student {
	private String name;
	private String id;
	private String group;
	private String email;

//getter
	public String getName() { 
		return name;
	}
	public String getId() {
		return id;
	}
	public String getGroup() {
		return group;
	}
	public String getEmail() {
		return email;
	}
//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	String getInfo() {
		return String.format("%s - %s - %s - %s", name, id, group, email);
	}

	Student() {
		this.name = "Student";
		this.id = "000";
		this.group = "K62CB";
		this.email = "uet@vnu.edu.vn";
	}

	Student(String name, String id, String email) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.group = "K62CB";
	}
	Student(Student s) {
		this.name = s.name;
		this.id = s.id;
		this.group = s.group;
		this.email = s.email;
	}
	
}