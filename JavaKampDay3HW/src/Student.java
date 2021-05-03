
public class Student extends User {
	private int studentNo;
	private String courses;
	
	public Student(int userid, String name, String email, String password, int studentNo, String courses) {
		super(userid, name, email, password);
		this.studentNo = studentNo;
		this.courses = courses;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}
}
