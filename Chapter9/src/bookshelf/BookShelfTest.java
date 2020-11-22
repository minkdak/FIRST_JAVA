package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		// 타입은 기능 적인 면을 우선한다고하면 인터페이스 타입으로 선언을 많이함.
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("태백산맥1");
		bookQueue.enQueue("태백산맥2");
		bookQueue.enQueue("태백산맥3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());

	}

}
