package in.res;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.beans.Author;
import in.beans.Book;
import in.beans.Publisher;


@Configuration
public class JavaConfig 
{
	@Bean
	public Publisher createPublisher()
	{
		Publisher publisher = new Publisher();
		publisher.setAuth_id(17654);
		publisher.setName("NCERT Publication");
		return publisher;
	}
	
	@Bean
	public Author createAuthor()
	{
		Author author = new Author();
		author.setAuth_id(98765);
		author.setAuth_name("Tagore");
		List<String> list = new ArrayList<String>();
		list.add("Tare Zameen par");
		list.add("3 Idiots");
		list.add("Chandrayan");
		list.add("Fukrey");
		author.setBooks(list);
		return author;
	}
	
	@Bean
	public Book createBook()
	{
		Book book = new Book();
		book.setBook_id(876554);
		book.setBook_title("Tare Zameen Par");
//		book.setAuthor(createAuthor());
//		book.setPublisher(createPublisher());
		return book;
	}
}
