package com.saurav.it.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.saurav.it.entity.Books;

public interface BookRepo extends CrudRepository<Books,Integer>,BookRepo1 {
	 
	 /* public List<Books>findTop3ByBookName(String name);
		 
		public List<Books>findBookName(String name);
		
		public List<Books>findBookId(String id);
	*/	 
	
}
