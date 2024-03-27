package com.example.book.server;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.entity.Book;
import com.example.book.respository.BookRespository;

@Service
public class BookServerImp implements BookServer {
	@Autowired
	BookRespository bookRespository;
	
	public List<Book> findAllBook() {
		List<Book> books= new ArrayList<>();
		books = bookRespository.findAll();
		System.out.println(books);
		return books;
		// TODO Auto-generated method stub
		

	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bookRespository.save(book);
	}
	
}
