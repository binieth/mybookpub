package com.biniyamyonas.mybookpub.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biniyamyonas.mybookpub.models.Book;
import com.biniyamyonas.mybookpub.repositories.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Resource
	BookRepository bookRepo;

	@GetMapping("")
	public Collection<Book> getBooks() {
		return (Collection<Book>) bookRepo.findAll();
	}
}
