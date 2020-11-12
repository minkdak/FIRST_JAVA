package staticex;

public class Company {
	
	// 유일한 인스턴스 생성
	private static Company instance = new Company();
	
	// 외부에서 사용할 수 없음
	private Company() {}
	
	// 외부에서 쓰게하려면..
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
