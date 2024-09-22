package in.main;

import in.beans.Author;
import in.beans.Book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.res.JavaConfig;

public class Main 
{
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//Book book = context.getBean(Book.class);
		//book.display();
		
		Author author = context.getBean(Author.class);
		author.display();
	}
}
