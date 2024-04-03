package com.example.projecttt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projecttt.model.Book;

public interface BookRepo extends JpaRepository<Book,Integer> {   
}