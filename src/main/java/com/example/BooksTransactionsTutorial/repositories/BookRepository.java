package com.example.BooksTransactionsTutorial.repositories;

import com.example.BooksTransactionsTutorial.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {
}
