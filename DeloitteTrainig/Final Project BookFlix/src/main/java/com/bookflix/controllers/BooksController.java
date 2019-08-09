package com.bookflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookflix.models.Book;
import com.bookflix.services.AddBookService;

@Controller
public class BooksController {

	@Autowired
	AddBookService bookOps;
	
	@RequestMapping(value= "/addBook", method = RequestMethod.GET)
	public String addBook(Model model) {
		model.addAttribute("book",new Book());
		model.addAttribute("message","book added successfully");
	return "addBook";
	}
	
	@RequestMapping(value = "/api/addBook", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute("book") Book book) {
		this.bookOps.addBooks(book);
		return "redirect:/addBook";
	}

}
