package object;

class Book implements Cloneable{
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + ", "  + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}


public class ToStringTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Book book = new Book("토지", "박경리");
		
		// book 은 object의 풀네임.주소가 나오고 String은 문자열이 나오는 이유는
		// String 클래스의 생성자에 정의된 toString 메서드가 호출되는 것임.
		System.out.println(book);
		
		String str = new String("토지");
		System.out.println(str);
		
		System.out.println(str.toString());
		

		// clone() 메서드 
		// => 복사본을 만듦.
		// Object 타입으로 반환되므로 타입캐스팅해줘야함.
		// Exception 처리
		Book book2 = (Book)book.clone();
		// 이대로 사용하면 에러. 사용하려면 implements Cloneable표시해서 복제가능하다는것을 표시
		System.out.println(book2);
		
		// finalize() 메서드
		// => 직접 호출되는 메서드는 아니고 가비지 콜렉터에서 호출되는 메서드.
		//    인스턴스가 힙메모리에서 해제될 때 가비지 컬렉터에서 수행.
		//  ex))) 리소스 해제, 소켓 닫기 등.

	}	
	
}