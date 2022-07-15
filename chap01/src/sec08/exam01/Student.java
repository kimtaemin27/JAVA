package sec08.exam01;

public class Student extends People {
	
	public int studentNo;
	
	public Student(String name, String ssn, int StudentNo) {
		super(name, ssn);
		this.studentNo = StudentNo;
	}

}
