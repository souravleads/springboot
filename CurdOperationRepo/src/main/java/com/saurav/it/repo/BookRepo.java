package com.saurav.it.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saurav.it.entity.Books;

@Repository
public interface BookRepo extends CrudRepository<Books,Integer> {
	 
}
