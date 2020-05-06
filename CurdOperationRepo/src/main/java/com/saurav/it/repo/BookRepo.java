package com.saurav.it.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.saurav.it.entity.Books;

public interface BookRepo extends CrudRepository<Books,Integer> {
	 
}
