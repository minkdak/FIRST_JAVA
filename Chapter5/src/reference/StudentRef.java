package reference;

public class StudentRef {
	String studentName;
	int studentAge;
	int studentId;
	SubjectRef koreaSubject;
	SubjectRef mathSubject;
	
	
	public StudentRef(int id, String name) {
		studentName = name;
		studentId = id;
		
		koreaSubject = new SubjectRef();
		mathSubject = new SubjectRef();
	}
	
	public void setKoreaSubject(String name, int score) {
		koreaSubject.subjectScore = score;
		koreaSubject.subjectName = name;
	
	}
	
	public void setMathSubject(String name, int score) {
		mathSubject.subjectScore = score;
		mathSubject.subjectName = name;
	
	}
	
	public void showStudentScore() {
		int total = koreaSubject.subjectScore + mathSubject.subjectScore;
		System.out.println(studentName+" 학생의 총점은 "+ total + "점입니다.");
	}
	
	
	
	
	
}
