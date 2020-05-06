package com.saurav.it.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saurav.it.entity.Books;
import com.saurav.it.repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo bookrepo;
	
	public List<Books>getAllBooks(){
		
		List<Books>books=new ArrayList<>();
		bookrepo.findAll().forEach(books::add);
		return books;
	}
	
	public  Books getBooksById(int id) {
		return bookrepo.findById(id).get();
	}
	
	public void  saveorupdate(Books books) {
		bookrepo.save(books);
	}
	
	public void delete(int id) {
		bookrepo.deleteById(id);
		}
}
