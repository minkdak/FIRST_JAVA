package Chapter6.Book;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(1001, "Lee");
		studentLee.addBook("�¹���1", "������");
		studentLee.addBook("�¹���2", "������");
		
		Student studentKim= new Student(1002, "Kim");
		studentKim.addBook("����1", "�ڰ渮");
		studentKim.addBook("����2", "�ڰ渮");
		studentKim.addBook("����3", "�ڰ渮");
		
		Student studentChoi = new Student(1003, "Choi");
		studentChoi.addBook("�ظ�����1", "���� �Ѹ�");
		studentChoi.addBook("�ظ�����2", "���� �Ѹ�");
		studentChoi.addBook("�ظ�����3", "���� �Ѹ�");
		studentChoi.addBook("�ظ�����4", "���� �Ѹ�");
		studentChoi.addBook("�ظ�����5", "���� �Ѹ�");
		studentChoi.addBook("�ظ�����6", "���� �Ѹ�");
	
		studentLee.showBookInfo();
		studentKim.showBookInfo();
		studentChoi.showBookInfo();
	}

}
