package thisex;
// this 예제
public class Person {
	String name;
	int age;
	
	// 생성자: 인스턴스 생성시 인스턴스 초기화
	public Person() {
		// this.name = "이름없음"
		// 대신에 아래와 같이 사용.
		
		// age = 100; // 다른 생성자를 호출할 때 다른 statement를 올수 없다 
		this("이름없음", 1); // 다른 생성자 호출이 first statement여야함
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println(name + "," + age);
	}
	
	public Person getSelf() {
		return this;
	}
}
