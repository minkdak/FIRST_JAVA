package staticex;

public class Company {
	
	// ������ �ν��Ͻ� ����
	private static Company instance = new Company();
	
	// �ܺο��� ����� �� ����
	private Company() {}
	
	// �ܺο��� �����Ϸ���..
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}