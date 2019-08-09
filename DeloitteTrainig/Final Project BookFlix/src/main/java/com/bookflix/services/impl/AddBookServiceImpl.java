package com.bookflix.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookflix.dao.BooksDAO;
import com.bookflix.models.Book;
import com.bookflix.services.AddBookService;
@Service
public class AddBookServiceImpl implements AddBookService {
@Autowired
BooksDAO bookDAO;
	
	@Override
	public void addBooks(Book book) {
		
		bookDAO.save(book);
		
		
	}
	
	

}
