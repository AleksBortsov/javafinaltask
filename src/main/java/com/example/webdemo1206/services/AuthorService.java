package com.example.webdemo1206.services;

import com.example.webdemo1206.entities.Author;
import com.example.webdemo1206.repositories.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {
    private AuthorRepository repository;

    public List<Author> getAuthors() {
        return repository.findAll();
    }
}
