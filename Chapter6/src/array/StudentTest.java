package array;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubjcet("����", 100);
		studentLee.addSubjcet("����", 90);
		
		Student studentKim= new Student(1002, "Kim");
		studentKim.addSubjcet("����", 100);
		studentKim.addSubjcet("����", 90);
		studentKim.addSubjcet("����", 80);
		
		studentLee.showStudentInfo();
		System.out.println("===============================");
		studentKim.showStudentInfo();
		
		
	}

}
