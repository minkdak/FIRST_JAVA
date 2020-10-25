package classpart;

public class Student {
	// private 외부에서 람조 자체가 안됨.
	// 클래스 내부에서만 참조 가능
	public int studentID;
	public String studentName;
	public String address;
	
	// 디폴트 생성자
	public Student() {}
	
	// 생성자 여러개 가능 => 생성자 오버로딩
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소없음";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	// 클래스의 main 함수는 메서드로 보지 않는다.
	// 그저 소스를 구동하기 위한 함수.
}
