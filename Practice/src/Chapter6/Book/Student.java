package Chapter6.Book;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Book> bookList;
	
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.bookList = new ArrayList<Book>();
	}
	
	public void addBook(String title, String author) {
		Book book = new Book(title, author);
		
		bookList.add(book);
	}
	
	public void showBookInfo() {
			String titleListString = bookList.stream().map(c->c.getTitle()).collect(Collectors.joining(" "));
			System.out.println(" 학생이 읽은 책은 : " + titleListString + " 입니다." );
		}
	
	
	
	
}
