package com.example.exa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.exa.Models.Author;
import com.example.exa.Models.Book;
import com.example.exa.repository.AuthorRepository;
import com.example.exa.repository.BookRepository;

@EnableJpaRepositories
@SpringBootApplication
public class ExaApplication implements CommandLineRunner {


	@Autowired
	AuthorRepository authorRepository;

	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		if ( this.authorRepository.count() > 0 ) {
			return;
		}

		Book nb =new Book();
		nb.setTitle("The Hobbit");

		Book nb2 =new Book();
		nb2.setTitle("The Lord of the Rings");


		Author author = new Author();
		author.setName("J.R.R. Tolkien");
		
		author.getBooks().add(nb);
		author.getBooks().add(nb2);

		this.authorRepository.save(author);


		
	}

}
