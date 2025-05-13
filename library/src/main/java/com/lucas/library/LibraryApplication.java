package com.lucas.library;

import com.lucas.library.model.Book;
import com.lucas.library.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(BookRepository repository) {
		return args -> {
			repository.save(new Book(null, "The Hobbit", "J.R.R. Tolkien", "978-0261102217", true));
			repository.save(new Book(null, "1984", "George Orwell", "978-0451524935", true));
		};
	}
}
