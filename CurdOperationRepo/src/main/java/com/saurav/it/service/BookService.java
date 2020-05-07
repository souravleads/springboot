package com.saurav.it.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saurav.it.entity.Books;
import com.saurav.it.repo.BookRepo;
import com.saurav.it.repo.BookRepo1;

@Service
public class BookService implements  BookRepo1 {
	@Autowired
	BookRepo bookrepo;
	
	
	public List<Books>getAllBooks(){
	List<Books>books=new ArrayList<Books>();
		bookrepo.findAll().forEach(books1->books.add(books1));
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
//-----------This is custom method---------------------------------

	@Override
	public List<Books> findTop3ByBookName(String name) {
		 
		return  bookrepo.findTop3ByBookName(name);
	}

	@Override
	public List<Books> findBookName(String name) {
	 
		return bookrepo.findBookName(name);
	}

	@Override
	public Books findBookId(Integer id) {
	 
		return bookrepo.findBookId(id);
	}
	 	
    	 
	
	
}
