public class Main {
	public static void main(String[] args) {
		StudentManagement stList = new StudentManagement();
		for(int i = 0; i < 10; i++) {
			Student st = new Student("name"+i, i + "", "email" + i + "@gmail.com");
			st.setGroup("K62CC" );
			stList.addStudent(st);
		}
		for(int i = 0; i < 5; i++) {
			Student st = new Student("name"+i, i + "", "email" + i + "@gmail.com");
			//st.setGroup("k66" );
			stList.addStudent(st);
		}
		stList.removeStudent("2");
		stList.removeStudent("3");
		stList.removeStudent("4");
		stList.removeStudent("6");
		System.out.println(stList.studentsByGroup());
	}
}