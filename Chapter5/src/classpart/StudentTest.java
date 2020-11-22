package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		studentKim.showStudentInfo();
		
		Student studentChoi = new Student(123, "이름");
		studentChoi.showStudentInfo();
	}

}