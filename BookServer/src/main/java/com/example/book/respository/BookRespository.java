package com.example.book.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.book.entity.Book;

public interface BookRespository extends JpaRepository<Book, Integer> {

}
