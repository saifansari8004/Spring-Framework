package in.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Book 
{
	private long book_id;
	private String book_title;
	@Autowired
	private Author author;
	@Autowired
	private Publisher publisher;
	
	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public void display()
	{
		System.out.println("ID : "+book_id);
		System.out.println("Title : "+book_title);
		System.out.println("Author : "+author);
		System.out.println("Publisher : "+publisher);
	}
}
