package com.saurav.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	@GetMapping("/book")//
	public  List<Books>getAllBooks(){
		
		 
		return bookservice.getAllBooks();
	}
	
	@GetMapping("/book/{bookid}")
	public Books getBooks(@PathVariable("bookid")int bookid) {
		return bookservice.getBooksById(bookid);
	}

	 	@DeleteMapping("/book/{bookid}")
 private void deleteBook(@PathVariable("bookid") int bookid)   
	{  
	bookservice.delete(bookid);  
	}   
	
	
	@PostMapping("/books")
	public int saveBooks(@RequestBody Books book) {
		bookservice.saveorupdate(book);
		return book.getBookid();
	}
	
	@PutMapping("/books")
	public Books update(@RequestBody Books book) {
		return book;
	}
	
	//--------------this is method implementation-----------------------------------
	
	@GetMapping("/book/{bookname}")
	public Books getfindTop3ByBookName(@PathVariable("name")String name) {
		bookservice.findTop3ByBookName("name");
		return  getfindTop3ByBookName(name); 
	}
	
	@GetMapping("/book/{bookname}")
 	public Books getfindBookName(@PathVariable("name")String name) {
 		 bookservice.findBookName(name);
 		 return getfindBookName(name);
 	}
	 	 

	
 		
 		
 		@GetMapping("/book/{bookid}")
	public Books getfindBookId(Integer id) {
	return	bookservice.findBookId(id);
	 
	
	
	}
	
	
 
}
