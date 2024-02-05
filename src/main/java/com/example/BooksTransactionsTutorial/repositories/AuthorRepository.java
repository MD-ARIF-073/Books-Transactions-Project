package com.example.BooksTransactionsTutorial.repositories;

import com.example.BooksTransactionsTutorial.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
