package reference;

public class Student {
	int studentID;
	String studentName;
	
	// String이 아닌 다른 참조 변수들은 바로 값을  assign 할수 없다.
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		// 주로 생성자에서 인스턴스 생성
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName+" 학생의 총점은 "+ total + "점입니다.");
	}
}
