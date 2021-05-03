
public class Instructor extends User {
	int instructorNo;
	String branch;
	

	public Instructor(int userid, String name, String email, String password, int instructorNo, String branch) {
		super(userid, name, email, password);
		this.instructorNo = instructorNo;
		this.branch = branch;
		
		
	}


	public int getInstructorNo() {
		return instructorNo;
	}


	public void setInstructorNo(int instructorNo) {
		this.instructorNo = instructorNo;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}
	


}
