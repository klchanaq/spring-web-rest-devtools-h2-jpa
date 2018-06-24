package com.example.webrestdevtoolsh2jpa.repository;

import com.example.webrestdevtoolsh2jpa.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
