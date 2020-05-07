package com.saurav.it.repo;

import java.util.List;

import com.saurav.it.entity.Books;

public interface BookRepo1 {
	public List<Books>findTop3ByBookName(String name);
	 
	public List<Books>findBookName(String name);
	
	public Books findBookId(Integer  id);

}
