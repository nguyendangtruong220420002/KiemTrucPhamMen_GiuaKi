package com.example.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book.entity.Book;
import com.example.book.respository.BookRespository;
import com.example.book.server.BookServer;
import com.google.common.base.Optional;

@RestController
@RequestMapping("/api/v2")
public class Bookcontroller {
//	@GetMapping("/book")
//	public String getHello() {
//		return "Hello cac ban nhe";
//	}
	@Autowired
	BookServer bookServer;
	@Autowired
	BookRespository bookRespository;


	@GetMapping("/get")
	public List<Book> getAllBooks() {
		return bookServer.findAllBook();
	}
	// Thêm người dùng vào nhé
	@PostMapping("/add")
	public Book addBook(@RequestBody Book book) {
		bookServer.addBook(book);
		return book;
	}
	// Tim thong tin theo id
		@GetMapping("/get/{id}")
		public Book findByIdBook(@PathVariable Integer id) {
			java.util.Optional<Book> optional = bookRespository.findById(id);
			Book book = null;
			if (optional.isPresent()) {
				book= optional.get();
			} else {
				new RuntimeException("Khong co user theo id này");
			}

			return book;
		}
	
}
