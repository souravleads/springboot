package com.saurav.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saurav.it.entity.Books;
import com.saurav.it.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookservice;
	@GetMapping("/book")
	public  List<Books>getAllBooks(){
		return bookservice.getAllBooks();
	}
	
	@GetMapping("/book/{bookid}")
	public Books getBooks(@PathVariable("bookid")int bookid) {
		return bookservice.getBooksById(bookid);
	}

	/*	@DeleteMapping("/book/{bookid}")
 private void deleteBook(@PathVariable("bookid") int bookid)   
	{  
	bookservice.delete(bookid);  
	}*/  
	
	
	@PostMapping("/books")
	public int saveBooks(@RequestBody Books book) {
		bookservice.saveorupdate(book);
		return book.getBookid();
	}
	
	@PutMapping("/books")
	public Books update(@RequestBody Books book) {
		return book;
	}
	
}
