package com.biniyamyonas.mybookpub;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.biniyamyonas.mybookpub.models.Author;
import com.biniyamyonas.mybookpub.models.Book;
import com.biniyamyonas.mybookpub.models.Comment;
import com.biniyamyonas.mybookpub.repositories.AuthorRepository;
import com.biniyamyonas.mybookpub.repositories.BookRepository;

@Service
public class Initializer implements CommandLineRunner {
	
	@Resource
	BookRepository bookRepo;
	
	@Resource
	AuthorRepository authorRepo;

	@Override
	public void run(String... args) throws Exception {
		Author Tsegaye = authorRepo.save(new Author("Tsegaye", "G/Medhin"));
		Author Biniyam = authorRepo.save(new Author("Biniyam", "Yonas"));
		
		Book book1 = bookRepo.save(new Book("Book1", "Book1 description", Tsegaye));
		bookRepo.save(new Book("Book2", "Book2 description", Biniyam));
		bookRepo.save(new Book("Book3", "Book3 description", Tsegaye));
		bookRepo.save(new Book("Book4", "Book4 description", Biniyam));
		bookRepo.save(new Book("Book5", "Book5 description", Tsegaye));
		bookRepo.save(new Book("Book6", "Book6 description", Biniyam));
		bookRepo.save(new Book("Book7", "Book7 description", Tsegaye));
		
		Comment comment1 = new Comment("This is a comment1!");
		Comment comment2 = new Comment("This is a comment2!");
		Comment comment3 = new Comment("This is a comment3!");
		Comment comment4 = new Comment("This is a comment4!");
		Comment comment5 = new Comment("This is a comment5!");
		Comment comment6 = new Comment("This is a comment6!");
		Comment comment7 = new Comment("This is a comment7!");
		
		book1.addComment(comment2);
		book1.addComment(comment3);
		book1.addComment(comment4);
		bookRepo.save(book1);
		
		Tsegaye.addComment(comment1);
		Tsegaye.addComment(comment5);
		Tsegaye.addComment(comment6);
		Tsegaye.addComment(comment7);
		authorRepo.save(Tsegaye);
	}

}