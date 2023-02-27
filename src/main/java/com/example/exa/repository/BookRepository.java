package com.example.exa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exa.Models.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
