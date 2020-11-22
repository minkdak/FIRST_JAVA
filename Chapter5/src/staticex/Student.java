package staticex;

public class Student {
	private static int serialNum = 1000;
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소없음";
		serialNum++;
		studentID = serialNum;
	}
	
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public static int getSerialNum() {
		int i = 0;
//		studentName = "Lee"; // static 메서드 내에서는 인스턴트 변수를 사용 할 수는 없다.
		// 인스턴스 변수는 new로 인스턴스를 생성해야 생기는 변수이다.
		// static 변수는 인스턴스를 생성하지 않고 사용할 수 있는 변수이다.
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	

}
