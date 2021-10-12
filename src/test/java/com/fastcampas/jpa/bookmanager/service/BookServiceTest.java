package com.fastcampas.jpa.bookmanager.service;

import com.fastcampas.jpa.bookmanager.domain.Book;
import com.fastcampas.jpa.bookmanager.repository.AuthorRepository;
import com.fastcampas.jpa.bookmanager.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Test
    void transationTest() {
        try {
            bookService.putBookAndAuthor();
//            bookService.put();
        } catch (RuntimeException e) {
            System.out.println(">>> " + e.getMessage());
        }

        System.out.println("books : " + bookRepository.findAll());
        System.out.println("authors : " + authorRepository.findAll());
    }

    @Test
    void isolationTest() {
        Book book = new Book();
        book.setName("jpa 강의");

        bookRepository.save(book);

        bookService.get(1L);

        System.out.println(">>> " + bookRepository.findAll());
    }

}