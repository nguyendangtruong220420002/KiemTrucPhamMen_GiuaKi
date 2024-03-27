package com.example.book.server;

import java.util.List;

import com.example.book.entity.Book;

public interface BookServer {
	public List<Book> findAllBook();

	public void addBook(Book book);
}
