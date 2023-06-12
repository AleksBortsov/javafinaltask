package com.example.webdemo1206.repositories;

import com.example.webdemo1206.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}