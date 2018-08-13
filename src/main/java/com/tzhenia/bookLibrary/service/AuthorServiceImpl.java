package com.tzhenia.bookLibrary.service;

import lombok.extern.slf4j.Slf4j;
import com.tzhenia.bookLibrary.model.Author;
import com.tzhenia.bookLibrary.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementations of {@link AuthorService} interface.
 */

@Slf4j
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository customerRepository;

    @Override
    public Author getById(Long id) {
        log.info("IN AuthorServiceImpl getById {}", id);
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Author author) {
        log.info("IN AuthorServiceImpl save {}", author);
        customerRepository.save(author);
    }

    @Override
    public void delete(Long id) {
        log.info("IN AuthorServiceImpl delete {}", id);
        customerRepository.delete(id);
    }

    @Override
    public List<Author> getAll() {
        log.info("IN AuthorServiceImpl getAll");
        return customerRepository.findAll();
    }
}