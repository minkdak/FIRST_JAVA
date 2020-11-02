package array;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubjcet("국어", 100);
		studentLee.addSubjcet("수학", 90);
		
		Student studentKim= new Student(1002, "Kim");
		studentKim.addSubjcet("국어", 100);
		studentKim.addSubjcet("수학", 90);
		studentKim.addSubjcet("영어", 80);
		
		studentLee.showStudentInfo();
		System.out.println("===============================");
		studentKim.showStudentInfo();
		
		
	}

}
