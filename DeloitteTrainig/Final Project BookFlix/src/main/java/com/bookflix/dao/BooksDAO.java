package com.bookflix.dao;

import org.springframework.data.repository.CrudRepository;

import com.bookflix.models.Book;
import com.bookflix.models.Users;

public interface BooksDAO extends CrudRepository<Book, Integer> {

}
