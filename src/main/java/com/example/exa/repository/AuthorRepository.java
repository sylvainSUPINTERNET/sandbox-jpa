package com.example.exa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exa.Models.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    
}
