package reference;

public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRef studentLee = new StudentRef(100, "Lee"); 
		
		
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 95);
		
		StudentRef studentKim = new StudentRef(101, "Kim");
		studentKim.setKoreaSubject("����", 80);
		studentKim.setMathSubject("����", 99);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}