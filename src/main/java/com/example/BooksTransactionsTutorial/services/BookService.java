package com.example.BooksTransactionsTutorial.services;

import com.example.BooksTransactionsTutorial.domain.Book;

import java.util.Optional;

public interface BookService {

    boolean isBookExists(Book book);

    Book save(Book book);

    Optional<Book> findById(String isbn);

    Iterable<Book> listBooks();

    void deleteBookById(String isbn);

}
