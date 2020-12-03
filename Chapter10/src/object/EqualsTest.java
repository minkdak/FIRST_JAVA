package object;

class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj; // 다운 캐스팅
			return this.studentName == std.studentName;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum;
	}
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			String str1 = new String("abc");
			String str2 = new String("abc");
			
			// 물리 비교 보다 논리적 비교를 위해 equals를 사용함
			System.out.println(str1 == str2); // 물리
			System.out.println(str1.equals(str2)); // 논리
			
			Student Lee = new Student(100, "이순신");
			Student Lee2 = Lee;
			Student Shin = new Student(100, "이순신");
			
			System.out.println(Lee == Lee2); // 물리적 주소가 같음 true
			System.out.println(Lee == Shin); // false가 당연
			
			System.out.println(Lee.equals(Shin)); // false가 나오는데 동작을 바꾸고 싶으면 재정의
			
			// equals를 오버라이딩하면 hashCode도 같아 오버라이딩
			System.out.println(Lee.hashCode()); // 인스턴스 주소를 10진수로 반환
			System.out.println(Lee2.hashCode()); // 인스턴스 주소를 10진수로 반환
			*/
			Integer i1 = new Integer(100);
			Integer i2 = new Integer(100);
			
			System.out.println(i1.equals(i2));
			System.out.println(i1.hashCode());
			System.out.println(i2.hashCode());
			
			System.out.println(System.identityHashCode(i1));
			System.out.println(System.identityHashCode(i2));
			
			
			
	}

}
