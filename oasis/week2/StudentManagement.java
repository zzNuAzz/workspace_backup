import java.util.*;
public class StudentManagement {

	Student[] students = new Student[100];
	public static boolean sameGroup(Student s1, Student s2) {
	 	return s1.getGroup().equals(s2.getGroup());
	}
	public void addStudent(Student newStudent) {
		int i = 0;
		while(students[i] != null) i++;
		students[i] = newStudent;
	}
	public String studentsByGroup() {
		HashMap<String, ArrayList<Student> > hashmap = new LinkedHashMap<>();
		int i = 0;
		while(students[i] != null) {
			if(!hashmap.containsKey(students[i].getGroup())) {
				hashmap.put(students[i].getGroup(), new ArrayList<Student>());
				hashmap.get(students[i].getGroup()).add(students[i]);
			}
			else {
				hashmap.get(students[i].getGroup()).add(students[i]);
			}
			i++;
		}
		String out = "";
		Set<String> set = hashmap.keySet();
		for(String group : set) {
			out += group + "\n";
			for(Student student : hashmap.get(group)) 
				out += student.getInfo() + "\n";
		}
		return out;
	}
	public void removeStudent(String id) {
		int i = 0;
		while(i < 100 && students[i] != null && !students[i].getId().equals(id)) i++;
		for(; i < 100 -1 ; i++) {
			students[i] = students[i+1];
			if(students[i+1] == null) break;
			else students[i+1] = null;
		}
	}
}